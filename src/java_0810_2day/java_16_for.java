/**
 * �ݺ��� : for(�ʱⰪ;���ǽ�;��������){ ���๮; }
 * �ݺ�Ƚ���� ��Ȯ�ϰ� �˰� �ִ� ��� ���! Ư��, �迭�� ������ ��� �� ���
 */
package java_0810_2day;

import java.util.Scanner;

public class java_16_for {

	public static void main(String[] args) {
		int a=0;
		
		System.out.println("1���� X���� ���ϱ�");
		System.out.print("X�Է� : ");
		Scanner scan = new Scanner(System.in);
		
		int fin=scan.nextInt();
		for(int i=0;i<=fin;i++) {
			a=a+i;
//			System.out.println(i);
		}
		System.out.println(a);

	}//main

}//class
