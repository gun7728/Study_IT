package java_0811_3day;

import java.util.Scanner;

public class java_20_배열실습 {

	public static void main(String[] args) {	

		
		int[][] scoreList = new int[3][3];
		String[] subList = {"국어", "수학", "영어"};
		
		String findName="";
		
		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];

		int sel;
		boolean flag=true;
		
		while(flag) {			
		System.out.println("등록 1. 조회 2. 검색 3. 종료 4.");
		System.out.print("입력 : ");
		sel=scan.nextInt();		
		if(sel==1) {					
			for(int i=0;i<scoreList.length;i++) {	
				System.out.print("이름을 입력 하세요 : ");
				name[i]=scan.next();
				for(int j=0;j<scoreList[i].length;j++) {
					System.out.print(subList[j]+" : ");				
					scoreList[i][j]=scan.nextInt();
					
				}//for(j)				
				System.out.println();
			}//for(i)
		}else if(sel==2) {
			if(name[0]==null) {
				System.out.println("등록을 해주세요.\n");
			}else {
			System.out.println("\n");
				for(int i=0;i<scoreList.length;i++) {
					System.out.print("이름 : "+name[i]+"\t점수 /");
						for(int j=0;j<scoreList[i].length;j++) {
							System.out.print(subList[j]+" : ");				
							System.out.print(scoreList[i][j]+"\t");
						}			
					System.out.println("\n");
				}
			}
			
		}else if(sel==3) {
			if(name[0]==null) {
					System.out.println("등록을 해주세요.\n");
				}else {
					System.out.print("검색할 이름을 입력해 주세요 : ");
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
								System.out.println("없습니다.");
							}
						}//for(i)
					System.out.println("\n");
					}//if(name유무 판단)
				}else 
					{
					System.out.println("종료되었습니다.");
					scan.close();
					flag=false;
					}//else
			}//while
	}//main

}//class
