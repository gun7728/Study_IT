package 성적관리시스템;

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
				System.out.println("더 이상 추가 불가능합니다");
				flag=false;
			}
		}//while
		
		mgm.printInfo();
	}

}
