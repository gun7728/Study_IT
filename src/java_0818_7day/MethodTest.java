package java_0818_7day;

public class MethodTest {

	//Field
	int i,j;
	
	//Constructor
	
	//Method
	public void sum(int i,int j) {
		System.out.println(i+j);
	}//static�� ���� �޼ҵ�
	
	public static void sum2(int i,int j) {
		System.out.println(i+j);
	}//static�� �ִ� �޼ҵ�
	
	public int sum3(int i,int j) {
		return i+j;
	}
	
		
	public static void main(String[] args) {
		MethodTest md = new MethodTest();
		md.sum(1,2);
		
//		sum(1,2); //static ������ ȣ���� �����ϴ�
		sum2(3,4); //���� static�� ������� ������ �������� ��� �����ϴ�
		System.out.println("result : "+	md.sum3(5,6));
	}
	
	

}
