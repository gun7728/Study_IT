package banck_system;

public class Bankman {
	
	int change=500;				//ȫ�浿�� �ܾ�
	AccountVO nowPaper;
	
	
	public void setChange(int change) {this.change=change;}
	public int getChange() {return change;}
	
	public void setPaper(AccountVO paper) {
		System.out.println("3.���� > ���� ��������� �޴´�.");
		this.nowPaper = paper;
//		System.out.println("����\t: "+paper.getName());
//		System.out.println("���¹�ȣ\t: "+paper.getAccount());
//		System.out.println("�ݾ�\t: "+paper.getMoneyInfo());
		}
	public AccountVO getPaper() {return nowPaper;}
	
		
	
	//��ݿ��� üũ
	public void checkPaper() {
		System.out.println("4.���� > ���� ��������� üũ�Ѵ�.");
		//�̸�:1, ����:2, �ݾ�:3 (������)
		if(nowPaper.getName()==null) {					//null�� ��� ã�ư����������� equals�� ������� ���ϰ� ==�� ����ؾ��Ѵ�
			askAccount(1);
		}else if(nowPaper.getAccount().equals("")){
			askAccount(2);
		}else if(nowPaper.getMoney()==0)	{
			askAccount(3);
		}else {
		}
	}
	
	
	//�ݾ� ����
	public void askAccount(int checkResult) {
		System.out.println("5.���� > ���� ��������� üũ�� ����� �˷��ش�");
		switch(checkResult) {
		case 1:
			System.out.println("6.���� > �̸��� �˷��ּ���");			
			break;			
		case 2:
			System.out.println("6.���� > ���¹�ȣ�� �˷��ּ���");
			break;
			
		case 3:
			System.out.println("6.���� > �ݾ��� �˷��ּ���");
			break;
			
		default :
			break;		
		}
	}
	//�̸� Ȯ�� �� ��ݿ���(Paper)�� ����
	public void setName(String name) {
		System.out.println("8.���� > �̸�("+name+")�� Ȯ�εǾ����ϴ�.");
		this.nowPaper.setName(name);
	}
	
	
	//�ݾ� Ȯ�� �� ��ݿ���(Paper)�� ����
	public void setMoney(int money) {
		System.out.println("8.���� > ��ݾ� "+money+"������ Ȯ�εǾ����ϴ�.");
		this.nowPaper.setMoney(money);
	}
	
	//�ܾ� ó��
	public int changeProcess() {
		System.out.println("9.���� > �ܾ��� ó���Ѵ�.");
		return change - this.nowPaper.getMoney();
	}
}
