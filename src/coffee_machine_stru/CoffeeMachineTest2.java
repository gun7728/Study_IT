/**
 * 보검씨는 휴게소의 커피자판기에서 300원짜리 밀크 커피를 마시려고 한다. 
 * 먼저, 500원짜리 동전을 넣고, 밀크커피를 선택한다. 커피제조 중 이라는 메시지가 뜨면서,
 * 잠시후 보검씨는 커피와 거스름돈 200원을받는다.
 * 참고 - 커피자판기의 메뉴는 밀크커피(300원), 아메리카노(400원), 유자차(300원), 우유(200원) 이다.
 * 
 * 1)명사, 동사로 구분
 *	명사 : 고객, 휴게소, 커피자판기, 동전(돈), 메뉴
 * 	동사 : 동전 넣기, 메뉴 선택, 커피 제조(메시지), 거스름돈, 커피 전달 
 *     (클래스)	   (전역변수)
 *		고객	 	:	 동전(O) 
 *		자판기	:	 동전(O), 메뉴(O) 

 *		
 *  클래스 : 고객
 *   -속성 : 동전 
 *	 -기능 : 동전 삽입, 메뉴 선택
 *  
 *  클래스 : 자판기
 *   -속성 : 동전, 메뉴
 *   -기능 : 금액 확인, 메뉴 제조, 잔돈 계산
 *   
 *(물리적 클래스)
 *	-클래스 : Customer.java
 *		전역변수	: int coin
 *		메소드	: int insertCoin(), choiceMenu()
 *
 *	-클래스 : CoffeeMachine.java
 *		전역변수	: int coin, String[] menu, int priceList, String choiceMenu,
 *					int choiceMenuPrice
 *		메소드	: void coinCheck(int coin), void makeMenu(), ....
 *  
 */

package coffee_machine_stru;

import java.util.Scanner;

public class CoffeeMachineTest2 {

	public static void main(String[] args) {
		String[] menuList = {"우유", "밀크커피","유자차", "아메리카노"};
		int[] priceList = {200,300,300,400};
		
		System.out.println("================================");
		System.out.println("\t만남의 광장 휴게소 자판기\t");
		System.out.println("================================");
		for(int i=0;i<menuList.length;i++) {
			System.out.println("\t"+(i+1)+". "+menuList[i]+":"+priceList[i]);
		}
		System.out.println("================================");
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int coin = 0;
		
		while(flag) {			
			System.out.print("동전을 넣어주세요>");
			coin += scan.nextInt();
			
			if(coin>=200) {
				//주문가능 메뉴 공지
				if(coin>=200 && coin<300) {
					System.out.println("주문가능 메뉴 : [우유]");
				}else if(coin>=300 && coin<400) {
					System.out.println("주문가능 메뉴 : [우유],[밀크커피],[유자차]");
				}else if(coin>=400) {
					System.out.println("주문가능 메뉴 : [우유],[밀크커피],[유자차],[아메리카노]");
				}
				
				//메뉴선택
				System.out.print("메뉴를 선택해주세요(번호)>");
				int menu = scan.nextInt();
				String choiceMenu = "";
				int choiceMenuPrice = 0;
				
				switch(menu) {
					case 1:
						choiceMenu = menuList[menu-1];
						choiceMenuPrice = priceList[menu-1];
						break;
					case 2:
						choiceMenu = menuList[menu-1];
						choiceMenuPrice = priceList[menu-1];
						break;
					case 3:
						choiceMenu = menuList[menu-1];
						choiceMenuPrice = priceList[menu-1];
						break;
					case 4:
						choiceMenu = menuList[menu-1];
						choiceMenuPrice = priceList[menu-1];
						break;
					default:
						System.out.println("준비중입니다.");
				}
				
				System.out.print("선택하신 메뉴는 " + choiceMenu+"이고,");
				System.out.print("가격은 " + choiceMenuPrice+" 입니다.\n");
				
				//잔돈계산 후 메뉴전달
				System.out.println("-- 메뉴가 완성되었습니다.--");
				int change = 0;
				if(coin>choiceMenuPrice) {
					change = coin - choiceMenuPrice;
					System.out.println("주문하신 메뉴 " + choiceMenu+"입니다.");
					System.out.println("잔돈은 " + change +" 입니다.");
				}else {
					System.out.println("주문하신 메뉴 " + choiceMenu+"입니다.");
				}
				
				flag = false;
				
			}else {
				System.out.println("금액이 부족합니다.");
				System.out.println("coin------>>" + coin);
				
			}//if
			
		}//while
		
		
	}//main

}//class

























