package java_0826_13day;

public class StaticTest {

	public static void main(String[] args) {
		StaticObject so = new StaticObject();
		System.out.println("����\t: "+so.Milk);
//		System.out.println("�Ƹ޸�ī��\t: "+StaticObject.milk); 	//milk�� ����ƽ������ ��� ���Ұ�
		System.out.println("�Ƹ޸�ī��\t: "+so.Americano);			//��ȿ�������� �����°� �ƴ�
										// ��>>so��� ��ü�����ؼ� �� ��ü���� ameriacno�� ã�� ���°� Ȯ���ؼ� static���� ����
										//StaticObject.Americano�� �����´�. �� ��ȿ����
		
		System.out.println("�Ƹ޸�ī��\t: "+StaticObject.Americano);
		
		so.Milk=100;
//		StaticObject.Americano=100; 	//final�� ������ ������ �Ұ����ϴ�
		
		StaticObject.test();
		so.test();	//��ȿ��
		
		System.out.println(so.Milk);
		System.out.println(StaticObject.Americano);
		
	}

}
