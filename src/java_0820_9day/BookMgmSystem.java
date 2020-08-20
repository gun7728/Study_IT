package java_0820_9day;

import java.util.Scanner;
import library_sys_2.BookVO;

public class BookMgmSystem {
	//Field
	BookVO[] bookList;		//도서 저장공간
	Scanner scan=new Scanner(System.in);
	int addrInfo=0;
	//Constructor
	
	
	//Method	
		//최초 실행(생성자에서 진행 가능)
	public void init() {
		setSize();
		showMenu();
		choiceMenu();
	}
	
	public void setSize() {
		boolean flag=true;
		while(flag){
					System.out.print("저장공간을 입력해주세요 > ");
					int size=scan.nextInt();
				if(size>0) {
					bookList = new BookVO[size];
					flag=false;
				}else {
					System.out.println("사이즈를 다시 입력해주세요.");
				}
			}
	}
	
		//메뉴 출력
	public void showMenu() {
		System.out.println("─────────────────────────────");
		System.out.println("\t  도서 관리 시스템");
		System.out.println("─────────────────────────────");
		System.out.println("\t1. 도서정보 등록");
		System.out.println("\t2. 도서정보 출력");
		System.out.println("\t3. 도서정보 수정");
		System.out.println("\t4. 도서정보 삭제");
		System.out.println("\t5. 프로그램 종료");
		System.out.println("─────────────────────────────");

	}
		
		//메뉴 선택
	public void choiceMenu() {
		System.out.print("\n메뉴를 선택해주세요(번호) > ");
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			insert();
			break;
			
		case 2:
			select();
			break;	
			
		case 3:
			update();
			break;
			
		case 4:
			delete();
			break;
			
		case 5:
			System.out.println("\n\t종료합니다.");
			System.exit(0);
			break;
			
		default:
			System.out.println("\n\t잘못 누르셨습니다.\n");
			choiceMenu();
			break;
		}//switch
	}//choiceMenu

	
		//CRUD
	
		//등록(C)
	public void insert() {
		//1. 사이즈 체크 후 저장 가능하면
		if(addrInfo<bookList.length)
		{			
			//2. 도서정보(데이터) 입력 및 저장	
			bookList[addrInfo]=input("insert");	
			
			//3. count 증가
			addrInfo++;			
			
			//4. 등록완료 메시지 출력
			System.out.println("\n\t등록완료되었습니다.");
		}else{
			System.out.println("\n\t저장 공간이 부족합니다.");
		}//if,else
		
		
		choiceMenu();
		
	}	
	
		//입력
	public BookVO input(String fname) {
		BookVO book = new BookVO();
		
		if(fname.equals("insert")) {
			System.out.print("\n\t도서 번호를 입력해주세요 : ");
			book.setIsbn(scan.next());
		}
		
		System.out.print("\t도서명을 입력해주세요 : ");
		book.setTitle(scan.next());	
		
		System.out.print("\t도서 저자를 입력해주세요 : ");
		book.setAuthor(scan.next());
		
		System.out.print("\t도서 가격을 입력해주세요 : ");
		book.setPrice(scan.nextInt());
		
		return book;
		
	}
	
		//조회(R)
	public void select() {
		if(bookList[0]!=null) {
			//1. bookList 출력
			System.out.println("\n─────────────────────────────");
			System.out.println("\t  도서 관리 시스템");
			System.out.println("─────────────────────────────");
			System.out.println("도서번호\t도서명\t저자\t가격");
			System.out.println("─────────────────────────────");
	//		for(int i=0;i<bookList.length;i++) {
			for(BookVO book : bookList) {		//for(데이터형 접근 변수명 : 배열이나 메소드의 변수명) 카운트 자동으로 해줌
				//BookVO형식의 book이라는 객체를 만들어서 bookList의 값을 bookList.length(길이)만큼 반복해서 book에 넣어준다
				if(book!=null) {
						System.out.print(book.getIsbn()+"\t");
						System.out.print(book.getTitle()+"\t");
						System.out.print(book.getAuthor()+"\t");
						System.out.print(book.getPrice()+"\n");
				}//if
			}//for
		}else {
			System.out.println("데이터를 입력해 주세요.");
		}
		
		choiceMenu();
		
	}
	
		//수정(U)
	public void update() {
		if(bookList[0]!=null) {
			//1. 수정할 데이터 입력
			System.out.print("\n\t수정할 도서번호 : ");
			String findIsbn = scan.next();		
			
				
				//2. 데이터가 존재하면 수정, 아니면 메시지 출력
			int udx = searchAddressInfo(findIsbn);
			
			if(udx!=-1) {			
				bookList[udx]=input("update");		
				bookList[udx].setIsbn(findIsbn);
				System.out.println("\n\t수정이 완료되었습니다.");
			}else{
				System.out.println("\t해당 정보를 찾지 못했습니다.");
			}
				
		}else {
			System.out.println("데이터를 입력해 주세요.");
		}
			choiceMenu();
	}
	
		//검색
	public int searchAddressInfo(String findIsbn) {		
		int udx=-1;
		int idxInfo=0;
		for(BookVO book : bookList) {
			if(book!=null) {
				if(book.getIsbn().equals(findIsbn)) {
						udx=idxInfo;
				}				
			}			
			
			idxInfo++;
		}
		
		return udx;
	}
	
		//삭제(D)
	public void delete() {
		if(bookList[0]!=null) {
			//1. 삭제할 데이터 입력
			System.out.print("\n\t삭제할 도서번호를 입력해 주세요 : ");
			String findIsbn = scan.next();	
			//2. 데이터 있으면 삭제 없으면 메시지
			int udx = searchAddressInfo(findIsbn);		
			if(udx!=-1) {	
				for(int i=udx;i<bookList.length-1;i++) {
					bookList[i]=bookList[i+1];
				}
				//3. 카운트 감소
				addrInfo--;		
				bookList[addrInfo]=null;
				System.out.println("\n\t삭제가 완료되었습니다.");
			}else{
				System.out.println("\t해당 정보를 찾지 못했습니다.");
			}
			
		}else {
			System.out.println("데이터를 입력해 주세요.");
		}
		
		choiceMenu();
		
		
	}
	
	
}//class
