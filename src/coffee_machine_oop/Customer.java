package coffee_machine_oop;

import java.util.Scanner;

public class Customer {
	//Field(멤버변수=전역변수)
	int coin;
		
	
	//Constructor = 생성자를 정의하지 않으면, 컴파일 시 JVM이 자동으로 생성해준다.
	
	Scanner scan = new Scanner(System.in);
	
	//Method
	public int insertCoin() {
		System.out.print("동전을 넣어주세요>>");
		coin =coin + scan.nextInt();
		return coin; 
	}
}
