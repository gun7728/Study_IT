/**
 * ����(����)������ : ++, --
 * ���� : ++����(��ġ����������), ����++(��ġ����������)
 * ���� : --����(��ġ����������), ����--(��ġ����������)
 * ex) int i = 10;  
 * 		++i;
 * 		>>i = 11
 * �����Ǳ� ���� ����
 * 
 * 
 *	   int i = 10;
 * 		i++;
 * 		>>i = 10
 * ������ �Ŀ� ����
 * 
 */

package java_0810_2day;

public class java_07_���׿����� {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i--);
		System.out.println(--i);
		
	}

}
