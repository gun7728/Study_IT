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
		btn1 =new Button("북");
		btn2 =new Button("남");
		btn3 =new Button("서");
		btn4 =new Button("동");
		btn5 =new Button("중앙");
		btnPanel = new Panel();
		
		f.setTitle("프레임테스트");
		
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
