package library_sys;

public class BookInfoVO {

	String bookName,writerName,bookNum;
	int bookPrice;
	
	//å�̸�
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}	
	public String getBookName() {
		return bookName;
	}
	
	//�����̸�
	public void setWriterName(String writerName) {
		this.writerName=writerName;
	}	
	public String getWriterName() {
		return writerName;
	}
		
	//������ȣ
	public void setBookNum(String bookNum) {
		this.bookNum=bookNum;
	}
	public String getBookNum() {
		return bookNum;
	}
	
	//��������
	public void setBookPrice(int bookPrice) {
		this.bookPrice=bookPrice;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	
	
	
		
}
