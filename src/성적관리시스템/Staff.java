package 성적관리시스템;

import java.util.Scanner;

public class Staff {
	
	StuVO vo;
	
	Scanner scan = new Scanner(System.in);	
	
	public StuVO inPut() {
		vo = new StuVO();
		System.out.print("이름을 입력해 주세요 : ");
		vo.setStuName(scan.next());
		
		System.out.print("국어 성적을 입력해 주세요 : ");
		vo.setKor(scan.nextInt());
		
		
		System.out.print("영어 성적을 입력해 주세요 : ");
		vo.setEng(scan.nextInt());
		
		
		System.out.print("수학 성적을 입력해 주세요 : ");
		vo.setMath(scan.nextInt());
		
		
		System.out.print("자바 성적을 입력해 주세요 : ");
		vo.setJava(scan.nextInt());
		
		
		return vo; 
	}
	
	public boolean inPut_con() {
		boolean flag=true;
		System.out.println("더 등록 하시겠습니까?(y/n)");
		if(scan.next().equals("y")) {
			flag=true;	
			
		}else
			flag=false;	
		
		return flag;
	}
		
}
