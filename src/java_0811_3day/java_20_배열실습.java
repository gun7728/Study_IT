package java_0811_3day;

import java.util.Scanner;

public class java_20_�迭�ǽ� {

	public static void main(String[] args) {	

		
		int[][] scoreList = new int[3][3];
		String[] subList = {"����", "����", "����"};
		
		String findName="";
		
		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];

		int sel;
		boolean flag=true;
		
		while(flag) {			
		System.out.println("��� 1. ��ȸ 2. �˻� 3. ���� 4.");
		System.out.print("�Է� : ");
		sel=scan.nextInt();		
		if(sel==1) {					
			for(int i=0;i<scoreList.length;i++) {	
				System.out.print("�̸��� �Է� �ϼ��� : ");
				name[i]=scan.next();
				for(int j=0;j<scoreList[i].length;j++) {
					System.out.print(subList[j]+" : ");				
					scoreList[i][j]=scan.nextInt();
					
				}//for(j)				
				System.out.println();
			}//for(i)
		}else if(sel==2) {
			if(name[0]==null) {
				System.out.println("����� ���ּ���.\n");
			}else {
			System.out.println("\n");
				for(int i=0;i<scoreList.length;i++) {
					System.out.print("�̸� : "+name[i]+"\t���� /");
						for(int j=0;j<scoreList[i].length;j++) {
							System.out.print(subList[j]+" : ");				
							System.out.print(scoreList[i][j]+"\t");
						}			
					System.out.println("\n");
				}
			}
			
		}else if(sel==3) {
			if(name[0]==null) {
					System.out.println("����� ���ּ���.\n");
				}else {
					System.out.print("�˻��� �̸��� �Է��� �ּ��� : ");
					findName=scan.next();
					System.out.println();
						for(int i=0;i<name.length;i++) {
							if(name[i].contentEquals(findName)) {
								for(int j=0;j<scoreList[i].length;j++) {
									System.out.print(subList[j]+" : ");				
									System.out.print(scoreList[i][j]+"\t");									
								}//for(j)								
									break;
							}else if(i==2) 
							{
								System.out.println("�����ϴ�.");
							}
						}//for(i)
					System.out.println("\n");
					}//if(name���� �Ǵ�)
				}else 
					{
					System.out.println("����Ǿ����ϴ�.");
					scan.close();
					flag=false;
					}//else
			}//while
	}//main

}//class
