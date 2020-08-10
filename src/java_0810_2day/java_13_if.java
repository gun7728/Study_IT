/**
 * 조건문 : 
 * if(조건식){ 실행문;  } <<참만 있을경우
 * if(조건식){ 실행문1; } else { 실행문2; } <<아닐경우
 * if(조건식){ 실행문1; } else if(조건식) { 실행문2; } else{ 실행문3; } <<조건을 추가 가능
 * 
 * 
 */

package java_0810_2day;

import java.util.Scanner;

public class java_13_if {

	public static void main(String[] args) {

		//임의의 숫자 x,y를 입력받는 경우 : Scanner 클래스
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("x 입력 : ");
		int x = scan.nextInt();		
		System.out.println(x);

		System.out.print("y 입력 : ");
		int y = scan.nextInt();		
		System.out.println(y);
		
		
		if(x>y) {
			System.out.println("x>y : " +true);
		}else
			System.out.println("x>y : " +false);
		
		
		if(x>y) {
			System.out.println("X가 크다");
		}else if(x<y) {
			System.out.println("Y가 크다");
		}
		

	}

}
