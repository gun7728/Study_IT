package book_mgm_interface;

import java.util.ArrayList;
import java.util.Scanner;

import commons.util.DataStandardManager;

public class BookMgmSystem implements DataStandardManager {
	//Field
	ArrayList<BookVO> bookList = new ArrayList<BookVO>();
	
	Scanner scan = new Scanner(System.in);
	
	
	//Constructor
	public BookMgmSystem() {
		showMenu();
		choiceMenu();
	}
	
	//Method
	
	/**
	 * �������� �Է�
	 */
	public Object input(String fname){
		BookVO book = new BookVO();
		System.out.println("\n\t����� �����մϴ�.");
				
		if(fname.equals("insert")){
			System.out.print("ISBN>>");
			String isbn = scan.next();
			if(bookList.size()==0) {				
				book.setIsbn(isbn);				
			}else {				
				if(searchAddress(isbn)!=-1) {					
					if(isbn.equals(bookList.get(searchAddress(isbn)).getIsbn())) {
						System.out.println("\n\t�ߺ��ϴ� ���� �����մϴ�");
						choiceMenu();
					}//equals					
				}else {
					book.setIsbn(isbn);						
				}//searchAddress
				
			}//size
			
		} 
		
		System.out.print("������>>");
		book.setTitle(scan.next());
		
		System.out.print("����>>");
		book.setAuthor(scan.next());
		
		System.out.print("����>>");
		book.setPrice(scan.nextInt());
		
		return book;
	}

	/**
	 * �������� ���
	 */
	public void insert(){
		BookVO book = (BookVO)input("insert");
		boolean result = bookList.add(book);
		if(result){
			System.out.println("\n\t��� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("\n\t��� �����Ͽ����ϴ�.");
		}
		System.out.println("size---->>"+bookList.size());
		
		choiceMenu();
	}
	
	/**
	 * �������� ���
	 */
	public void select(){
		if(bookList.size()!=0) {
			System.out.println("������ȣ\t������\t����\t����");
			for(BookVO book : bookList) {
				System.out.print(book.getIsbn());
				System.out.print("\t"+book.getTitle());
				System.out.print("\t"+book.getAuthor());
				System.out.println("\t"+book.getPrice());
			}
			}else {
				System.out.println("��Ϻ��� ���ּ���");
		}
		
		
		choiceMenu();
	}
	
	/**
	 * �������� ����
	 */
	public void update(){		
		
		System.out.print("�����Ͻ� ISBN�� �Է����ּ���>>");		
		String isbn = scan.next();
		int update_idx=searchAddress(isbn);	
		
		if(update_idx!=-1) {
			BookVO update_book =(BookVO)input("update");	
			update_book.setIsbn(isbn);
			bookList.set(update_idx, update_book);
			System.out.println("\n\t�����Ϸ�");
		}else {
			System.out.println("�ش� ISBN�� �����ϴ�.");
		}
			
		choiceMenu();
	}
	
	/**
	 * ������ġ ã�� 
	 */
	public int searchAddress(String isbn) {
		int idx=-1;
		
		for(BookVO book : bookList) {
			if(book != null) {
				if(book.getIsbn().equals(isbn)) {
					idx=bookList.indexOf(book);
				}						
			}else{
				System.out.println("�ش� ISBN�� �����ϴ�.");
			}
		}
		
		return idx;
	}
	
	/*
	 * �������� ����
	 */
	public void delete(){
		System.out.print("�����Ͻ� ISBN�� �Է����ּ���>>");		
		String isbn = scan.next();
		int delete_idx=searchAddress(isbn);	
		if(delete_idx!=-1) {
			bookList.remove(delete_idx);
			System.out.println("\n\t������ �Ϸ�Ǿ����ϴ�");
		}else {
			System.out.println("��Ϻ��� ���ּ���");
		}
		
		choiceMenu();
	}
	
	/**
	 * �޴� ���
	 */
	public void showMenu() {
		System.out.println("==============================");
		System.out.println("\t���� ���� �ý���   ");
		System.out.println("==============================");	
		System.out.println("  1. ���� ���");
		System.out.println("  2. ���� ��ȸ");
		System.out.println("  3. ���� ����");
		System.out.println("  4. ���� ����");
		System.out.println("  5. ���α׷� ����");
		System.out.println("==============================");	
	}

	 
	/**
	 * �޴� ����
	 */
	public void choiceMenu() {
		System.out.print("\n�޴� ����>");
		
		switch(scan.nextInt()) {
		case 1:		insert();		break;
		case 2:		select();		break;
		case 3:		update();		break;
		case 4:		delete();		break;
		
		case 5:		
			System.out.println("== ���α׷��� �����մϴ� ==");
			System.exit(0);	
			break;
			
		default:
			System.out.println("�غ���~");
		}
	}	


}
