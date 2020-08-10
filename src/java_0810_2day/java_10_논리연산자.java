/**
 * 논리연산자 : 비트연산자(&, |), short cut(&&, ||) - 논리식의 결과값으로 비교
 * short cut 연산자 : &&(결과값이 모두 true일때만 true) ||(둘중 하나만 true여도 true)
 *	논리식    &&  논리식
 * (true)    (true)
 */

package java_0810_2day;

public class java_10_논리연산자 {

	public static void main(String[] args) {
		//short cut 연산자
		System.out.println((3>5)&&(5<3));
		System.out.println((3>5)&&(5>3));
		System.out.println((3<5)&&(5>3));
		System.out.println("");
		System.out.println((3>5)||(5<3));
		System.out.println((3>5)||(5>3));
		System.out.println((3<5)||(5>3));
		
		
	}//main

}//class
