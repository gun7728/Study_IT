package library_sys;

import java.util.Scanner;

public class Manager {
	
	String bookName,writerName,bookNum;
	int bookPrice;
	
	BookInfoVO info;	
	
	//å Ŭ�� ����
	public void setBookInfo(BookInfoVO info) {
		this.info=info;
	}	
	
	//å �̸�����
	
	
	
	
	public void setBookName() {
		System.out.print("���� >> ���� �̸� �Է� : ");
		Scanner scan = new Scanner(System.in);
		this.info.setBookName(scan.next());	
	}
	public String getBookName() {
		return this.info.getBookName();
	}

	
	//å ���� ����
	public void setWriterName() {
		System.out.print("���� >> ���� �̸� �Է� : ");
		Scanner scan = new Scanner(System.in);
		this.info.setWriterName(scan.next());	
	}
	public String getWriterName() {
		return this.info.getWriterName();
	}
	
	
	//å �ѹ� ����
	public void setBookNum() {
		System.out.print("���� >> å �ѹ� �Է� : ");
		Scanner scan = new Scanner(System.in);
		this.info.setBookNum(scan.next());	
	}
	public String getBookNum() {
		return this.info.getBookNum();
	}


	//å ���� ����
	public void setBookPrice() {
		System.out.print("���� >> å ���� �Է� : ");
		Scanner scan = new Scanner(System.in);
		this.info.setBookPrice(scan.nextInt());
	}
	public int getBookPrice() {
		return this.info.getBookPrice();
	}


}
