package java_0827_14day;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameObject extends WindowAdapter {
	//Field
	Frame f;
	Button btn1, btn2, btn3, btn4, btn5;
	Panel btnPanel;
	
	//Constructor
	public FrameObject() {
		f = new Frame();
//		f.setLayout(new FlowLayout());
		btn1 =new Button("��");
		btn2 =new Button("��");
		btn3 =new Button("��");
		btn4 =new Button("��");
		btn5 =new Button("�߾�");
		btnPanel = new Panel();
		
		f.setTitle("�������׽�Ʈ");
		
		f.add(btn1,BorderLayout.NORTH);
		f.add(btn2,BorderLayout.SOUTH);
		f.add(btn3,BorderLayout.WEST);
		f.add(btn4,BorderLayout.EAST);
		f.add(btn5,BorderLayout.CENTER);
//		f.add(btnPanel);
		
		f.setSize(300,500);
		f.setVisible(true);
		
		f.addWindowListener(this);
	}
	
	//Method
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
