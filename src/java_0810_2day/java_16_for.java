/**
 * 반복문 : for(초기값;조건식;증감연산){ 실행문; }
 * 반복횟수를 정확하게 알고 있는 경우 사용! 특히, 배열의 데이터 출력 시 사용
 */
package java_0810_2day;

import java.util.Scanner;

public class java_16_for {

	public static void main(String[] args) {
		int a=0;
		
		System.out.println("1부터 X까지 더하기");
		System.out.print("X입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int fin=scan.nextInt();
		for(int i=0;i<=fin;i++) {
			a=a+i;
//			System.out.println(i);
		}
		System.out.println(a);

	}//main

}//class
