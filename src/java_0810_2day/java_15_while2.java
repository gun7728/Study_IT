/**
 * �޴� �ݺ� ���ý� ��� --> ���α׷� ���� �� ��� flag ���� ���!!
 */

package java_0810_2day;

import java.util.Scanner;

public class java_15_while2 {

	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++   ���� ���� ���α׷�     ++++++++++");
		System.out.println("+++++++ ���(1), ��ȸ(2), ����(3) +++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		boolean flag = true;
		while(flag) 
		{			
			System.out.print("	�޴� ���� : ");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("		���");
				break;
			case 2:
				System.out.println("		��ȸ");
				break;
			case 3:
				System.out.println("		����");
				flag=false;
				break;
			default:
				System.out.println("		�޴��� �غ����Դϴ�.");
			
			}//switch
		
		}//while
		System.out.println("		���α׷��� ����˴ϴ�.");
	}//main

}//class
