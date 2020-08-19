package library_sys_2;

public class BookMgm {
	
	String isbn,title,author;
	int price;
//	BookVO vo;
	int count=0;
	BookVO[] bookList = new BookVO[2];	
	//new >> 새로온곳(주소)에 BookVO가 새로 만들어진다

	
	
	public void insert(BookVO vo) {
		for(int i=count;i<bookList.length;i++) {
			
			System.out.println("시스템 >> 등록이 완료되었습니다.");	
			bookList[i]=vo;

			if(bookList[i]!=null) {
				count++;
				i=bookList.length;
			}
		
		}
	}

		
	

	public void outPut() {
		System.out.println("============================");
		System.out.println("\t도서관리프로그램");
		System.out.println("============================");
		System.out.println("도서번호\t도서명\t저자\t가격");
		System.out.println("============================");
		for(int i=0;i<count;i++) {
			System.out.print(bookList[i].getIsbn()+"\t");
			System.out.print(bookList[i].getTitle()+"\t");
			System.out.print(bookList[i].getAuthor()+"\t");
			System.out.println(bookList[i].getPrice());
			System.out.println("해쉬코드 : "+System.identityHashCode(bookList[i]));
		}
		System.out.println("----------------------------");
	}
}
