package java_0810_2day;

import java.util.Scanner;

public class java_17_gugudan2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) 
		{
			System.out.print("시작 : ");
			int start=scan.nextInt();
			System.out.print("종료 : ");
			int end=scan.nextInt();		
				
			if(start==0 || end==0) {
				flag=false;
			}else {		
				for(int i=1;i<10;i++) {
					if(start>end) {
					for(int j=start;j>=end;j--) {
						System.out.print(j+" * "+i+" = "+(j*i)+"\t");
						}//for(j)
					
					System.out.println("");
					}//if(start>end)
					else {
						for(int j=start;j<=end;j++) {
							System.out.print(j+" * "+i+" = "+(j*i)+"\t");
							}//for(j)
						System.out.println("");
					
					}//else(start<end)
					
				}//for(i)
				
			}//if
			System.out.println("");
			
		}//while
		System.out.println("프로그램이 종료 되었습니다.");
		
	}//main

}//class

//행부터 염두해 두고 작성하자.
//행부터 for그다음에 단을for