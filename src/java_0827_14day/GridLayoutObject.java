package java_0827_14day;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutObject extends WindowAdapter{
	Frame f;
	Button btn1, btn2, btn3, btn4, btn5;
	Panel btnPanel;
	
	//Constructor
	public GridLayoutObject() {
		f = new Frame();
//		f.setLayout(new FlowLayout());
		btn1 =new Button("1");
		btn2 =new Button("2");
		btn3 =new Button("3");
		btn4 =new Button("4");
		btn5 =new Button("5");
		btnPanel = new Panel();
		
		f.setTitle("프레임테스트");
		btnPanel.setLayout(new GridLayout(5,1));
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		btnPanel.add(btn4);
		btnPanel.add(btn5);

		
		f.add(btnPanel,BorderLayout.WEST);
		
		
		f.setSize(300,500);
		f.setVisible(true);
		
		f.addWindowListener(this);
	}
	
	//Method
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
