/**
 * �������� : ��Ʈ������(&, |), short cut(&&, ||) - ������ ��������� ��
 * short cut ������ : &&(������� ��� true�϶��� true) ||(���� �ϳ��� true���� true)
 *	����    &&  ����
 * (true)    (true)
 */

package java_0810_2day;

public class java_10_�������� {

	public static void main(String[] args) {
		//short cut ������
		System.out.println((3>5)&&(5<3));
		System.out.println((3>5)&&(5>3));
		System.out.println((3<5)&&(5>3));
		System.out.println("");
		System.out.println((3>5)||(5<3));
		System.out.println((3>5)||(5>3));
		System.out.println((3<5)||(5>3));
		
		
	}//main

}//class
