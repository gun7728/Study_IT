package banck_system;

public class AccountVO {
	
	String name;	//초기화 안해주면 null로 입력된다
	String accNum="";
	int money;

	
	public void setName(String name) {	this.name=name;	}	
	public String getName() {	return name;}	
	
	
	public void setAccount(String accNum) {	this.accNum=accNum;}		
	public String getAccount() {	return accNum;}
	
	
	public void setMoney(int money) {	this.money=money;}
	public int getMoney() {	return money;}
}
