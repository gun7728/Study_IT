/**
 * ���ǹ� : 
 * if(���ǽ�){ ���๮;  } <<���� �������
 * if(���ǽ�){ ���๮1; } else { ���๮2; } <<�ƴҰ��
 * if(���ǽ�){ ���๮1; } else if(���ǽ�) { ���๮2; } else{ ���๮3; } <<������ �߰� ����
 * 
 * 
 */

package java_0810_2day;

import java.util.Scanner;

public class java_13_if {

	public static void main(String[] args) {

		//������ ���� x,y�� �Է¹޴� ��� : Scanner Ŭ����
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("x �Է� : ");
		int x = scan.nextInt();		
		System.out.println(x);

		System.out.print("y �Է� : ");
		int y = scan.nextInt();		
		System.out.println(y);
		
		
		if(x>y) {
			System.out.println("x>y : " +true);
		}else
			System.out.println("x>y : " +false);
		
		
		if(x>y) {
			System.out.println("X�� ũ��");
		}else if(x<y) {
			System.out.println("Y�� ũ��");
		}
		

	}

}
