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
	String[] names = {"     ���     ","���","����","����","����"};
	String[] inputs = {"ISBN","������","����","����"};
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
	 * ������ ���� �̺�Ʈ
	 */
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}//windowClosing
	
	/**
	 * �޴� Ŭ�� �̺�Ʈ
	 */
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand().trim();
		if(name.equals("���")) {
			insertForm();
			
		}else if(name.equals("���")){
			System.out.println("���");
			selectForm();
			
		}else if(name.equals("����")){
			updateForm();
			
			
		}else if(name.equals("����")){
			System.out.println("����");
			deleteForm();
			
		}else if(name.equals("����")) {
			System.exit(0);
			
		}else if(name.equals("����ϱ�")){
			if(insertFormCheck()) {
				//���
				System.out.println("���");
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
					JOptionPane.showMessageDialog(null,"������ ��� �Ϸ�");
					for(TextField tf : tf_list) {
						tf.setText("");
				}
				}else{
					JOptionPane.showMessageDialog(null,"������ ��� ����");
				}
				
				//�������� �ý��ۿ� ��� �۾�		
			}
			
		}else if(name.equals("������")){			
				//������
				System.out.println("������");
				for(TextField tf : tf_list) {
					tf.setText("");
				}
		}else if(name.equals("�˻�")) {
			String isbn = tf_update.getText().trim();
			int result = bms.searchAddress(isbn);
			if(result !=-1) {
				JOptionPane.showMessageDialog(null,"���� ����");
			}else {
				JOptionPane.showMessageDialog(null,"�����Ͱ� �����ϴ�");
			}
		}
	}//actionPerformed
	
	
	/**
	 * ����ȭ��
	 */
	public void updateForm() {
		switchP(BookUI.UPDATE);
		updateP.removeAll();	
		tf_update=  new TextField(20);
		
		Panel update_top = new Panel();
		Label label = new Label("���� �� ISBN");
		Button bt = new Button("�˻�");
		
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
	 * ����ȭ��
	 */
	public void deleteForm() {
		switchP(BookUI.DELETE);
		deleteP.removeAll();
		Label label = new Label("���� ȭ��");
		deleteP.add(label);
		contentP.add(deleteP);
		f.setVisible(true);
	}
	
	/**
	 * �г� ����ġ
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
	 * �Է� Ȯ��ȭ��
	 */
	public boolean insertFormCheck() {
		boolean result = false;
		
		int i=0;		
		for(TextField tf : tf_list) {
			if(tf.getText().equals("")) {
				JOptionPane.showMessageDialog(null,inputs[i]+" �����͸� �Է����ּ���");
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
	 * ��� ȭ��
	 */
	public void insertForm(){
		switchP(BookUI.INSERT);	
		
		insertP.removeAll();
		tf_list.removeAll(tf_list);
		
		Button insertBtn = new Button("����ϱ�");
		Button cancelBtn = new Button("������");
		Panel btnP = new Panel();		
		
		insertP.setLayout(new GridLayout(6,1));

		insertP.add(new Label("     ********�������� ���ȭ��********"));
		
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
	 * ���ȭ��
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
			tf.append("************�������� �ý���*************\n");
			tf.append("\nISBN\t������\t����\t����\n");
			tf.append("����������������������������������������");
			//TextArea ��ü ���� �� selectP �� add ������ ���
			for(BookVO book : list) {
				tf.append("\n");
				tf.append(book.getIsbn()+"\t");					
				tf.append(book.getTitle()+"\t");
				tf.append(book.getAuthor()+"\t");
				tf.append(Integer.toString(book.getPrice())+"\n");
				tf.append("����������������������������������������");
					
			}
		}else{
			tf.append("�ش� �����Ͱ� �����ϴ�");
		}
		taP.add(tf);		
//		selectP.add(BorderLayout.NORTH,label);
		selectP.add(taP);
		contentP.add(selectP);
		f.setVisible(true);
	}//selectForm
}
