package java_0811_3day;

import java.util.Scanner;

public class java_18_ScoreTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("±¹¾î >>");
		int kor = input.nextInt();
	
		System.out.print("¿µ¾î >>");
		int eng = input.nextInt();
		
		System.out.print("¼öÇÐ >>");
		int math = input.nextInt();
		
		int tot = kor+eng+math;
		int avg = tot/3;
		
		System.out.println("ÃÑÁ¤ : " + tot);
		System.out.println("Æò±Õ : " + avg);
	}

}
