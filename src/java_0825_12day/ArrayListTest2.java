package java_0825_12day;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
//		ArrayList<������> list = new ArrayList<������>();
		//�������� �����ִ� 10���� �迭�� �����
		//������[] list = new ������[10];�� ����ϴ�
		ArrayList<������> list = new ArrayList<������>(2);
		// ��>> 2���� �迭�� �����ϰ� �����ص� ������ �� �˾Ƽ� �߰��ؼ� �����Ѵ�.
		
		String[] nameList = {"�ǻ�","�߻�","����"};
		
		for(String name : nameList) {
			������ dog = new ������(name);
			list.add(dog);
		}
		for(������ dog : list) {
			dog.sleep();
		}
		
	}

}
