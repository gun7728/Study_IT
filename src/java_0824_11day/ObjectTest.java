package java_0824_11day;

public class ObjectTest {

	public static void main(String[] args) {
		Object obj = new Object();
		�� obj2 = new ��();
		obj = obj2;	//obj2�� ojb�� �������ְ� ���� �������־ �� ũ�Ƿ�, obj2���մ� object�� obj�� ���� �� �ִ�. 
					//(����, ���� ��Ȱ��ȭ ���·� �־�����)
		
		�� obj3 = (��)obj;	//obj�� obj2�� �־��� �����̹Ƿ� ��,������ �ִ� ���°�, ���� ��������� Ȱ��ȭ �Ͽ� �־��� �� �ִ�.
			
		System.out.println("obj----->"+obj.hashCode());
		System.out.println("obj2----->"+obj3.hashCode());
	}

}
