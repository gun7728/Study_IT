package ���������ý���;

public class HighSchool {

	public static void main(String[] args) {

		Sys_Mgm mgm = new Sys_Mgm();
		Staff staff = new Staff();
		boolean flag=true;
		
		while(flag) {
			if(mgm.count!=mgm.stuList.length) {
			mgm.insertInfo(staff.inPut());
			flag=staff.inPut_con();			
			}else {
				System.out.println("�� �̻� �߰� �Ұ����մϴ�");
				flag=false;
			}
		}//while
		
		mgm.printInfo();
	}

}
