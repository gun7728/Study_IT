package java_0824_11day;

public class 사각형 extends 도형 {
	//Field
	String color;
	
	//Constructor
	public 사각형() {
		this("파란색");
	}
	
	public 사각형(String color) {
		this.color=color;
	}
	
	//Method
	public void draw() {
		System.out.println(color+"사각형을 그린다.");
	}
}
