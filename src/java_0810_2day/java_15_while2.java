/**
 * 메뉴 반복 선택시 사용 --> 프로그램 종료 할 경우 flag 변수 사용!!
 */

package java_0810_2day;

import java.util.Scanner;

public class java_15_while2 {

	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++   성적 관리 프로그램     ++++++++++");
		System.out.println("+++++++ 등록(1), 조회(2), 종료(3) +++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		boolean flag = true;
		while(flag) 
		{			
			System.out.print("	메뉴 선택 : ");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("		등록");
				break;
			case 2:
				System.out.println("		조회");
				break;
			case 3:
				System.out.println("		종료");
				flag=false;
				break;
			default:
				System.out.println("		메뉴가 준비중입니다.");
			
			}//switch
		
		}//while
		System.out.println("		프로그램이 종료됩니다.");
	}//main

}//class
