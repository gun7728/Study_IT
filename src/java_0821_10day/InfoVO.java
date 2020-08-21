package java_0821_10day;

public class InfoVO {
	//Field
	private String name;
	public int age;
	String addr;
	
	//Constructor
	public InfoVO() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}
	
	
}
