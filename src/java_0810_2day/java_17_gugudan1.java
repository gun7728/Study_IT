package java_0810_2day;

import java.util.Scanner;

public class java_17_gugudan1 {

	public static void main(String[] args) {
		//실행시 임의의 구구단 입력받아 출력
		//1. 구구단 3단 출력
		//2. 임의의 단 입력 받아 출력
		//3. 0단일때 종료
		//4. while문 반복
		
		
		boolean flag=true;
		while(flag) {
			
		System.out.print("숫자를 입력하세요 : ");
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
		System.out.println("프로그램이 종료되었습니다.");

	}//main

}//class
