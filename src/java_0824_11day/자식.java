package java_0824_11day;

public class 자식 extends 부모 {
	//Field
	String name;
	//Constructor
	public 자식() {		
		this("홍길동");
//		super("홍길동"); //파라미터값을 받는 부모 생성자를 호출한다(super<<부모, this<<자기 자신)
						//this와 super는 같이 못쓴다.
//		System.out.println("자식 클래스의 생성자 호출~");
	}
	
	public 자식(String name) {
		super(name);
		System.out.println("자식 클래스의 생성자 호출~");
	}
	//Method
}
