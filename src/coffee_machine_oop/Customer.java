package coffee_machine_oop;

import java.util.Scanner;

public class Customer {
	//Field(�������=��������)
	int coin;
		
	
	//Constructor = �����ڸ� �������� ������, ������ �� JVM�� �ڵ����� �������ش�.
	
	Scanner scan = new Scanner(System.in);
	
	//Method
	public int insertCoin() {
		System.out.print("������ �־��ּ���>>");
		coin =coin + scan.nextInt();
		return coin; 
	}
}
