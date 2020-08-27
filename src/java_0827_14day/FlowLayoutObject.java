package java_0827_14day;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutObject extends WindowAdapter {
	//Field
	
	Frame f;
	Button north_1, north_2, south_1, south_2, west_1,west_2,east_1,east_2,center_1,center_2;
	Panel northP, southP, westP, eastP, centerP;
	
	//Constructor
	public FlowLayoutObject() {
		f = new Frame();
//		f.setLayout(new FlowLayout());
		north_1 =new Button("ºÏ1");
		north_2 =new Button("ºÏ2");
		south_1 =new Button("³²1");
		south_2 =new Button("³²2");
		west_1 =new Button("¼­1");
		west_2 =new Button("¼­2");
		east_1 =new Button("µ¿1");
		east_2 =new Button("µ¿2");
		center_1 =new Button("Áß¾Ó1");
		center_2 =new Button("Áß¾Ó2");

		northP = new Panel();
		southP = new Panel();
		westP = new Panel();
		eastP = new Panel();
		centerP = new Panel();
		
		northP.add(north_1);
		northP.add(north_2);
		
		southP.add(south_1);
		southP.add(south_2);
		
		westP.add(west_1);
		westP.add(west_2);
		
		eastP.add(east_1);
		eastP.add(east_2);
		
		centerP.add(center_1);
		centerP.add(center_2);
		
		f.add(northP,BorderLayout.NORTH);
		f.add(southP,BorderLayout.SOUTH);
		f.add(westP,BorderLayout.WEST);
		f.add(eastP,BorderLayout.EAST);
		f.add(centerP,BorderLayout.CENTER);
		
		f.setTitle("ÇÁ·¹ÀÓÅ×½ºÆ®");
		
		
		
		f.setSize(300,150);
		f.setVisible(true);
		
		f.addWindowListener(this);
	}
	
	//Method
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	//Method
}
