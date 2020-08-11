package java_0811_3day;

import java.util.Scanner;

public class java_18_NumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int odd=0;
		int even=0;
		boolean flag = true;
		while(flag) {
			System.out.print("璋濠殮溘 : ");
			int num = scan.nextInt();
			
			if(num!=0) {
				if(num%2==0) {
					even++;
				}else
					odd++;
					
			}else{
				flag=false;
			}//if(num)
		}//while
	
		System.out.println("�汝� 偎熱 : "+odd);
		System.out.println("礎熱 偎熱 : "+even);
	}//main

}//class
