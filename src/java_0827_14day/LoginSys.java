package java_0827_14day;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class LoginSys extends WindowAdapter implements ActionListener {
	
	Frame f;
	Button loginBt,resetBt;
	Label loginLabel,resetLabel;
	Panel content_panel,btnP,labelP,tfP;
	TextField idTf,passTf;
	
	public LoginSys(){
		f= new Frame();
		
		loginBt=new Button("Login");
		resetBt=new Button("Reset");
	
		
		loginLabel = new Label("id");
		resetLabel = new Label("pass");
		
		idTf = new TextField(10);
		passTf = new TextField(10);
		passTf.setEchoChar('*');	
		
		content_panel = new Panel();
		
		labelP=new Panel();
		labelP.setLayout(new GridLayout(2,1));
		tfP=new Panel();
		tfP.setLayout(new GridLayout(2,1));
		btnP=new Panel();

		btnP.add(loginBt);
		btnP.add(resetBt);
		
		labelP.add(loginLabel);
		labelP.add(resetLabel);
		tfP.add(idTf);		
		tfP.add(passTf);
		
		content_panel.add(labelP);
		content_panel.add(tfP);
		
		f.add(content_panel,BorderLayout.CENTER);
		f.add(btnP,BorderLayout.SOUTH);
		
		f.setSize(300,130);
		f.setLocation(300,200);
		f.setVisible(true);
		
		f.addWindowListener(this);
		loginBt.addActionListener(this);
		resetBt.addActionListener(this);
		idTf.addActionListener(this);
		passTf.addActionListener(this);
		
	}
	
	/**
	 * 로그인 폼 유효성 체크
	 */
	public boolean validationCheck() {
		String id = idTf.getText();	
		String pass = passTf.getText();	
		
		boolean flag=false;
		
		if(id==""||id.equals("")) {
			JOptionPane.showMessageDialog(null, "id를 입력해 주세요");
			idTf.requestFocus();
		}else if(pass==""||pass.equals("")){				
			JOptionPane.showMessageDialog(null, "비밀번호를 입력해 주세요");
			passTf.requestFocus();
		}else {
			flag=true;
		}
		
		return flag;
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==resetBt) {			
			System.out.println("Reset");
			idTf.setText("");
			passTf.setText("");		
		}else if(obj==loginBt || obj==passTf||obj==idTf){
			//데이터 유효성 체크 : validation check			
			if(validationCheck()) {
				JOptionPane.showMessageDialog(null, "로그인");
			}
		}
	}
}
