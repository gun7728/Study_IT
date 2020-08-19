package library_sys_2;

public class GangnamLib {

	public static void main(String[] args) {
		BookStaff staff = new BookStaff();	
		BookMgm mgm = new BookMgm();
		
		boolean flag=true;
		
		while(flag) {
			mgm.insert(staff.input());
			flag=staff.input_con();
			
//			System.out.println("flag--->"+flag);
		}
//		System.out.println("시스템 종료");
		mgm.outPut();
		}

}

