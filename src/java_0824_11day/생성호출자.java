package java_0824_11day;

public class 생성호출자 {

	public static void main(String[] args) {
		부모 p = new 부모();
		자식 c = new 자식();	//생성전에 extends를 확인하고 부모부터 생성 후 자신을 생성(결과로 확인 가능)
							/** 	결과
							 *	부모 클래스의 생성자 호출~
							 *	자식 클래스의 생성자 호출~
							 */
		
		
	}

}
