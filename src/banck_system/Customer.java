package banck_system;

import java.util.jar.Attributes.Name;

public class Customer {
	
	int change,money;
	AccountVO paper;
	
	public void setChange(int change) {	this.change=change;}
	public int getChange() { return change;}
	
	
	//��� ���� ����
	public void setPaper(AccountVO paper) { 
		System.out.println("1.�� : ��ݿ����� ������ ���´�.");
//		paper.setName("ȫ�浿");
		paper.setAccount("1-2-3-4");
		paper.setMoney(100);
//		System.out.println(paper.getName());
//		System.out.println(paper.getAccount());
//		System.out.println(paper.getMoneyInfo());
		this.paper=paper;
	}
	

	
	
	//��� ���� �ֱ�
	public AccountVO getPaper() { 
		System.out.println("2.�� : ��ݿ����� �������� �����Ѵ�.");
		return paper;		
		}
	
	
	//�̸� �˷��ֱ�
	public String getName() {
		System.out.println("7.�� : �̸��� ȫ�浿 �Դϴ�.");
		return "ȫ�浿";
	}
	
	
	//��ݾ� �˷��ֱ�
	public int getMoney() {
		System.out.println("7.�� : ��ݾ��� 100���� �Դϴ�.");
		return 100;
	}
	
	public void confirmChange(int change) {
		System.out.println("10.�� : �ܾ� "+change+"���� Ȯ��");
	}
	
	
	
	
	//�ܾ� Ȯ��
	
	
	

}
