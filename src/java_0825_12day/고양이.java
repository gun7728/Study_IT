package java_0825_12day;

public class ����� implements ����{
	//Field
	String name;	
	//Constructor

	public �����() {
		this("�Ŀ���");
	}
	public �����(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//�θ� �����Ͱ� �������� ������ ������� ������
	
	//Constructor
	
	//Method
	public void sleep() {
		System.out.println(name+" ����̰� �ܴ�.");
	}
	
	public void eat() {
		System.out.println(name+" ����̰� �Դ´�.");
		
		
	}
}
