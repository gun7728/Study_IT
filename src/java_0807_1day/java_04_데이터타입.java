/**
 * �ڹ��� ������ Ÿ�� : ������, ������, �Ҹ���, ��ü��(�������̽�)
 * �⺻��(primitive type)  
 * 		������(byte > short > int > long = ���� // float<double = �Ǽ�), 
 * 		������(char : 'H' (1byte)), �Ҹ���(true(1),false(0))	<<���� ��
 * ex) int num = 100;
 * 	   String str = "ȫ�浿";
 * 	   char s1 = 'ȫ';
 *     char s2 = '��';
 * 	   char s3 = '��';
 * 
 * num, str, s1, s2 .. = ����(�����͸� ��� �ٱ���)
 * 
 * 
 * ������(reference type) 
 * 		class(��ü��, �������̽�)		<<���� ����� �ּ�
 * ex) String name = new String("ȫ�浿");
 */

package java_0807_1day;

public class java_04_������Ÿ�� {

	public static void main(String[] args) {
		
		int num = 100;
		double num2 = 100.1234;
		char s1 = 'ȫ';
		
		String name = "ȫ�浿";
		String name2 = new String("ȫ�浿");
		
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(s1);
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name2.hashCode()); 	// �ּ� ��ġ�� ��
		System.out.println(name==name2);		// �� = �ּ� ��
		System.out.println(name.equals(name2));	// �� = �ּҾ��� �� ��
		
		// Ctrl + Alt + ����Ű �Ʒ� (����)		
		// Ctrl + Alt + ����Ű �Ʒ� (����)		

	}

}
