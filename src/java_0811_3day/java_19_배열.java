/**
 * �迭 : *���� ������ Ÿ���� ���� �����͵��� *�������� ������ ����
 * index�� ������ 0���� �����Ѵ�.
 * 		new Ű���带 �̿��Ͽ� ������ ������ ����(heap�� ����)
 * 		������������ �ʱⰪ�� null�� ����
 */
package java_0811_3day;

public class java_19_�迭 {

	public static void main(String[] args) {
		int[] number = new int[5];
		int number2[] = new int[5];
		int number3[] = {100,200};
		int[] number4 = new int[] {100,200,300};
		int[] number5 = null;
		number5 = new int[5];
	
		
		System.out.println(number.length);
		System.out.println(number2.length);
		System.out.println(number3.length);
		System.out.println(number4.length);
		System.out.println(number5.length);
		
		System.out.println(number4[0]);
		System.out.println(number4[1]);
		System.out.println(number4[2]);

		for(int i=0;i<number4.length;i++) {
			System.out.println("number4"+"["+i+"] : "+number4[i]);
		}
	}

}
