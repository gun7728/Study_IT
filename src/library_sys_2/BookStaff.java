package library_sys_2;

import java.util.Scanner;

public class BookStaff {
	
	
	//��ü�� ���ſ�� �ʿ��Ҷ� Ȱ��ȭ ��������
	BookVO vo;
	Scanner scan = new Scanner(System.in);
	
	
	public BookVO input(){
		vo=new BookVO();
		
		System.out.print("������ȣ\t: ");
		vo.setIsbn(scan.next());
		
		System.out.print("������\t: ");
		vo.setTitle(scan.next());
		
		System.out.print("����\t: ");
		vo.setAuthor(scan.next());
		
		System.out.print("����\t: ");
		vo.setPrice(scan.nextInt());
		
		
		return vo;
	}
	
	public boolean input_con() {
		boolean flag=false;
		System.out.println("�Է��� ��� ���� �Ͻðڽ��ϱ�?(y/n)");
		String result=scan.next();
		if(result.equals("y")){
			flag=true;		
		}
			
		return flag;
	}
}









