package banck_system;

public class AccountVO {
	
	String name;	//�ʱ�ȭ �����ָ� null�� �Էµȴ�
	String accNum="";
	int money;

	
	public void setName(String name) {	this.name=name;	}	
	public String getName() {	return name;}	
	
	
	public void setAccount(String accNum) {	this.accNum=accNum;}		
	public String getAccount() {	return accNum;}
	
	
	public void setMoney(int money) {	this.money=money;}
	public int getMoney() {	return money;}
}
