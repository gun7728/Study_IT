/**
 * ������ ���� �Է� �޾�, Ȧ������ ¦������ ȭ�鿡 ����ϼ���
 */
package java_0811_3day;

import java.util.Scanner;

public class java_17_moduler {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		while(flag) {
		System.out.print("�Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num==0) {
			flag=false;
			scan.close();
			System.out.println("�����մϴ�.");
		}else if(num%2==0) {
			System.out.println("¦��");
		}else if(num%2==1) 
			System.out.println("Ȧ��");
		
		
		}//while
		
	}//main

}//class
