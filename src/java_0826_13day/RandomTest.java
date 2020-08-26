package java_0826_13day;

import java.awt.*;
import java.util.Random;
import java.util.UUID;

public class RandomTest {

	public static void main(String[] args) {
		Random ran = new Random();
		int num1 = (int)Math.round(Math.random()*100);
		int num2 = ran.nextInt();
		int num3 = ran.nextInt(100);
		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(UUID.randomUUID());
		
		Frame f = new Frame();
		
		f.setTitle("Frame Test");
		Panel p = new Panel();
		
		Button b1= new Button();
		Button b2= new Button("���");
		Button b3= new Button("����");
		Button b4= new Button("����");
		
		b1.setLabel("�Է�");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		f.add(p);
		
		f.setLocation(300, 300);
		f.setSize(300, 100);
		f.setVisible(true);

	}
	
	

}
