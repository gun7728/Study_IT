/**
 *  2차원 배열을 활용한 성적 관리 프로그램
 * 	1.등록
 * 	2.조회
 * 	3.검색
 * 	4.종료
 * 
 */
package score_mgm_arry2;

import java.util.Scanner;

public class ScoreMgmTest {

	public static void main(String[] args) {
		//기본
		Scanner scan = new Scanner(System.in);
		String[] nameList = new String[3];
		int[][] scoreList = new int[3][5];
		String[] subList = {"국어","영어","수학"}; //과목 리스트
		String select="";
		int count=0; // 숫자 카운트용

		boolean flag=true;
		
		//메뉴
		System.out.println("==================================");
		System.out.println("=========  성적 관리  프로그램    =========");
		System.out.println("=등록(1) 조회(2) 검색(3) 수정(4) 종료(0)=");
		System.out.println("==================================");
		

				
		while(flag) {			
			
			System.out.print("\n메뉴 선택 : ");		
			int menu = scan.nextInt();
			
			switch(menu) {
				case 1: 	//1.등록								
						if(count!=3) {
								for(int i=count;i<scoreList.length;i++) {	
	
									System.out.println("\n\t등록");
									
									System.out.print("이름 : ");								
									nameList[i]=scan.next();
									
									int tot=0;
									
									for(int j=0;j<scoreList[i].length;j++) {
										if(j<3) {
										System.out.print(subList[j]+" : ");
										scoreList[i][j] = scan.nextInt();	
										tot+=scoreList[i][j];
										}else if(j==3) { //총점
											scoreList[i][j]=tot;
										}else if(j==4) { //평균
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
						System.out.println("===========================================");
						System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
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
								System.out.println("===========================================");
								System.out.println("이름\t국어\t영어\t수학\t총점\t평균");	
								System.out.print("\n"+nameList[i]+"\t");
								
								for(int j=0;j<scoreList[i].length;j++) {
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
									if(j<3) {
										System.out.print(subList[j]+" : ");
										scoreList[temp][j] = scan.nextInt();	
										tot+=scoreList[temp][j];
										}else if(j==3) { //총점
											scoreList[temp][j]=tot;
										}else if(j==4) { //평균
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
					if(nameList[0]!=null) {
						System.out.print("\n\t수정할 학생 이름 : ");
						String inName = scan.next();
						System.out.println();						
						for(int i=0;i<nameList.length;i++) {
							if(inName.equals(nameList[i])) {	
								temp=i;
								i=nameList.length;
								nameList[temp]=null;
								for(int j=0;j<scoreList[temp].length;j++) {
									scoreList[temp][j]=0;
								}
								count--;
								System.out.println("삭제 돼었습니다.");
							}else if(i==nameList.length-1)
								System.out.println("등록되지 않았습니다.");
						}
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
