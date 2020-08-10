/**
 * 단항(증감)연산자 : ++, --
 * 형식 : ++변수(전치증가연산자), 변수++(후치증가연산자)
 * 형식 : --변수(전치증가연산자), 변수--(후치증가연산자)
 * ex) int i = 10;  
 * 		++i;
 * 		>>i = 11
 * 참조되기 전에 증가
 * 
 * 
 *	   int i = 10;
 * 		i++;
 * 		>>i = 10
 * 참조된 후에 증가
 * 
 */

package java_0810_2day;

public class java_07_단항연산자 {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i--);
		System.out.println(--i);
		
	}

}
