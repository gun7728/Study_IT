/**
 *  2차원 배열을 활용한 성적 관리 프로그램
 * 	1.등록
 * 	2.조회
 * 	3.검색
 * 	4.종료
 * 
 */
package score_mgm_array2;

import java.util.Scanner;

public class ScoreMgm {

	public static void main(String[] args) {
		//기본

		System.out.println("=========================================");
		System.out.println("============   성적 관리  프로그램    ============");
		System.out.println("=등록(1) 조회(2) 검색(3) 수정(4) 삭제(5) 종료(0)=");
		System.out.println("=========================================");
		
		System.out.println();
		System.out.print("몇명의 학생을 입력하시겠습니까? : ");
		Scanner scan = new Scanner(System.in);
		int stuNum = scan.nextInt();

				
		String[] nameList = new String[stuNum];
		String[] subList = {"국어","영어","수학","사회","과학"}; //과목 리스트
		int[][] scoreList = new int[stuNum][subList.length+2]; //총점, 평균을 위해서 +2
		String select="";
		int count=0; // 숫자 카운트용

		boolean flag=true;
		
		//메뉴
		

				
		while(flag) {		
			System.out.print("\n메뉴 선택 : ");		
			int menu = scan.nextInt();
			
			switch(menu) {
				case 1: 	//1.등록								
						if(count!=subList.length) {
								for(int i=count;i<scoreList.length;i++) {	
	
									System.out.println("\n\t등록");
									
									System.out.print("이름 : ");								
									nameList[i]=scan.next();
									
									int tot=0;
									
									for(int j=0;j<scoreList[i].length;j++) {
										if(j<subList.length) {
										System.out.print(subList[j]+" : ");
										scoreList[i][j] = scan.nextInt();	
										tot+=scoreList[i][j];
										}else if(j==subList.length) { //총점
											scoreList[i][j]=tot;
										}else if(j==subList.length+1) { //평균
											scoreList[i][j]=tot/subList.length;
										}
									}//for.j
									
									System.out.println("\n\t등록이 완료 되었습니다.");
									System.out.print("\n계속 등록 하시겠습니까? (y/n) : ");
									String sel = scan.next();
									count++;
									if(sel.equals("n")) {	
										i=scoreList.length;											
									}else if(count==scoreList.length) 
									{
										System.out.println("초과");
										i=scoreList.length;	
									}
									

								}//for.i			
						}else if(count==3)
							System.out.println("초과");
						{
					}
						break;
	
										
				case 2:
					if(nameList[0]!=null) {
						System.out.println("\n\t조회\n");	
						System.out.println("");
						System.out.print("이름\t");
						for(int i=0;i<subList.length;i++) {
							System.out.print(subList[i]+"\t");
						}
						System.out.print("총점\t평균\n");
						
						System.out.println("");
						for(int i=0;i<scoreList.length;i++) {
							if(nameList[i]!=null) {
								System.out.print("\n"+nameList[i]+"\t");
								for(int j=0;j<scoreList[i].length;j++) {
									System.out.print(scoreList[i][j]+"\t");
								}
							}
						}
					}else {
						System.out.println("등록 먼저 해주세요");						
					}
					System.out.println(); // 자리 띄우기 전용
					break;
					
				case 3:
					if(nameList[0]!=null) {
						System.out.print("\n\t검색 : ");
						String inName = scan.next();
						System.out.println();
						for(int i=0;i<nameList.length;i++) {
							if(inName.equals(nameList[i])) {

								System.out.println("\n\t조회\n");	
								System.out.println("");
								System.out.print("이름\t");
								for(int t=0;t<subList.length;t++) {
									System.out.print(subList[t]+"\t");
								}
								System.out.print("총점\t평균\n");		

								System.out.print(nameList[i]+"\t");
								for(int j=0;j<scoreList[i].length;j++)
								{
									System.out.print(scoreList[i][j]+"\t");	
								}
								
								i=nameList.length;
								
							}else if(i==nameList.length-1)
								System.out.println("등록되지 않았습니다.");
						}
					}else{
						System.out.println("등록 먼저 해주세요");						
					}
					System.out.println();
					break;
					
				case 4:
					int temp=0;
					if(nameList[0]!=null) {
						System.out.print("\n\t수정할 학생 이름 : ");
						String inName = scan.next();
						System.out.println();						
						for(int i=0;i<nameList.length;i++) {
							if(inName.equals(nameList[i])) {	
								temp=i;
								i=nameList.length;
								System.out.print("\t수정할 이름 : ");
								nameList[temp]=scan.next();
								int tot=0;
								for(int j=0;j<scoreList[temp].length;j++) {
									if(j<subList.length) {
										System.out.print(subList[j]+" : ");
										scoreList[temp][j] = scan.nextInt();	
										tot+=scoreList[temp][j];
										}else if(j==subList.length) { //총점
											scoreList[temp][j]=tot;
										}else if(j==subList.length+1) { //평균
											scoreList[temp][j]=tot/subList.length;
										}//if.j									
								}//for.j			
								System.out.println("수정이 완료되었습니다.");
							}else if(i==nameList.length-1)
								System.out.println("등록되지 않았습니다.");
						}
					}else{
						System.out.println("등록 먼저 해주세요");						
					}
					System.out.println();
					break;
					
				case 5:
					if(nameList[0]!=null)
					{
						int rdx=0;
						boolean remove_result = false;
						
						System.out.print("\n\t삭제할 학생 이름 : ");
						String inName = scan.next();
						System.out.println();
						for(int i=0;i<nameList.length;i++) {
							if(nameList[i]!=null) {							
								if(nameList[i].equals(inName)) {
									count--; // 등록 카운터 하락
									System.out.println("삭제가 완료되었습니다");										
									rdx=i;
									remove_result=true;
									i=nameList.length;
								}									
							}else
								System.out.println("등록 먼저 해주세요");
						}
						
						
						//4.삭제
						if(remove_result) {
							int size = nameList.length;
							for(int i=0;i<size;i++) {
								if(i==rdx) 
								{
									
									for(int k=rdx;k<size-1;k++) 
									{
										nameList[k] = nameList[k+1];
										for(int j=0;j<scoreList[k].length;j++)
										{
											scoreList[k][j] = scoreList[k+1][j];
										}
									}
									size--;
									nameList[size]=null;
								}
							}							
						}//if												
					}else{
						System.out.println("등록 먼저 해주세요");						
					}
					System.out.println();
					break;
					
				case 0:
					System.out.println("\n\t종료");
					flag=false;
					break;
					
			}//switch
			
		}//while
		
		
		
	}//main

}//class
