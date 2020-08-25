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
	 * 도서정보 입력
	 */
	public Object input(String fname){
		BookVO book = new BookVO();
		System.out.println("\n\t등록을 시작합니다.");
				
		if(fname.equals("insert")){
			System.out.print("ISBN>>");
			String isbn = scan.next();
			if(bookList.size()==0) {				
				book.setIsbn(isbn);				
			}else {				
				if(searchAddress(isbn)!=-1) {					
					if(isbn.equals(bookList.get(searchAddress(isbn)).getIsbn())) {
						System.out.println("\n\t중복하는 값이 존재합니다");
						choiceMenu();
					}//equals					
				}else {
					book.setIsbn(isbn);						
				}//searchAddress
				
			}//size
			
		} 
		
		System.out.print("도서명>>");
		book.setTitle(scan.next());
		
		System.out.print("저자>>");
		book.setAuthor(scan.next());
		
		System.out.print("가격>>");
		book.setPrice(scan.nextInt());
		
		return book;
	}

	/**
	 * 도서정보 등록
	 */
	public void insert(){
		BookVO book = (BookVO)input("insert");
		boolean result = bookList.add(book);
		if(result){
			System.out.println("\n\t등록 완료되었습니다.");
		}else {
			System.out.println("\n\t등록 실패하였습니다.");
		}
		System.out.println("size---->>"+bookList.size());
		
		choiceMenu();
	}
	
	/**
	 * 도서정보 출력
	 */
	public void select(){
		if(bookList.size()!=0) {
			System.out.println("도서번호\t도서명\t저자\t가격");
			for(BookVO book : bookList) {
				System.out.print(book.getIsbn());
				System.out.print("\t"+book.getTitle());
				System.out.print("\t"+book.getAuthor());
				System.out.println("\t"+book.getPrice());
			}
			}else {
				System.out.println("등록부터 해주세요");
		}
		
		
		choiceMenu();
	}
	
	/**
	 * 도서정보 수정
	 */
	public void update(){		
		
		System.out.print("수정하실 ISBN을 입력해주세요>>");		
		String isbn = scan.next();
		int update_idx=searchAddress(isbn);	
		
		if(update_idx!=-1) {
			BookVO update_book =(BookVO)input("update");	
			update_book.setIsbn(isbn);
			bookList.set(update_idx, update_book);
			System.out.println("\n\t수정완료");
		}else {
			System.out.println("해당 ISBN이 없습니다.");
		}
			
		choiceMenu();
	}
	
	/**
	 * 도서위치 찾기 
	 */
	public int searchAddress(String isbn) {
		int idx=-1;
		
		for(BookVO book : bookList) {
			if(book != null) {
				if(book.getIsbn().equals(isbn)) {
					idx=bookList.indexOf(book);
				}						
			}else{
				System.out.println("해당 ISBN이 없습니다.");
			}
		}
		
		return idx;
	}
	
	/*
	 * 도서정보 삭제
	 */
	public void delete(){
		System.out.print("삭제하실 ISBN을 입력해주세요>>");		
		String isbn = scan.next();
		int delete_idx=searchAddress(isbn);	
		if(delete_idx!=-1) {
			bookList.remove(delete_idx);
			System.out.println("\n\t삭제가 완료되었습니다");
		}else {
			System.out.println("등록부터 해주세요");
		}
		
		choiceMenu();
	}
	
	/**
	 * 메뉴 출력
	 */
	public void showMenu() {
		System.out.println("==============================");
		System.out.println("\t성적 관리 시스템   ");
		System.out.println("==============================");	
		System.out.println("  1. 성적 등록");
		System.out.println("  2. 성적 조회");
		System.out.println("  3. 성적 수정");
		System.out.println("  4. 성적 삭제");
		System.out.println("  5. 프로그램 종료");
		System.out.println("==============================");	
	}

	 
	/**
	 * 메뉴 선택
	 */
	public void choiceMenu() {
		System.out.print("\n메뉴 선택>");
		
		switch(scan.nextInt()) {
		case 1:		insert();		break;
		case 2:		select();		break;
		case 3:		update();		break;
		case 4:		delete();		break;
		
		case 5:		
			System.out.println("== 프로그램을 종료합니다 ==");
			System.exit(0);	
			break;
			
		default:
			System.out.println("준비중~");
		}
	}	


}
