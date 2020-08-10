/**
 * ����ȯ(Type casting)
 * primitive(�⺻��) : �������� ���⿡ ���� ����ȯ ���� 
 *	ex)	byte b = 10;  (1byte��(byte) b���� 4byte��(int) i�� �ֱ⿡ ���� �۾��� �ʿ����) 
 *		int i = b;
 * 		>>������, �Ͻ��� ����ȯ (JVM�� Ÿ���� �˾Ƽ� �������ش�)
 * 
 * 		int i2 = 100;	(4byte�� ����� ���� 2byte�� ������ �� �������� ������ ���� �� �����Ƿ�, ��������� ǥ���� �־���Ѵ�)
 * 		short s = (short)i2;
 *		>>����� ����ȯ
 * 
 * reference(������) : ��ü������ ��ӿ� ���õ� ���� ���� �� �� ����
 */

package java_0810_2day;

public class java_05_����ȯ {

	public static void main(String[] args) {

		//������ ����ȯ
		byte b = 10;
		int i = b;
		System.out.println("������ ����ȯ = " + i);
		
		//+�� ���� �������̴�.
		
		//����� ����ȯ
		int i2 = 1000000000;
		int i3 = 100;
		short s = (short)i2;
		short s2 = (short)i3;
		System.out.println("���� = "+i2);
		System.out.println("����� ����ȯ(���� �߻�) = "+s);	//������ ���� �߻�
		System.out.println("���� = "+i3);
		System.out.println("����� ����ȯ(���� �߻�X) = "+s2);
		
		
	}//main

}//class
