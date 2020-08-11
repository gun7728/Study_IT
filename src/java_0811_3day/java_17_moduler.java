/**
 * 임의의 수를 입력 받아, 홀수인지 짝수인지 화면에 출력하세요
 */
package java_0811_3day;

import java.util.Scanner;

public class java_17_moduler {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		while(flag) {
		System.out.print("입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num==0) {
			flag=false;
			scan.close();
			System.out.println("종료합니다.");
		}else if(num%2==0) {
			System.out.println("짝수");
		}else if(num%2==1) 
			System.out.println("홀수");
		
		
		}//while
		
	}//main

}//class
