package coffee_machine_oop;

public class RestArea {

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("========= ��â �ްԼ� �Դϴ� ==========");
		System.out.println("================================");

		//park.<<�� �ǹ̴� Customer(heap�� �ּ�)��ġ���� �̵�	
		
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
