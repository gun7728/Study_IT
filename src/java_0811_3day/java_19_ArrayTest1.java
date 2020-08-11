package java_0811_3day;

import java.util.Scanner;

public class java_19_ArrayTest1 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아, 배열에 저장 한 후 출력
		int[] scoreList = new int[3];
		Scanner scan = new Scanner(System.in);
		String[] subList = {"국어","영어","수학"};
		System.out.print("학생명 : ");
		String name = scan.next();
	
		for(int i=0;i<scoreList.length;i++) {
			System.out.print(subList[i]+" : ");
			scoreList[i] = scan.nextInt();
		}//for
	

		System.out.println("학생명 : "+name);
		for(int i=0;i<scoreList.length;i++) {			
			System.out.println(subList[i]+" : "+scoreList[i]);
		}//for

	}
}
