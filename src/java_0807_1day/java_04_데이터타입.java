/**
 * 자바의 데이터 타입 : 숫자형, 문자형, 불린형, 객체형(인터페이스)
 * 기본형(primitive type)  
 * 		숫자형(byte > short > int > long = 정수 // float<double = 실수), 
 * 		문자형(char : 'H' (1byte)), 불린형(true(1),false(0))	<<실제 값
 * ex) int num = 100;
 * 	   String str = "홍길동";
 * 	   char s1 = '홍';
 *     char s2 = '길';
 * 	   char s3 = '동';
 * 
 * num, str, s1, s2 .. = 변수(데이터를 담는 바구니)
 * 
 * 
 * 참조형(reference type) 
 * 		class(객체형, 인터페이스)		<<값이 저장된 주소
 * ex) String name = new String("홍길동");
 */

package java_0807_1day;

public class java_04_데이터타입 {

	public static void main(String[] args) {
		
		int num = 100;
		double num2 = 100.1234;
		char s1 = '홍';
		
		String name = "홍길동";
		String name2 = new String("홍길동");
		
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(s1);
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name2.hashCode()); 	// 주소 위치의 값
		System.out.println(name==name2);		// 값 = 주소 비교
		System.out.println(name.equals(name2));	// 값 = 주소안의 값 비교
		
		// Ctrl + Alt + 방향키 아래 (복사)		
		// Ctrl + Alt + 방향키 아래 (복사)		

	}

}
