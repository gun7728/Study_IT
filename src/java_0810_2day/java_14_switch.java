/**
 * 조건문 : switch(숫자(정수)){ case문: 실행문; break; ~~~ default:~}
 * 숫자의 값은 byte, short, int만 가능
 */

package java_0810_2day;

import java.util.Scanner;

public class java_14_switch {

	public static void main(String[] args) {
		// 0>>된장찌개 1>>김치찌개 2>>돈까스 3>>기타 숫자
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int menu = scan.nextInt();
		
		switch(menu) {
		case 0:
			System.out.println("된장찌개");
			break;
		case 1:
			System.out.println("김치찌개");
			break;
		case 2:
			System.out.println("돈까스");
			break;
		default:
			System.out.println("짜장면");
		}

	}

}
