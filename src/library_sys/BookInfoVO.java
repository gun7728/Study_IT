package library_sys;

public class BookInfoVO {

	String bookName,writerName,bookNum;
	int bookPrice;
	
	//책이름
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}	
	public String getBookName() {
		return bookName;
	}
	
	//저자이름
	public void setWriterName(String writerName) {
		this.writerName=writerName;
	}	
	public String getWriterName() {
		return writerName;
	}
		
	//도서번호
	public void setBookNum(String bookNum) {
		this.bookNum=bookNum;
	}
	public String getBookNum() {
		return bookNum;
	}
	
	//도서가격
	public void setBookPrice(int bookPrice) {
		this.bookPrice=bookPrice;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	
	
	
		
}
