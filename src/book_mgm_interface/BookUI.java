package book_mgm_interface;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BookUI extends WindowAdapter implements ActionListener {
	//Field
	
	Frame f;
	Panel menuP, contentP, insertP,selectP,updateP,deleteP;
	String[] names = {"     등록     ","출력","수정","삭제","종료"};
	String[] inputs = {"ISBN","도서명","저자","가격"};
	ArrayList<TextField> tf_list = new ArrayList<TextField>(4);
	String ne;
	BookMgmSystem bms;
	TextField tf_update;
	
	public static final int INSERT = 1;
	public static final int SELECT = 2;
	public static final int UPDATE = 3;
	public static final int DELETE = 4;
	
	//Constructor
	public BookUI() {
		bms = new BookMgmSystem();
		insertP = new Panel();	
		deleteP = new Panel();	
		updateP = new Panel();
		selectP = new Panel();
		f = new Frame();
		menuP = new Panel(new GridLayout(5,1));
		contentP = new Panel();
		
		for(String name : names) {
			Button bt = new Button(name);
			
			menuP.add(bt);
			
			bt.addActionListener(this);			
		}
		
		f.add(BorderLayout.WEST,menuP);
		f.add(BorderLayout.CENTER,contentP);
		f.setSize(400,250);
		f.setVisible(true);
		
		f.addWindowListener(this);
	};
	

	//Method
	/*
	 * 윈도우 종료 이벤트
	 */
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}//windowClosing
	
	/**
	 * 메뉴 클릭 이벤트
	 */
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand().trim();
		if(name.equals("등록")) {
			insertForm();
			
		}else if(name.equals("출력")){
			System.out.println("출력");
			selectForm();
			
		}else if(name.equals("수정")){
			updateForm();
			
			
		}else if(name.equals("삭제")){
			System.out.println("삭제");
			deleteForm();
			
		}else if(name.equals("종료")) {
			System.exit(0);
			
		}else if(name.equals("등록하기")){
			if(insertFormCheck()) {
				//등록
				System.out.println("등록");
				BookVO book = new BookVO();
				ArrayList<String> datas = new ArrayList<String>(4);
				
				for(TextField tf : tf_list) {
					datas.add(tf.getText());					
				}
				
				book.setIsbn(datas.get(0));
				book.setTitle(datas.get(1));
				book.setAuthor(datas.get(2));
				book.setPrice(Integer.parseInt(datas.get(3)));
				
				if(bms.insert(book)) {
					JOptionPane.showMessageDialog(null,"데이터 등록 완료");
					for(TextField tf : tf_list) {
						tf.setText("");
				}
				}else{
					JOptionPane.showMessageDialog(null,"데이터 등록 실패");
				}
				
				//도서관리 시스템에 등록 작업		
			}
			
		}else if(name.equals("등록취소")){			
				//등록취소
				System.out.println("등록취소");
				for(TextField tf : tf_list) {
					tf.setText("");
				}
		}else if(name.equals("검색")) {
			String isbn = tf_update.getText().trim();
			int result = bms.searchAddress(isbn);
			if(result !=-1) {
				JOptionPane.showMessageDialog(null,"수정 가능");
			}else {
				JOptionPane.showMessageDialog(null,"데이터가 없습니다");
			}
		}
	}//actionPerformed
	
	
	/**
	 * 수정화면
	 */
	public void updateForm() {
		switchP(BookUI.UPDATE);
		updateP.removeAll();	
		tf_update=  new TextField(20);
		
		Panel update_top = new Panel();
		Label label = new Label("수정 할 ISBN");
		Button bt = new Button("검색");
		
		update_top.add(label);
		update_top.add(tf_update);		
		update_top.add(bt);
		
		updateP.setLayout(new BorderLayout());
		updateP.add(BorderLayout.NORTH,update_top);	
		
		bt.addActionListener(this);
		
		contentP.add(updateP);
		f.setVisible(true);
	}
	
	/**
	 * 삭제화면
	 */
	public void deleteForm() {
		switchP(BookUI.DELETE);
		deleteP.removeAll();
		Label label = new Label("삭제 화면");
		deleteP.add(label);
		contentP.add(deleteP);
		f.setVisible(true);
	}
	
	/**
	 * 패널 스위치
	 */
	public void switchP(int i) {
		resetP();
		
		switch(i) {		
		case 1:
		insertP.setVisible(true);
			break;
			
		case 2:
		selectP.setVisible(true);
			break;
			
		case 3:
		updateP.setVisible(true);
			break;
			
		case 4:
		deleteP.setVisible(true);
			break;
		}
		
	}

	public void resetP() {
		insertP.setVisible(false);
		selectP.setVisible(false);
		updateP.setVisible(false);
		deleteP.setVisible(false);
	}
	
	
	/**
	 * 입력 확인화면
	 */
	public boolean insertFormCheck() {
		boolean result = false;
		
		int i=0;		
		for(TextField tf : tf_list) {
			if(tf.getText().equals("")) {
				JOptionPane.showMessageDialog(null,inputs[i]+" 데이터를 입력해주세요");
				tf.requestFocus();	
				result=false;
				break;
			}else {
				result=true;
			}
			i++;
		}
		return result;
	}//insertFormCheck()
	
	/**
	 * 등록 화면
	 */
	public void insertForm(){
		switchP(BookUI.INSERT);	
		
		insertP.removeAll();
		tf_list.removeAll(tf_list);
		
		Button insertBtn = new Button("등록하기");
		Button cancelBtn = new Button("등록취소");
		Panel btnP = new Panel();		
		
		insertP.setLayout(new GridLayout(6,1));

		insertP.add(new Label("     ********도서정보 등록화면********"));
		
		for(String input : inputs) {
			TextField tf = new TextField(10);
			Panel forLabelP = new Panel(new FlowLayout(FlowLayout.LEFT));
			forLabelP.add(new Label(input));
			
			Panel forTextP= new Panel(new FlowLayout(FlowLayout.LEFT));
			forTextP.add(tf);		
					
			Panel forP=new Panel(new GridLayout(1,2));	
			
			forP.add(forLabelP);
			forP.add(forTextP);
			
			insertP.add(forP);
			
			tf_list.add(tf);
		}
		
		
		
		btnP.add(insertBtn);
		btnP.add(cancelBtn);
		
		insertP.add(BorderLayout.SOUTH,btnP);
		
		contentP.add(insertP);
		f.setVisible(true);

		insertBtn.addActionListener(this);
		cancelBtn.addActionListener(this);		
	}//insertForm
	
		
	/**
	 * 출력화면
	 */
	public void selectForm() {
		ArrayList<BookVO> list = (ArrayList<BookVO>)bms.selectList();
		switchP(BookUI.SELECT);
		selectP.removeAll();
		selectP.setLayout(new GridLayout(2,1));
		
		Panel label = new Panel();
		Panel taP = new Panel();

		label.add(new Label("ISBN"));
		label.add(new Label("Title"));
		label.add(new Label("Author"));
		label.add(new Label("Price"));

		TextArea tf = new TextArea(10,35);
		if(list.size()!=0) {
			tf.append("************도서관리 시스템*************\n");
			tf.append("\nISBN\t도서명\t저자\t가격\n");
			tf.append("────────────────────");
			//TextArea 객체 생성 후 selectP 에 add 데이터 출력
			for(BookVO book : list) {
				tf.append("\n");
				tf.append(book.getIsbn()+"\t");					
				tf.append(book.getTitle()+"\t");
				tf.append(book.getAuthor()+"\t");
				tf.append(Integer.toString(book.getPrice())+"\n");
				tf.append("────────────────────");
					
			}
		}else{
			tf.append("해당 데이터가 없습니다");
		}
		taP.add(tf);		
//		selectP.add(BorderLayout.NORTH,label);
		selectP.add(taP);
		contentP.add(selectP);
		f.setVisible(true);
	}//selectForm
}
