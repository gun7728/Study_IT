package java_0824_11day;

public class �ڽ� extends �θ� {
	//Field
	String name;
	//Constructor
	public �ڽ�() {		
		this("ȫ�浿");
//		super("ȫ�浿"); //�Ķ���Ͱ��� �޴� �θ� �����ڸ� ȣ���Ѵ�(super<<�θ�, this<<�ڱ� �ڽ�)
						//this�� super�� ���� ������.
//		System.out.println("�ڽ� Ŭ������ ������ ȣ��~");
	}
	
	public �ڽ�(String name) {
		super(name);
		System.out.println("�ڽ� Ŭ������ ������ ȣ��~");
	}
	//Method
}
