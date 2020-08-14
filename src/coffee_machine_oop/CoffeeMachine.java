package coffee_machine_oop;

import java.util.Scanner;

public class CoffeeMachine {
	//Field
	int coin,choiceMenuPrice,select;
	String choiceMenu;
	String[] menuList = {"우유", "밀크커피","유자차", "아메리카노"};
	int[] priceList = {200,300,300,400};
	

	
	//Method
	
	//메뉴 출력
	public void showMenu() {
		for(int i=0;i<menuList.length;i++) {
			System.out.println("\t"+(i+1)+". "+menuList[i]+":"+priceList[i]);
		}
		System.out.println("================================");
	}//showMenu
	
	//동전 체크
	public boolean coinCheck(int coin) {
		boolean result=false;
		this.coin = coin;	//전역변수(this.)coin에 전역변수 coin값을 대입
		if(coin>=200) {
			System.out.println("주문 가능합니다.");
			System.out.println("coin------------>>"+coin);
			result=true;
			showChoiceMenu();	//클래스내의 다른 메소드 직접호출 후 파라미터 대입
		}else {
			System.out.println("금액이 부족합니다.");
			System.out.println("coin------------>>"+coin);			
			result=false;
		}
		return result;
	}//coinCheck
	
	
	//주문 가능한 메뉴를 출력
	public void showChoiceMenu() {		
		if(coin>=200 && coin<300) {
			System.out.println("주문가능 메뉴 : [우유]");
			select=1;
		}else if(coin>=300 && coin<400) {
			System.out.println("주문가능 메뉴 : [우유],[밀크커피],[유자차]");
			select=3;
		}else if(coin>=400) {
			System.out.println("주문가능 메뉴 : [우유],[밀크커피],[유자차],[아메리카노]");
			select=4;
		}		
		orderMenu();
	}//showChoiceMenu
	
	
	//메뉴 선택
	public void orderMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 선택해 주세요");
		int menu=scan.nextInt();
		if(menu>select) {
			System.out.println("\n\t잘못누르셨습니다.\n");
			showChoiceMenu();
		}else {
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
			}//switch
			
			giveMenu();
			System.out.print("선택하신 메뉴는 " + choiceMenu+"이고,");
			System.out.print(" 가격은 " + choiceMenuPrice+"원 입니다.\n");
		}
		
		
	}//orderMenu
	
	
	//잔돈 계산
	public int calChange() {
		int change=0;
		if(coin>choiceMenuPrice) {
			change = coin - choiceMenuPrice;			
		}
		return change;
	}//calChange
	
	//메뉴, 잔돈 전달
	public void giveMenu() {
		if(calChange() != 0) {
			System.out.print("\n주문하신 메뉴 "+choiceMenu+"이고, ");
			System.out.print(" 잔돈은 " + calChange()+"원 입니다.\n");
		}else {
			System.out.println("\n주문하신 메뉴 "+choiceMenu+"입니다.");
		}
	}//giveMenu
	
	
	
}//class







