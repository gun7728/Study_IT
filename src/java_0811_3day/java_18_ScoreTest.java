package java_0811_3day;

import java.util.Scanner;

public class java_18_ScoreTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� >>");
		int kor = input.nextInt();
	
		System.out.print("���� >>");
		int eng = input.nextInt();
		
		System.out.print("���� >>");
		int math = input.nextInt();
		
		int tot = kor+eng+math;
		int avg = tot/3;
		
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
	}

}
