package banck_system;

public class Bank {	
		

	
	public static void main(String args[]) {
		
		//new를 이용하면 새로운 객체가 생성된다.
		Bankman 직원 = new Bankman();				
		AccountVO 출금용지 = new AccountVO();			//출금용지 생성		
		Customer 홍길동 = new Customer();				//고객		
		
		홍길동.setPaper(출금용지);						//홍길동에게 출금용지 전달
		직원.setPaper(홍길동.getPaper());				//적은 용지를 직원이 수령
		직원.checkPaper();
		직원.setName(홍길동.getName());
//		직원.setMoney(홍길동.getMoney());
		직원.checkPaper();
		홍길동.confirmChange(직원.changeProcess());
		
	}
	
}//class
