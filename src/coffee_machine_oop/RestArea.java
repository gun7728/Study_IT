package coffee_machine_oop;

public class RestArea {

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("========= 평창 휴게소 입니다 ==========");
		System.out.println("================================");

		//park.<<의 의미는 Customer(heap의 주소)위치까지 이동	
		
		Customer park = new Customer();				
		CoffeeMachine machine = new CoffeeMachine();
		
		boolean flag=true;
		
		machine.showMenu();
		
		while(flag) {
			if(machine.coinCheck(park.insertCoin())) {
//				machine.orderMenu();
//				machine.giveMenu();
				park.coin=0;
			}
		}
	}//main

}//class
