/**																		*								*
 * String name = "ȫ�浿";										Stack 	*	name:ȫ�浿					* 
 * String name1 = new String("ȫ�浿");									*********************************
 * String name2 = new String("ȫ�浿");							Heap	*	name1:�ּ�a		name2:�ּ�b	*
 * 																		*		    ��				    ��	 	*
 *																		*	 __�ּ�a__		__�ּ�b__	*
 *																		*	��  ȫ�浿  ��	      ��  ȫ�浿  ��	*
 *																		*	�� ______��	      �� ______��	*
 *																		*	 							*
 *																		*							
 *													
 */

package java_0819_8day;

import java.util.Scanner;

public class ObjectAddressTest {

	public static void main(String[] args) {
		
		String name="ȫ�浿";
		String name1 = new String("ȫ�浿");
		String name2 = new String("ȫ�浿");
		
		System.out.println("name = " + name);
		System.out.println("name1 = " + name1+", address = " + System.identityHashCode(name1));	
		System.out.println("name2 = " + name2+", address = " + System.identityHashCode(name2));		//��Ʈ���� sysout �Ҷ��� �ڵ����� �ּ��� ���ڿ��� �����Ѵ�(name1.toString() << �̰� �����ȴ�)
		
		System.out.println(name==name1);		//���� ��
		System.out.println(name.equals(name1));	//�����ϴ� ��ü��(�����ϴ�) ���ڿ� ��
		
		name1=null;
		System.out.println("name1 = " + name1+", address = " + System.identityHashCode(name1));	
		
		System.out.println(name==name1);		
		System.out.println(name.equals(name1));	
		
		
		/** Scanner **/
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = scan1;
		
		System.out.println("Scan1 = " +scan1+", address = " + System.identityHashCode(scan1));
		System.out.println("Scan2 = " +scan2+", address = " + System.identityHashCode(scan2));
		System.out.println("Scan3 = " +scan3+", address = " + System.identityHashCode(scan3));
		
		
		
	}

}
