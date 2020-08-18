package banck_system;

import java.util.jar.Attributes.Name;

public class Customer {
	
	int change,money;
	AccountVO paper;
	
	public void setChange(int change) {	this.change=change;}
	public int getChange() { return change;}
	
	
	//출금 용지 적기
	public void setPaper(AccountVO paper) { 
		System.out.println("1.고객 : 출금용지에 정보를 적는다.");
//		paper.setName("홍길동");
		paper.setAccount("1-2-3-4");
		paper.setMoney(100);
//		System.out.println(paper.getName());
//		System.out.println(paper.getAccount());
//		System.out.println(paper.getMoneyInfo());
		this.paper=paper;
	}
	

	
	
	//출금 용지 주기
	public AccountVO getPaper() { 
		System.out.println("2.고객 : 출금용지를 직원에게 전달한다.");
		return paper;		
		}
	
	
	//이름 알려주기
	public String getName() {
		System.out.println("7.고객 : 이름은 홍길동 입니다.");
		return "홍길동";
	}
	
	
	//출금액 알려주기
	public int getMoney() {
		System.out.println("7.고객 : 출금액은 100만원 입니다.");
		return 100;
	}
	
	public void confirmChange(int change) {
		System.out.println("10.고객 : 잔액 "+change+"만원 확인");
	}
	
	
	
	
	//잔액 확인
	
	
	

}
