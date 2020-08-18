package library_sys;

import java.util.Scanner;

public class Library_mgm {

	public static void main(String[] args) {
		
		int selNum;
		
		BookInfoVO info = new BookInfoVO();
		Manager employee = new Manager();
		
		employee.setBookInfo(info);			//책 정보의 클론을 객체로 생성하여 넣는다
		
		employee.setBookName();
		employee.setWriterName();
		employee.setBookNum();
		employee.setBookPrice();
		
		System.out.println("저장 완료");
		boolean flag=true;
		while(flag) {
			System.out.println("\n원하는 기능을 선택해 주세요");
			System.out.println("1.조회");
			Scanner scan = new Scanner(System.in);
			selNum=scan.nextInt();
			
			switch(selNum) {
			case 1:
				System.out.println("\n도서명\t: "+employee.getBookName());
				System.out.println("저자\t: "+employee.getWriterName());
				System.out.println("도서번호\t: "+employee.getBookNum());
				System.out.println("가격\t: "+employee.getBookPrice());
				break;
			default:
				flag=false;
				break;
			}
		}//while
	}

}
