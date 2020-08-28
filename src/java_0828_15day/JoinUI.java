package java_0828_15day;

import java.awt.*;
import java.awt.event.*;

public class JoinUI extends WindowAdapter {
	//Field
	Frame f;
	Panel btn_P, label_P, tf_P;
	Button reset_Bt, join_Bt;
	String[] names = {"���̵�","��й�ȣ","��й�ȣȮ��","�̸�","E-Mail","��ȭ��ȣ","�ּ�"};
	
	//Constructor
	public JoinUI() {
		//������
		f = new Frame("ȸ������");		

		//�г�
		btn_P= new Panel();
		label_P = new Panel();
		tf_P = new Panel();		
		
		//��ư
		join_Bt = new Button("�����ϱ�");
		reset_Bt = new Button("����ϱ�");		

		
		label_P.setLayout(new GridLayout(7,1));
		tf_P.setLayout(new GridLayout(7,1));
		
		
		for(String name : names) {
			Label label = new Label(name);
			Panel for_label_P = new Panel(new FlowLayout(FlowLayout.LEFT));
			
			for_label_P.add(label);
			
			label_P.add(for_label_P);
			
			if(name.equals("��й�ȣ")||name.equals("��й�ȣȮ��")) {
				TextField tf = new TextField(20);
				Panel for_tf_P = new Panel(new FlowLayout(FlowLayout.LEFT));
				
				tf.setEchoChar('*');
				for_tf_P.add(tf);
				
				tf_P.add(for_tf_P);	
				
			}else if(name.equals("��ȭ��ȣ")) {
				TextField hp1 = new TextField(5);
				TextField hp2 = new TextField(5);
				TextField hp3 = new TextField(5);
				Panel phone_tf_P = new Panel(new FlowLayout(FlowLayout.LEFT));
				
				phone_tf_P.add(hp1);
				phone_tf_P.add(new Label("-"));
				phone_tf_P.add(hp2);
				phone_tf_P.add(new Label("-"));
				phone_tf_P.add(hp3);
				
				tf_P.add(phone_tf_P);
				
			}else if(name.equals("�ּ�")) {
				TextField add1 = new TextField(20);
				TextField add2 = new TextField(20);
				Panel add_P = new Panel(new FlowLayout(FlowLayout.LEFT));
				
				add_P.add(add1);
				add_P.add(add2);
				
				tf_P.add(add_P);
				
			}else {
				TextField tf = new TextField(20);
				Panel for_tf_P = new Panel(new FlowLayout(FlowLayout.LEFT));
				
				for_tf_P.add(tf);
				
				tf_P.add(for_tf_P);
				
			}//if
			
		}//for
		
		btn_P.add(join_Bt);
		btn_P.add(reset_Bt);
		
		
		f.add(BorderLayout.WEST,label_P);
		f.add(BorderLayout.CENTER,tf_P);
		f.add(BorderLayout.SOUTH,btn_P);
		
		f.setSize(400,400);
		f.setVisible(true);
		
		f.addWindowListener(this);
		
	}//JoinUI
	
	
	
	//Method
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}//End
