package java_0826_13day;

public class StringTest {

	public static void main(String[] args) {
		String[] strList = {"ÀÚ¹Ù","ÆÄÀÌ½ã","HTML","CSS"};
		int num1 = 100;
		String num2 = "200";
		
		String number = String.valueOf(num1);
		int number2 = Integer.parseInt(num2);
		double number3 = Double.parseDouble(num2);
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(String.join("/",strList));
		System.out.println(Math.round(Math.random()*100));
	}

}
