package library_sys;

import java.util.Scanner;

public class Manager {
	
	String bookName,writerName,bookNum;
	int bookPrice;
	
	BookInfoVO info;	
	
	//책 클론 생성
	public void setBookInfo(BookInfoVO info) {
		this.info=info;
	}	
	
	//책 이름설정
	
	
	
	
	public void setBookName() {
		System.out.print("직원 >> 도서 이름 입력 : ");
		Scanner scan = new Scanner(System.in);
		this.info.setBookName(scan.next());	
	}
	public String getBookName() {
		return this.info.getBookName();
	}

	
	//책 저자 설정
	public void setWriterName() {
		System.out.print("직원 >> 저자 이름 입력 : ");
		Scanner scan = new Scanner(System.in);
		this.info.setWriterName(scan.next());	
	}
	public String getWriterName() {
		return this.info.getWriterName();
	}
	
	
	//책 넘버 설정
	public void setBookNum() {
		System.out.print("직원 >> 책 넘버 입력 : ");
		Scanner scan = new Scanner(System.in);
		this.info.setBookNum(scan.next());	
	}
	public String getBookNum() {
		return this.info.getBookNum();
	}


	//책 가격 설정
	public void setBookPrice() {
		System.out.print("직원 >> 책 가격 입력 : ");
		Scanner scan = new Scanner(System.in);
		this.info.setBookPrice(scan.nextInt());
	}
	public int getBookPrice() {
		return this.info.getBookPrice();
	}


}
