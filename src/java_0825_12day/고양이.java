package java_0825_12day;

public class 고양이 implements 동물{
	//Field
	String name;	
	//Constructor

	public 고양이() {
		this("냐옹이");
	}
	public 고양이(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//부모가 가진것과 같은것을 가지고 있을경우 재정의
	
	//Constructor
	
	//Method
	public void sleep() {
		System.out.println(name+" 고양이가 잔다.");
	}
	
	public void eat() {
		System.out.println(name+" 고양이가 먹는다.");
		
		
	}
}
