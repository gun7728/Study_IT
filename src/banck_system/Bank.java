package banck_system;

public class Bank {	
		

	
	public static void main(String args[]) {
		
		//new�� �̿��ϸ� ���ο� ��ü�� �����ȴ�.
		Bankman ���� = new Bankman();				
		AccountVO ��ݿ��� = new AccountVO();			//��ݿ��� ����		
		Customer ȫ�浿 = new Customer();				//��		
		
		ȫ�浿.setPaper(��ݿ���);						//ȫ�浿���� ��ݿ��� ����
		����.setPaper(ȫ�浿.getPaper());				//���� ������ ������ ����
		����.checkPaper();
		����.setName(ȫ�浿.getName());
//		����.setMoney(ȫ�浿.getMoney());
		����.checkPaper();
		ȫ�浿.confirmChange(����.changeProcess());
		
	}
	
}//class
