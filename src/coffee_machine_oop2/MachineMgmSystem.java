package coffee_machine_oop2;

import java.util.Scanner;

public class MachineMgmSystem {

	Scanner scan = new Scanner(System.in);
	CoffeeVO[] coffeeList;	
	CoffeeVO choice_menu;
	
	public MachineMgmSystem() {
		init();
		showMenu();		//메뉴출력
		coinCheck(0);	//코인선택
	}
		
	public void init() {
		String[] nameList = {"우유", "밀크커피","유자차", "아메리카노"};
		int[] priceList = {200,300,300,400};
		
		coffeeList = new CoffeeVO[nameList.length];
		int i=0;
		for(String name : nameList) {					
			int price = priceList[i];
			
			CoffeeVO coffee = new CoffeeVO();
			coffee.setName(name);
			coffee.setPrice(price);
			
			coffeeList[i]=coffee;
			
			i++;
		}
	}//init
	
	
	public void showMenu() {
		System.out.println("______________________");
		System.out.println("________ 자판기 ________");
		System.out.println("______________________");
		int no=1;
		for(CoffeeVO list : coffeeList) {
			System.out.print(" "+no +" . "+list.getName()+"\t: ");
			System.out.print(list.getPrice()+"\n");
			no++;
		}
	}//showMenu

	
	public void canOrder(int num) {
		System.out.print("주문 가능 메뉴 : ");
		if(num>=1) {
			System.out.print("1.우유");
		}
		
		if(num>=2) {
			System.out.print(", 2.밀크커피, 3.유자차");
		}	
		
		if(num>=3) {
			System.out.print(", 4.아메리카노");
		}
		
	}
	/**
	 * 동전 입력받아, 체크한다.
	 */
	public void coinCheck(int oriCoin) {
			int coin=oriCoin;
			System.out.println("______________________");
			System.out.println("\n\t현재 투입액 : "+oriCoin);
			if(coin==0) {
				System.out.print("\n동전을 입력해 주세요 >>");					
				coin = oriCoin+ scan.nextInt();
			}else {
				System.out.println("동전을 넣으시겠습니까?(y/n)");
				String answer = scan.next();
				if(answer.equals("y"))
				{
						System.out.print("\n동전을 입력해 주세요 >>");					
						coin = oriCoin+ scan.nextInt();
						
				}else if(answer.equals("n")) {
					System.out.println("");
				}else {
					System.out.println("잘못 누르셨습니다.");
				}
			}
			boolean flag=true;
			
			while(flag) {
			if(coin>=200) {
				System.out.println("\n투입금액 >> "+coin);
				if(coin>=400) {
					canOrder(3);
				}else if(coin>=300) {
					canOrder(2);
				}else
					canOrder(1);
				System.out.println("\n\t동전을 추가하시려면 0번을 입력해주세요 >>");
				System.out.print("\n메뉴를 선택해주세요 >> ");
				int selNum=scan.nextInt();
				if(selNum!=0) {
					selectMenu(selNum, coin);
					flag=false;
				}else if(selNum==0) {
					coinCheck(coin);
				}
				
			}else {
				System.out.println("\n투입금액 >> "+coin);
				System.out.print("동전을 더 넣어주세요 >> ");
				coin=coin+scan.nextInt();
			}//if,else
		}//while			
			
	}//coinCheck
	
	
	public void selectMenu(int num,int oriCoin) {
		switch(num) {
			case 1:
				oriCoin=oriCoin-200;
//				choice_menu = coffeeList[num-1];
				System.out.println("\n\t"+coffeeList[num-1].getName()+"를 준비중입니다.");
				break;
				
			case 2:
				if(oriCoin<300) {
					printOrder(num,oriCoin);
				}else{
					oriCoin=oriCoin-300;
					System.out.println("\n\t"+coffeeList[num-1].getName()+"를 준비중입니다.");
				}
				break;
				
			case 3:
				if(oriCoin<300) {
					printOrder(num,oriCoin);
				}else {
					oriCoin=oriCoin-300;
					System.out.println("\n\t"+coffeeList[num-1].getName()+"를 준비중입니다.");
				}
				break;
			
			case 4:
				if(oriCoin<400) {
					printOrder(num,oriCoin);
				}else {
					oriCoin=oriCoin-400;
					System.out.println("\n\t"+coffeeList[num-1].getName()+"를 준비중입니다.");
				}
				break;
			
			default:
				System.out.println("잘못 누르셨습니다.");
				System.out.print("다시 선택해 주세요 : ");
				selectMenu(scan.nextInt(), oriCoin);
				break;
		}//switch
		if(oriCoin!=0) {
			System.out.println("잔돈을 반환하시겠습니까?(y/n)");
			String sel = scan.next();
			if(sel.equals("y")) {
			System.out.println("\n\t"+coffeeList[num-1].getName()+"와 잔돈을 챙겨주세요.");
			System.out.println("\t잔돈 : " +oriCoin);
			coinCheck(0);
			}else if(sel.equals("n")){
				System.out.println("\n\t"+coffeeList[num-1].getName()+"를 챙겨주세요.");
				System.out.println("남은돈 : "+oriCoin);
				coinCheck(oriCoin);
			}else {
				System.out.println("\n\t다시 선택해주세요.");
			}
		}else {
			System.out.println("\n\t"+coffeeList[num-1].getName()+"를 챙겨주세요.");
			coinCheck(0);
		}
	}//selectMenu
	
	public void printOrder(int num,int oriCoin) {
		System.out.println("\n\t"+coffeeList[num-1].getName()+"의 가격 >> "+coffeeList[num-1].getPrice());
		System.out.println("\t투입금액 >> "+oriCoin);
		System.out.println("\t주문이 불가능합니다");
		coinCheck(oriCoin);
	}
	
	
	
	
}//class


