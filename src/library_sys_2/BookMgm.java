package library_sys_2;

public class BookMgm {
	
	String isbn,title,author;
	int price;
//	BookVO vo;
	int count=0;
	BookVO[] bookList = new BookVO[2];	
	//new >> ���ο°�(�ּ�)�� BookVO�� ���� ���������

	
	
	public void insert(BookVO vo) {
		for(int i=count;i<bookList.length;i++) {
			
			System.out.println("�ý��� >> ����� �Ϸ�Ǿ����ϴ�.");	
			bookList[i]=vo;

			if(bookList[i]!=null) {
				count++;
				i=bookList.length;
			}
		
		}
	}

		
	

	public void outPut() {
		System.out.println("============================");
		System.out.println("\t�����������α׷�");
		System.out.println("============================");
		System.out.println("������ȣ\t������\t����\t����");
		System.out.println("============================");
		for(int i=0;i<count;i++) {
			System.out.print(bookList[i].getIsbn()+"\t");
			System.out.print(bookList[i].getTitle()+"\t");
			System.out.print(bookList[i].getAuthor()+"\t");
			System.out.println(bookList[i].getPrice());
			System.out.println("�ؽ��ڵ� : "+System.identityHashCode(bookList[i]));
		}
		System.out.println("----------------------------");
	}
}
