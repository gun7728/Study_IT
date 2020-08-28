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
	 * 메뉴 출력
	 */
	public void showMenu() {
		System.out.println("==============================");
		System.out.println("\t도서 관리 시스템   ");
		System.out.println("==============================");	
		System.out.println("  1. 도서정보 등록");
		System.out.println("  2. 도서정보 출력");
		System.out.println("  3. 도서정보 수정");
		System.out.println("  4. 도서정보 삭제");
		System.out.println("  5. 프로그램 종료");
		System.out.println("==============================");	
	}
	
	/**
	 * 메뉴 선택
	 */
	public void choiceMenu() {
		System.out.print("메뉴 선택>");
	
		switch(scan.nextInt()) {
			case 1:		insert();			break;
			case 2:		select();			break;
			case 3:		update();			break;
			case 4:		delete();			break;
			case 5:		
				System.out.println("== 프로그램을 종료합니다 ==");
				System.exit(0);
				break;
			default:
				System.out.println("준비중입니다");	
				choiceMenu();
		}
	}
	
	/**
	 * 도서번호(ISBN) 중복체크
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
	 * 도서정보 입력
	 */
	public Object input(String fname){
		BookVO book = null;
		
		if(fname.equals("insert")) {
			System.out.print("ISBN>");
			String isbn = scan.next();
			//boolean chk_result = isbnCheck(isbn);
			if(isbnCheck(isbn)) {
				System.out.println("== 이미 중복된 데이터가 존재합니다 ==");
			}else {
				book = new BookVO();
				book.setIsbn(isbn);
				System.out.print("도서명>");
				book.setTitle(scan.next());
				
				System.out.print("저자>");
				book.setAuthor(scan.next());
				
				System.out.print("가격>");
				book.setPrice(scan.nextInt());
			}		
			
		}else {
			book = new BookVO();		
			System.out.print("도서명>");
			book.setTitle(scan.next());
			
			System.out.print("저자>");
			book.setAuthor(scan.next());
			
			System.out.print("가격>");
			book.setPrice(scan.nextInt());
		}	
		
		return book;
	}
	
	/**
	 * 도서 등록
	 */
	public void insert() {
		BookVO book = (BookVO)input("insert");
		if(book != null) {			
			if(bookList.add(book)) {
				System.out.println("== 등록이 완료되었습니다. ==");
			}else {
				System.out.println("== 등록 실패하였습니다. ==");
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
	 * 도서정보 출력
	 */
	public void select() {
		if(bookList.size() != 0) {
			System.out.println("********* 도서관리 시스템 *********");
			System.out.print("도서번호\t도서명\t저자\t가격\n");
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
			System.out.println("== 데이터가 존재하지 않습니다. 등록부터 진행해주세요. ==");
		}
		
	}
	
	
	public List<BookVO> selectList() {
		
		return bookList;
	}
	
	/**
	 * 인덱스 검색
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
	 * 도서정보 수정
	 */
	public void update() {
		System.out.print("수정할 ISBN>");
		String isbn = scan.next();
		int update_idx = searchAddress(isbn);
		
		if(update_idx != -1) {
			BookVO update_book = (BookVO)input("update");
			update_book.setIsbn(isbn);
			
			bookList.set(update_idx, update_book);
			System.out.println("== 수정이 완료되었습니다. ==");
		}else {
			System.out.println("== 해당 데이터가 존재하지 않습니다. ==");	
		}
	
		choiceMenu();
	}
	
	/**
	 * 도서정보 삭제
	 */
	public void delete() {
		System.out.print("삭제할 ISBN>");
		String isbn = scan.next();
		int delete_idx = searchAddress(isbn);
		
		if(delete_idx != -1) {
			bookList.remove(delete_idx);
			System.out.println("== 삭제가 완료되었습니다. ==");
		}else {
			System.out.println("== 해당 데이터가 존재하지 않습니다. ==");			
		}
		
		choiceMenu();
	}

	
}






















