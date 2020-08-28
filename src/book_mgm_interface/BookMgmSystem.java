package book_mgm_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import commons.util.DataStandardManager;

public class BookMgmSystem implements DataStandardManager{
	//Field
	List<BookVO> bookList = new ArrayList<BookVO>();
	Scanner scan = new Scanner(System.in);
	
	//Constructor
	public BookMgmSystem() {
//		showMenu();
//		choiceMenu();		
	}	
	
	//Method
	/**
	 * �޴� ���
	 */
	public void showMenu() {
		System.out.println("==============================");
		System.out.println("\t���� ���� �ý���   ");
		System.out.println("==============================");	
		System.out.println("  1. �������� ���");
		System.out.println("  2. �������� ���");
		System.out.println("  3. �������� ����");
		System.out.println("  4. �������� ����");
		System.out.println("  5. ���α׷� ����");
		System.out.println("==============================");	
	}
	
	/**
	 * �޴� ����
	 */
	public void choiceMenu() {
		System.out.print("�޴� ����>");
	
		switch(scan.nextInt()) {
			case 1:		insert();			break;
			case 2:		select();			break;
			case 3:		update();			break;
			case 4:		delete();			break;
			case 5:		
				System.out.println("== ���α׷��� �����մϴ� ==");
				System.exit(0);
				break;
			default:
				System.out.println("�غ����Դϴ�");	
				choiceMenu();
		}
	}
	
	/**
	 * ������ȣ(ISBN) �ߺ�üũ
	 */
	public boolean isbnCheck(String isbn) {
		boolean result = false;
		
		for(BookVO book : bookList) {
			if(book.getIsbn() != null) {
				if(book.getIsbn().equals(isbn))
					result = true;
			}
		}
		
		return result;
	}
	
	/**
	 * �������� �Է�
	 */
	public Object input(String fname){
		BookVO book = null;
		
		if(fname.equals("insert")) {
			System.out.print("ISBN>");
			String isbn = scan.next();
			//boolean chk_result = isbnCheck(isbn);
			if(isbnCheck(isbn)) {
				System.out.println("== �̹� �ߺ��� �����Ͱ� �����մϴ� ==");
			}else {
				book = new BookVO();
				book.setIsbn(isbn);
				System.out.print("������>");
				book.setTitle(scan.next());
				
				System.out.print("����>");
				book.setAuthor(scan.next());
				
				System.out.print("����>");
				book.setPrice(scan.nextInt());
			}		
			
		}else {
			book = new BookVO();		
			System.out.print("������>");
			book.setTitle(scan.next());
			
			System.out.print("����>");
			book.setAuthor(scan.next());
			
			System.out.print("����>");
			book.setPrice(scan.nextInt());
		}	
		
		return book;
	}
	
	/**
	 * ���� ���
	 */
	public void insert() {
		BookVO book = (BookVO)input("insert");
		if(book != null) {			
			if(bookList.add(book)) {
				System.out.println("== ����� �Ϸ�Ǿ����ϴ�. ==");
			}else {
				System.out.println("== ��� �����Ͽ����ϴ�. ==");
			}
		}
		choiceMenu();
	}

	public boolean insert(BookVO book) {		
		boolean result = false;
		
		if(book != null) {	
			result = bookList.add(book);		
		}
		
		return result;
	}
	
	
	
	/**
	 * �������� ���
	 */
	public void select() {
		if(bookList.size() != 0) {
			System.out.println("********* �������� �ý��� *********");
			System.out.print("������ȣ\t������\t����\t����\n");
			System.out.println("-------------------------------");
			for(BookVO book : bookList) {
				if(book != null) {
					System.out.print(book.getIsbn()+"\t");
					System.out.print(book.getTitle()+"\t");
					System.out.print(book.getAuthor()+"\t");
					System.out.print(book.getPrice()+"\n");
				}
			}
			System.out.println("-------------------------------");
		}else {
			System.out.println("== �����Ͱ� �������� �ʽ��ϴ�. ��Ϻ��� �������ּ���. ==");
		}
		
	}
	
	
	public List<BookVO> selectList() {
		
		return bookList;
	}
	
	/**
	 * �ε��� �˻�
	 */
	public int searchAddress(String isbn) {
		int idx = -1;
		
		for(BookVO book : bookList) {
			if(book != null) {
				if(book.getIsbn().equals(isbn)) {
					idx = bookList.indexOf(book);
				}
			}
		}
		
		return idx;
	}
	
	/**
	 * �������� ����
	 */
	public void update() {
		System.out.print("������ ISBN>");
		String isbn = scan.next();
		int update_idx = searchAddress(isbn);
		
		if(update_idx != -1) {
			BookVO update_book = (BookVO)input("update");
			update_book.setIsbn(isbn);
			
			bookList.set(update_idx, update_book);
			System.out.println("== ������ �Ϸ�Ǿ����ϴ�. ==");
		}else {
			System.out.println("== �ش� �����Ͱ� �������� �ʽ��ϴ�. ==");	
		}
	
		choiceMenu();
	}
	
	/**
	 * �������� ����
	 */
	public void delete() {
		System.out.print("������ ISBN>");
		String isbn = scan.next();
		int delete_idx = searchAddress(isbn);
		
		if(delete_idx != -1) {
			bookList.remove(delete_idx);
			System.out.println("== ������ �Ϸ�Ǿ����ϴ�. ==");
		}else {
			System.out.println("== �ش� �����Ͱ� �������� �ʽ��ϴ�. ==");			
		}
		
		choiceMenu();
	}

	
}






















