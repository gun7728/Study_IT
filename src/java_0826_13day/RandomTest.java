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
		Button b2= new Button("출력");
		Button b3= new Button("정렬");
		Button b4= new Button("순위");
		
		b1.setLabel("입력");
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
