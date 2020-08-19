package library_sys_2;

import java.util.Scanner;

public class BookStaff {
	
	
	//객체는 무거우니 필요할때 활성화 시켜주자
	BookVO vo;
	Scanner scan = new Scanner(System.in);
	
	
	public BookVO input(){
		vo=new BookVO();
		
		System.out.print("도서번호\t: ");
		vo.setIsbn(scan.next());
		
		System.out.print("도서명\t: ");
		vo.setTitle(scan.next());
		
		System.out.print("저자\t: ");
		vo.setAuthor(scan.next());
		
		System.out.print("가격\t: ");
		vo.setPrice(scan.nextInt());
		
		
		return vo;
	}
	
	public boolean input_con() {
		boolean flag=false;
		System.out.println("입력을 계속 진행 하시겠습니까?(y/n)");
		String result=scan.next();
		if(result.equals("y")){
			flag=true;		
		}
			
		return flag;
	}
}









