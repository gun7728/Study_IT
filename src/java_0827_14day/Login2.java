package java_0827_14day;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login2 extends WindowAdapter{

	
	Frame login;
	Button resetBtn, loginBtn;
	Panel btnP, contentPanel_1,contentPanel_2, textP, boxP, phoneP, addP;
	TextField idTf, passTf,passReTf,nameTf,emailTf,phoneTf,addTf,phoneTf_1,phoneTf_2,phoneTf_3 ,addTf_1,addTf_2;
	Label id, pass, passRe, name, email, phone, add, em,em_2;
	
	//Constructor
	public Login2() {
		login = new Frame();
		resetBtn =new Button("가입하기");
		loginBtn =new Button("가입취소");
			
		login.setTitle("login");
		
		em=new Label("-");
		em_2=new Label("-");
		id = new Label("아이디");
		pass = new Label("비밀번호");
		passRe= new Label("비밀번호확인");
		name = new Label("이름");
		email= new Label("E-mail");
		phone= new Label("핸드폰");
		add= new Label("주소");
		
		addP= new Panel();
		phoneP = new Panel();
		
		btnP=new Panel();
		textP= new Panel();
		textP.setLayout(new GridLayout(1,1));
		
		boxP=new Panel();
		boxP.setLayout(new GridLayout(10,1));

		contentPanel_1=new Panel();
		contentPanel_1.setLayout(new GridLayout(2,1));

		contentPanel_2=new Panel();
		contentPanel_2.setLayout(new GridLayout(1,2));
		
		
		idTf=new TextField(10);
		passTf=new TextField(10);
		passTf.setEchoChar('*');	
		passReTf=new TextField(10);
		passReTf.setEchoChar('*');	
		nameTf=new TextField(10);
		emailTf=new TextField(10);
		phoneTf=new TextField(10);
		phoneTf_1=new TextField(3);
		phoneTf_2=new TextField(4);
		phoneTf_3=new TextField(4);
		addTf=new TextField(10);
		addTf_1=new TextField(10);
		addTf_2=new TextField(10);
		
		phoneP.add(phoneTf_1);
		phoneP.add(em);
		phoneP.add(phoneTf_2);
		phoneP.add(em_2);
		phoneP.add(phoneTf_3);
		
		addP.add(addTf_1);
		addP.add(addTf_2);
		
		btnP.add(resetBtn);
		btnP.add(loginBtn);
		
		textP.add(id);
		textP.add(pass);
		textP.add(passRe);
		textP.add(name);
		textP.add(email);
		textP.add(phone);
		textP.add(add);
		
		boxP.add(idTf);
		boxP.add(passTf);
		boxP.add(passReTf);
		boxP.add(nameTf);
		boxP.add(emailTf);
		boxP.add(phoneP);
		boxP.add(addTf);
		boxP.add(addTf_1);
		
		contentPanel_2.add(textP);
		contentPanel_2.add(boxP);
		
		contentPanel_1.add(contentPanel_2);
		contentPanel_1.add(btnP);
		
		login.add(contentPanel_1,BorderLayout.CENTER);
		
		login.setSize(600,400);
		login.setVisible(true);
		
		
		login.addWindowListener(this);
	}
	
	//Method
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
