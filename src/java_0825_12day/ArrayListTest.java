package java_0825_12day;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();	//������Ʈ Ÿ������ 10�� ����
		// = Object[] ob = new Object[10]		
		
		������ dog1 = new ������("����");
		������ dog2 = new ������("�ǻ�");
		����� cat1 = new �����();
		
		list.add(dog1);
		list.add(dog2);
		list.add(cat1);
		
		������ dog1_1 = (������)list.get(0);
		������ dog2_1 = (������)list.get(1);
		����� cat1_1 = (�����)list.get(2);
		
		dog1_1.sleep();
		dog2_1.sleep();
		cat1_1.sleep();
	}

}
