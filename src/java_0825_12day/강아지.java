package java_0825_12day;

public class 강아지 implements 동물{
	//Field
	String name;	
	//Constructor

	public 강아지() {
		this("뽀삐");
	}
	public 강아지(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//부모가 가진것과 같은것을 가지고 있을경우 재정의
	
	//Method	
	public void sleep() {
		System.out.println(name+" 강아지가 잔다.");
	}
	
	public void eat() {
		System.out.println(name+" 강아지가 먹는다.");
		
	}
}
