/**
 * ���ǹ� : switch(����(����)){ case��: ���๮; break; ~~~ default:~}
 * ������ ���� byte, short, int�� ����
 */

package java_0810_2day;

import java.util.Scanner;

public class java_14_switch {

	public static void main(String[] args) {
		// 0>>����� 1>>��ġ� 2>>��� 3>>��Ÿ ����
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int menu = scan.nextInt();
		
		switch(menu) {
		case 0:
			System.out.println("�����");
			break;
		case 1:
			System.out.println("��ġ�");
			break;
		case 2:
			System.out.println("���");
			break;
		default:
			System.out.println("¥���");
		}

	}

}
