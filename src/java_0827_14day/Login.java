package java_0827_14day;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends WindowAdapter{

	
	Frame login;
	Button resetBtn, loginBtn;
	Panel btnP,contentPanel_1,idP,passP,passReP,nameP,emailP,phoneP,addP;
	TextField idTf, passTf,passReTf,nameTf,emailTf,phoneTf,addTf;
	Label id, pass, passRe, name, email, phone, add;
	
	//Constructor
	public Login() {
		login = new Frame();
		resetBtn =new Button("가입하기");
		loginBtn =new Button("가입취소");
		idTf = new TextField(20);
		passTf = new TextField(20);
		passTf.setEchoChar('*');

		login.setTitle("login");
		
		
		id = new Label("아이디");
		pass = new Label("비밀번호");
		passRe= new Label("비밀번호확인");
		name = new Label("이름");
		email= new Label("E-mail");
		phone= new Label("핸드폰");
		add= new Label("주소");
		
		contentPanel_1=new Panel();
		
		idP=new Panel();
		passP=new Panel();
		passReP=new Panel();
		nameP=new Panel();
		emailP=new Panel();
		phoneP=new Panel();
		addP=new Panel();
		btnP=new Panel();
		
		idTf=new TextField(20);
		passTf=new TextField(20);
		passReTf=new TextField(20);
		nameTf=new TextField(20);
		emailTf=new TextField(20);
		phoneTf=new TextField(10);
		addTf=new TextField(20);
		
		btnP.add(resetBtn);
		btnP.add(loginBtn);
		
		idP.add(id);
		idP.add(idTf);
		
		passP.add(pass);
		passP.add(passTf);
		
		passReP.add(passRe);
		passReP.add(passReTf);
		
		nameP.add(name);
		nameP.add(nameTf);
		
		emailP.add(email);
		emailP.add(emailTf);
		
		phoneP.add(phone);
		phoneP.add(phoneTf);
		
		
		addP.add(add);
		addP.add(addTf);
		
		contentPanel_1.setLayout(new GridLayout(7,1));
			
		contentPanel_1.add(idP);
		contentPanel_1.add(passP);
		contentPanel_1.add(passReP);
		contentPanel_1.add(nameP);
		contentPanel_1.add(emailP);
		contentPanel_1.add(phoneP);
		contentPanel_1.add(addP);
		
		login.add(contentPanel_1,BorderLayout.CENTER);
		login.add(btnP,BorderLayout.SOUTH);
		
		login.setSize(500,500);
		login.setVisible(true);
		
		
		login.addWindowListener(this);
	}
	
	//Method
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
