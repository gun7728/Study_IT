/**
 * 보검씨는 휴게소의 커피자판기에서 300원짜리 밀크 커피를 마시려고 한다. 먼저, 500원짜리 동전을 넣고, 밀크커피를 선택한다. 커피제조 중 이라는 메시지가 뜨면서, 잠시후 보검씨는 커피와 거스름돈 200원을받는다.
참고 - 커피자판기의 메뉴는 밀크커피(300원), 아메리카노(400원), 유자차(300원), 우유(200원) 이다.

1. 메뉴생성 및 출력
2. 데이터 저장
3. 주문 & 잔돈
4. 메뉴 전달
 * 
 */
package coffee_machine_stru;

import java.util.Scanner;

public class CoffeeMachineTest {

	public static void main(String[] args) {
		//1.메뉴생성 및 출력
		Scanner scan = new Scanner(System.in);
		
		int menuNum=0;
		String sel="";
		String[] menu = new String[menuNum];
		int[] price = new int[menuNum];
		int selNum =0;
		int inPrice=0;
		
		boolean flag=true;
		boolean coinFlag=true;
		
		while(flag) {
			System.out.println();
			System.out.println("주문하시겠습니까? (y/n)");
			System.out.print("선택 : ");
			sel=scan.next();
			if(sel.equals("y")) {					//메뉴 선택
				coinFlag=true;
				if(menuNum!=0) 
				{
					System.out.println("\n메뉴를 선택해 주세요.");		
					System.out.println("0. 취소");			
					for(int i=0;i<menu.length;i++) {
						System.out.print((i+1)+". "+menu[i]+" : "+price[i]+"\t");
					}//메뉴 출력
					System.out.print("\n선택 : ");						
					selNum=(scan.nextInt()-1);
					if(selNum!=-1)
					{
						if(selNum<menu.length) 
						{					
							System.out.print("\n"+menu[selNum]+"의 가격 : ");
							System.out.println(price[selNum]+"원을 입금해 주세요.");
							System.out.print("입금 : ");
							inPrice=scan.nextInt();
							while(coinFlag) 
							{
								if(inPrice<price[selNum]) {
									System.out.println((price[selNum]-inPrice)+"원이 부족합니다");
									System.out.print("입금 : ");	
									inPrice=inPrice+scan.nextInt();							
								}if(inPrice==price[selNum]) {
									System.out.println("\n"+menu[selNum]+"을(를) 챙겨주세요.");
									coinFlag=false;
								}else if(inPrice>price[selNum])
								{
									System.out.println("거스름돈 "+(inPrice-price[selNum])+ "원과 "+menu[selNum]+"을(를) 챙겨주세요.");			
									coinFlag=false;
								}
							}
									
							
						}else
							System.out.println("\n다시 선택해 주세요");
					}else if(selNum==-1) 
						System.out.println("\n\t취소");
					
				}else
					System.out.println("관리자 모드로 메뉴를 설정해 주세요.");
				

				
			}else if(sel.equals("n")) {				//종료
				System.out.println("종료합니다.");
				flag=false;
			}else if(sel.equals("mgm")) 			//관리자 모드
			{
				System.out.print("\n메뉴의 갯수를 입력해 주세요 : "); //메뉴 개수
				menuNum=scan.nextInt();	
				menu = new String[menuNum];
				price = new int[menuNum];
				for(int i=0;i<menu.length;i++) 
				{
					System.out.print("\n메뉴를 추가해주세요 : ");
					menu[i] = scan.next();
					System.out.print(menu[i]+"의 가격을 입력해 주세요 : ");
					price[i] = scan.nextInt();
					
				}//for
			}else if(sel.equals("edit"))
			{
				
			}else
				System.out.println("다시 선택해 주세요");	//다시선택
		}//while

	}//main

}//while
