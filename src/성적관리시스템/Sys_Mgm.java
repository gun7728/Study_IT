package 성적관리시스템;

public class Sys_Mgm {
	
	int count=0;
	StuVO[] stuList = new StuVO[3];


	public void insertInfo(StuVO vo) {
		for(int i=count;i<stuList.length;i++) {
			
			stuList[i]=vo;
			System.out.println("등록이 완료되었습니다.");
			
			if(stuList[i]!=null) {				
				count++;
				i=stuList.length;
			}
			
			
			
		}
	
	}//insertInfo
	
	public void printInfo() {
		
		System.out.println("===================================");
		System.out.println("============성적등록시스템 ============");
		System.out.println("===================================");
		System.out.println("이름\t국어\t영어\t수학\t자바");
		System.out.println("-----------------------------------");
		
		for(int i=0;i<count;i++) {
			System.out.print(""+stuList[i].getStuName());
			System.out.print("\t"+stuList[i].getKor());
			System.out.print("\t"+stuList[i].getEng());
			System.out.print("\t"+stuList[i].getMath());
			System.out.println("\t"+stuList[i].getJava());
		}
	}


}
