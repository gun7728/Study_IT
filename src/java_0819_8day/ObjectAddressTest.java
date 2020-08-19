/**																		*								*
 * String name = "홍길동";										Stack 	*	name:홍길동					* 
 * String name1 = new String("홍길동");									*********************************
 * String name2 = new String("홍길동");							Heap	*	name1:주소a		name2:주소b	*
 * 																		*		    ㅣ				    ㅣ	 	*
 *																		*	 __주소a__		__주소b__	*
 *																		*	ㅣ  홍길동  ㅣ	      ㅣ  홍길동  ㅣ	*
 *																		*	ㅣ ______ㅣ	      ㅣ ______ㅣ	*
 *																		*	 							*
 *																		*							
 *													
 */

package java_0819_8day;

import java.util.Scanner;

public class ObjectAddressTest {

	public static void main(String[] args) {
		
		String name="홍길동";
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		System.out.println("name = " + name);
		System.out.println("name1 = " + name1+", address = " + System.identityHashCode(name1));	
		System.out.println("name2 = " + name2+", address = " + System.identityHashCode(name2));		//스트링은 sysout 할때만 자동으로 주소의 문자열을 리턴한다(name1.toString() << 이게 생략된다)
		
		System.out.println(name==name1);		//값을 비교
		System.out.println(name.equals(name1));	//참조하는 객체의(리턴하는) 문자열 비교
		
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
