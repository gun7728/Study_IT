package java_0810_2day;

import java.util.Scanner;

public class java_17_gugudan1 {

	public static void main(String[] args) {
		//����� ������ ������ �Է¹޾� ���
		//1. ������ 3�� ���
		//2. ������ �� �Է� �޾� ���
		//3. 0���϶� ����
		//4. while�� �ݺ�
		
		
		boolean flag=true;
		while(flag) {
			
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int sel = scan.nextInt();
			
			if(sel==0) {
				flag=false;
				break;
			}//if
		
			for(int i=1;i<10;i++) {
				System.out.println(sel+ " * " +i +" = " +(sel*i));
				
			}//for

		}//while
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}//main

}//class
