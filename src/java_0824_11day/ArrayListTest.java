package java_0824_11day;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		
		�ﰢ�� a1 = new �ﰢ��();
		�簢�� b1 = new �簢��();
		
		alist.add(a1);	//��ӹ��� �ֻ��� ��ü�� object���·� ���� (�������� ��Ȱ��ȭ)
		alist.add(b1);	//��ӹ��� �ֻ��� ��ü�� object���·� ����
		
		
		�ﰢ�� a11 = (�ﰢ��)alist.get(0);	//��Ȱ��ȭ ��Ų �ﰢ���� ������༭ �����´�.
		�簢�� b11 = (�簢��)alist.get(1);
		
		a11.draw();
		b11.draw();
	}

}
