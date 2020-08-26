package java_0826_13day;

public class StaticObject {
	//Field
	public static final int Americano=2000;
	public int Milk = 1000;
	//Constructor
	//Method
	public static void test() {
//		System.out.println(Milk);	//static method 에서는 static이 붙어있는 상수만 불러올 수 있다.
		System.out.println(Americano);
		System.out.println("Static 테스트~");
	
	}
	
	
}
