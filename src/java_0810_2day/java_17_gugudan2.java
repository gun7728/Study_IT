package java_0810_2day;

import java.util.Scanner;

public class java_17_gugudan2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) 
		{
			System.out.print("���� : ");
			int start=scan.nextInt();
			System.out.print("���� : ");
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
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		
	}//main

}//class

//����� ������ �ΰ� �ۼ�����.
//����� for�״����� ����for