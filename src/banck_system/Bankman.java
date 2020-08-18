package banck_system;

public class Bankman {
	
	int change=500;				//홍길동의 잔액
	AccountVO nowPaper;
	
	
	public void setChange(int change) {this.change=change;}
	public int getChange() {return change;}
	
	public void setPaper(AccountVO paper) {
		System.out.println("3.직원 > 고객의 출금정보를 받는다.");
		this.nowPaper = paper;
//		System.out.println("고객명\t: "+paper.getName());
//		System.out.println("계좌번호\t: "+paper.getAccount());
//		System.out.println("금액\t: "+paper.getMoneyInfo());
		}
	public AccountVO getPaper() {return nowPaper;}
	
		
	
	//출금용지 체크
	public void checkPaper() {
		System.out.println("4.직원 > 고객의 출금정보를 체크한다.");
		//이름:1, 계좌:2, 금액:3 (없으면)
		if(nowPaper.getName()==null) {					//null의 경우 찾아갈수없음으로 equals를 사용하지 못하고 ==을 사용해야한다
			askAccount(1);
		}else if(nowPaper.getAccount().equals("")){
			askAccount(2);
		}else if(nowPaper.getMoney()==0)	{
			askAccount(3);
		}else {
		}
	}
	
	
	//금액 묻기
	public void askAccount(int checkResult) {
		System.out.println("5.직원 > 고객의 출금정보를 체크한 결과를 알려준다");
		switch(checkResult) {
		case 1:
			System.out.println("6.직원 > 이름을 알려주세요");			
			break;			
		case 2:
			System.out.println("6.직원 > 계좌번호를 알려주세요");
			break;
			
		case 3:
			System.out.println("6.직원 > 금액을 알려주세요");
			break;
			
		default :
			break;		
		}
	}
	//이름 확인 후 출금용지(Paper)에 적기
	public void setName(String name) {
		System.out.println("8.직원 > 이름("+name+")이 확인되었습니다.");
		this.nowPaper.setName(name);
	}
	
	
	//금액 확인 후 출금용지(Paper)에 적기
	public void setMoney(int money) {
		System.out.println("8.직원 > 출금액 "+money+"만원이 확인되었습니다.");
		this.nowPaper.setMoney(money);
	}
	
	//잔액 처리
	public int changeProcess() {
		System.out.println("9.직원 > 잔액을 처리한다.");
		return change - this.nowPaper.getMoney();
	}
}
