package java_0811_3day;

import java.util.Scanner;

public class java_19_ArrayTest1 {

	public static void main(String[] args) {
		// ����, ����, ���� ������ �Է¹޾�, �迭�� ���� �� �� ���
		int[] scoreList = new int[3];
		Scanner scan = new Scanner(System.in);
		String[] subList = {"����","����","����"};
		System.out.print("�л��� : ");
		String name = scan.next();
	
		for(int i=0;i<scoreList.length;i++) {
			System.out.print(subList[i]+" : ");
			scoreList[i] = scan.nextInt();
		}//for
	

		System.out.println("�л��� : "+name);
		for(int i=0;i<scoreList.length;i++) {			
			System.out.println(subList[i]+" : "+scoreList[i]);
		}//for

	}
}
