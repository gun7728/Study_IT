package library_sys;

import java.util.Scanner;

public class Library_mgm {

	public static void main(String[] args) {
		
		int selNum;
		
		BookInfoVO info = new BookInfoVO();
		Manager employee = new Manager();
		
		employee.setBookInfo(info);			//å ������ Ŭ���� ��ü�� �����Ͽ� �ִ´�
		
		employee.setBookName();
		employee.setWriterName();
		employee.setBookNum();
		employee.setBookPrice();
		
		System.out.println("���� �Ϸ�");
		boolean flag=true;
		while(flag) {
			System.out.println("\n���ϴ� ����� ������ �ּ���");
			System.out.println("1.��ȸ");
			Scanner scan = new Scanner(System.in);
			selNum=scan.nextInt();
			
			switch(selNum) {
			case 1:
				System.out.println("\n������\t: "+employee.getBookName());
				System.out.println("����\t: "+employee.getWriterName());
				System.out.println("������ȣ\t: "+employee.getBookNum());
				System.out.println("����\t: "+employee.getBookPrice());
				break;
			default:
				flag=false;
				break;
			}
		}//while
	}

}
