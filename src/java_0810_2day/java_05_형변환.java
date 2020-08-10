/**
 * 형변환(Type casting)
 * primitive(기본형) : 데이터의 킈기에 따라 형변환 실행 
 *	ex)	byte b = 10;  (1byte의(byte) b값을 4byte인(int) i에 넣기에 따른 작업이 필요없다) 
 *		int i = b;
 * 		>>묵시적, 암시적 형변환 (JVM이 타입을 알아서 변형해준다)
 * 
 * 		int i2 = 100;	(4byte에 저장된 값을 2byte에 저장할 시 데이터의 유실이 생길 수 있으므로, 명시적으로 표기해 주어야한다)
 * 		short s = (short)i2;
 *		>>명시적 형변환
 * 
 * reference(참조형) : 객체지향의 상속에 관련된 내용 숙지 후 할 예정
 */

package java_0810_2day;

public class java_05_형변환 {

	public static void main(String[] args) {

		//묵시적 형변환
		byte b = 10;
		int i = b;
		System.out.println("묵시적 형변환 = " + i);
		
		//+는 접합 연산자이다.
		
		//명시적 형변환
		int i2 = 1000000000;
		int i3 = 100;
		short s = (short)i2;
		short s2 = (short)i3;
		System.out.println("원본 = "+i2);
		System.out.println("명시적 형변환(유실 발생) = "+s);	//데이터 유실 발생
		System.out.println("원본 = "+i3);
		System.out.println("명시적 형변환(유실 발생X) = "+s2);
		
		
	}//main

}//class
