package java_0820_9day;

import java.util.Scanner;
import library_sys_2.BookVO;

public class BookMgmSystem {
	//Field
	BookVO[] bookList;		//���� �������
	Scanner scan=new Scanner(System.in);
	int addrInfo=0;
	//Constructor
	
	
	//Method	
		//���� ����(�����ڿ��� ���� ����)
	public void init() {
		setSize();
		showMenu();
		choiceMenu();
	}
	
	public void setSize() {
		boolean flag=true;
		while(flag){
					System.out.print("��������� �Է����ּ��� > ");
					int size=scan.nextInt();
				if(size>0) {
					bookList = new BookVO[size];
					flag=false;
				}else {
					System.out.println("����� �ٽ� �Է����ּ���.");
				}
			}
	}
	
		//�޴� ���
	public void showMenu() {
		System.out.println("����������������������������������������������������������");
		System.out.println("\t  ���� ���� �ý���");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1. �������� ���");
		System.out.println("\t2. �������� ���");
		System.out.println("\t3. �������� ����");
		System.out.println("\t4. �������� ����");
		System.out.println("\t5. ���α׷� ����");
		System.out.println("����������������������������������������������������������");

	}
		
		//�޴� ����
	public void choiceMenu() {
		System.out.print("\n�޴��� �������ּ���(��ȣ) > ");
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
			System.out.println("\n\t�����մϴ�.");
			System.exit(0);
			break;
			
		default:
			System.out.println("\n\t�߸� �����̽��ϴ�.\n");
			choiceMenu();
			break;
		}//switch
	}//choiceMenu

	
		//CRUD
	
		//���(C)
	public void insert() {
		//1. ������ üũ �� ���� �����ϸ�
		if(addrInfo<bookList.length)
		{			
			//2. ��������(������) �Է� �� ����	
			bookList[addrInfo]=input("insert");	
			
			//3. count ����
			addrInfo++;			
			
			//4. ��ϿϷ� �޽��� ���
			System.out.println("\n\t��ϿϷ�Ǿ����ϴ�.");
		}else{
			System.out.println("\n\t���� ������ �����մϴ�.");
		}//if,else
		
		
		choiceMenu();
		
	}	
	
		//�Է�
	public BookVO input(String fname) {
		BookVO book = new BookVO();
		
		if(fname.equals("insert")) {
			System.out.print("\n\t���� ��ȣ�� �Է����ּ��� : ");
			book.setIsbn(scan.next());
		}
		
		System.out.print("\t�������� �Է����ּ��� : ");
		book.setTitle(scan.next());	
		
		System.out.print("\t���� ���ڸ� �Է����ּ��� : ");
		book.setAuthor(scan.next());
		
		System.out.print("\t���� ������ �Է����ּ��� : ");
		book.setPrice(scan.nextInt());
		
		return book;
		
	}
	
		//��ȸ(R)
	public void select() {
		if(bookList[0]!=null) {
			//1. bookList ���
			System.out.println("\n����������������������������������������������������������");
			System.out.println("\t  ���� ���� �ý���");
			System.out.println("����������������������������������������������������������");
			System.out.println("������ȣ\t������\t����\t����");
			System.out.println("����������������������������������������������������������");
	//		for(int i=0;i<bookList.length;i++) {
			for(BookVO book : bookList) {		//for(�������� ���� ������ : �迭�̳� �޼ҵ��� ������) ī��Ʈ �ڵ����� ����
				//BookVO������ book�̶�� ��ü�� ���� bookList�� ���� bookList.length(����)��ŭ �ݺ��ؼ� book�� �־��ش�
				if(book!=null) {
						System.out.print(book.getIsbn()+"\t");
						System.out.print(book.getTitle()+"\t");
						System.out.print(book.getAuthor()+"\t");
						System.out.print(book.getPrice()+"\n");
				}//if
			}//for
		}else {
			System.out.println("�����͸� �Է��� �ּ���.");
		}
		
		choiceMenu();
		
	}
	
		//����(U)
	public void update() {
		if(bookList[0]!=null) {
			//1. ������ ������ �Է�
			System.out.print("\n\t������ ������ȣ : ");
			String findIsbn = scan.next();		
			
				
				//2. �����Ͱ� �����ϸ� ����, �ƴϸ� �޽��� ���
			int udx = searchAddressInfo(findIsbn);
			
			if(udx!=-1) {			
				bookList[udx]=input("update");		
				bookList[udx].setIsbn(findIsbn);
				System.out.println("\n\t������ �Ϸ�Ǿ����ϴ�.");
			}else{
				System.out.println("\t�ش� ������ ã�� ���߽��ϴ�.");
			}
				
		}else {
			System.out.println("�����͸� �Է��� �ּ���.");
		}
			choiceMenu();
	}
	
		//�˻�
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
	
		//����(D)
	public void delete() {
		if(bookList[0]!=null) {
			//1. ������ ������ �Է�
			System.out.print("\n\t������ ������ȣ�� �Է��� �ּ��� : ");
			String findIsbn = scan.next();	
			//2. ������ ������ ���� ������ �޽���
			int udx = searchAddressInfo(findIsbn);		
			if(udx!=-1) {	
				for(int i=udx;i<bookList.length-1;i++) {
					bookList[i]=bookList[i+1];
				}
				//3. ī��Ʈ ����
				addrInfo--;		
				bookList[addrInfo]=null;
				System.out.println("\n\t������ �Ϸ�Ǿ����ϴ�.");
			}else{
				System.out.println("\t�ش� ������ ã�� ���߽��ϴ�.");
			}
			
		}else {
			System.out.println("�����͸� �Է��� �ּ���.");
		}
		
		choiceMenu();
		
		
	}
	
	
}//class
