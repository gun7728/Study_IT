package ���������ý���;

import java.util.Scanner;

public class Staff {
	
	StuVO vo;
	
	Scanner scan = new Scanner(System.in);	
	
	public StuVO inPut() {
		vo = new StuVO();
		System.out.print("�̸��� �Է��� �ּ��� : ");
		vo.setStuName(scan.next());
		
		System.out.print("���� ������ �Է��� �ּ��� : ");
		vo.setKor(scan.nextInt());
		
		
		System.out.print("���� ������ �Է��� �ּ��� : ");
		vo.setEng(scan.nextInt());
		
		
		System.out.print("���� ������ �Է��� �ּ��� : ");
		vo.setMath(scan.nextInt());
		
		
		System.out.print("�ڹ� ������ �Է��� �ּ��� : ");
		vo.setJava(scan.nextInt());
		
		
		return vo; 
	}
	
	public boolean inPut_con() {
		boolean flag=true;
		System.out.println("�� ��� �Ͻðڽ��ϱ�?(y/n)");
		if(scan.next().equals("y")) {
			flag=true;	
			
		}else
			flag=false;	
		
		return flag;
	}
		
}
