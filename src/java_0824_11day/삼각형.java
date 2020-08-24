package java_0824_11day;

public class 삼각형 extends 도형 {
	//Field
	String color;
	
	//Constructor
	public 삼각형() {
		this("초록색");
	}
	
	public 삼각형(String color) {
		this.color=color;
	}
	//Method
	public void draw() {
		System.out.println(color+"삼각형을 그린다~");
	}
}
