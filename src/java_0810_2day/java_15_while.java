/**
 * 반복문 : while(조건식){ 실행문; }
 * flag 변수 사용법을 익히자
 */
package java_0810_2day;

public class java_15_while {

	public static void main(String[] args) {
		//1에서10까지 합계 출력
		int i = 1;
		int a=0;
		while(i<11) {
			a = a + i;
			i++;
		}
		System.out.println(a);

	}

}
