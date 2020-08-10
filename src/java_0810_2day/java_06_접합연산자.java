package java_0810_2day;

public class java_06_접합연산자 {
	public static void main(String[] args) {
		//접합연산자 : +
		String name1 = "홍";
		String name2 = "길동";
		System.out.println("name = " +name1+name2); // 접합연산자로 두 값을 같이 출력할 수 있다.
		
		int num1 = 100;
		int num2 = 200;
		int sum = num1+num2;
		System.out.println(num1+num2);			//수를 포함한 변수이므로 산술연산자로 쓰임
		System.out.println("문자열"+num1+num2);	//문자열의 값을 먼저 처리할 경우 접합 연산자로 수행
		System.out.println("문자열"+(num1+num2));	//산술연산자로의 쓰임을 원할 경우 ()로 우선순위 변경
		System.out.println("문자열"+sum);			//sum으로 미리 합쳐서 출력
	}
}
