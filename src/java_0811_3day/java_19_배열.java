/**
 * 배열 : *같은 데이터 타입을 가진 데이터들을 *연속적인 공간에 저장
 * index의 시작은 0부터 시작한다.
 * 		new 키워드를 이용하여 참조형 변수를 생성(heap에 생성)
 * 		참조형변수의 초기값은 null로 정의
 */
package java_0811_3day;

public class java_19_배열 {

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
