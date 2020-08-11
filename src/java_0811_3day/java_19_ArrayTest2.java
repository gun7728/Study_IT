/**
 * 학생 3명의 국,영,수 점수를 입력받아, 출력하세요
 */

package java_0811_3day;

import java.util.Scanner;

public class java_19_ArrayTest2 {

	public static void main(String[] args) {
		// 1. 학생 A의 국영수 받고
		// 2. 학생 B의 국영수 받고
		// 3. 학생 C의 국영수 받고 While문 or For문 사용
		System.out.print("몇 명의 학생을 입력 하시나요? : ");		
		Scanner scan = new Scanner(System.in);
		int many = scan.nextInt();
		String[] name= new String[many]; 		//입력할 학생 수
		
		String[] subList = {"국어","영어","수학"};
		int[] kor = new int[many];
		int[] eng = new int[many];
		int[] math = new int[many];				// 학생 수 리스트
		int[] tot=new int[many];
		double[] avgList = new double[many];
				
		
		for(int i=0;i<name.length;i++) {
			System.out.print("학생의 이름을 입력하세요 : ");
			name[i]=scan.next();	
			System.out.print("국어 : ");	
			kor[i] = scan.nextInt();	
			System.out.print("영어 : ");	
			eng[i] = scan.nextInt();	
			System.out.print("수학 : ");	
			math[i] = scan.nextInt();	
			
			
			tot[i]=math[i]+eng[i]+kor[i];
			avgList[i]=tot[i]/subList.length;
			}//for(name)
		
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avgList[i]);
		}//출력

	}//main

}//class
