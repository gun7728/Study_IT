package ���������ý���;

public class Sys_Mgm {
	
	int count=0;
	StuVO[] stuList = new StuVO[3];


	public void insertInfo(StuVO vo) {
		for(int i=count;i<stuList.length;i++) {
			
			stuList[i]=vo;
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			
			if(stuList[i]!=null) {				
				count++;
				i=stuList.length;
			}
			
			
			
		}
	
	}//insertInfo
	
	public void printInfo() {
		
		System.out.println("===================================");
		System.out.println("============������Ͻý��� ============");
		System.out.println("===================================");
		System.out.println("�̸�\t����\t����\t����\t�ڹ�");
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
