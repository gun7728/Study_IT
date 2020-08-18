package java_0818_7day;

public class MethodTest {

	//Field
	int i,j;
	
	//Constructor
	
	//Method
	public void sum(int i,int j) {
		System.out.println(i+j);
	}//static이 없는 메소드
	
	public static void sum2(int i,int j) {
		System.out.println(i+j);
	}//static이 있는 메소드
	
	public int sum3(int i,int j) {
		return i+j;
	}
	
		
	public static void main(String[] args) {
		MethodTest md = new MethodTest();
		md.sum(1,2);
		
//		sum(1,2); //static 끼리만 호출이 가능하다
		sum2(3,4); //같은 static에 있을경우 생성자 생성없이 사용 가능하다
		System.out.println("result : "+	md.sum3(5,6));
	}
	
	

}
