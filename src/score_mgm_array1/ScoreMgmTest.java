/**
 * *********점수 관리**********
 *		Test파일을 만들어서 연습
 * 1. 메뉴 생성 및 실행 - while
 * 2. 데이터 저장 - 1차원 열, 학생명, 국어, 영어, 수학
 * 
 */
package score_mgm_array1;

import java.util.Scanner;

public class ScoreMgmTest {

	public static void main(String[] args) {
		
		
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("-------    성적 관리 프로그램         -------");
		System.out.println("--- 등록(1) 조회(2) 검색(3) 종료(0) ---");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		Scanner scan = new Scanner(System.in);	
		
		int count=0;
		int stuNum=3;
		
		String[] nameList = new String[stuNum];
		int[] korList = new int[stuNum];
		int[] engList = new int[stuNum];
		int[] mathList = new int[stuNum];
		int[] totList = new int[stuNum];
		int[] avgList= new int[stuNum];
		
		String sel;
		
		String search;
		
		boolean flag=true;
		
		while(flag) {
			
			System.out.print("\n메뉴 선택 : ");
			int menu = scan.nextInt();		 		//메뉴 선택
			
			switch(menu) {
			case 1:
				//등록
				if(count!=nameList.length) {
					System.out.println("\n\t등록");
				
					//학생수 설정		
	
					for(int i=count;i<nameList.length;i++) {
						System.out.print((i+1)+"번 학생명 : ");				
						nameList[i]=scan.next();
						System.out.print("국어 : ");
						korList[i]=scan.nextInt();
						System.out.print("영어 : ");
						engList[i]=scan.nextInt();
						System.out.print("수학 : ");
						mathList[i]=scan.nextInt();
						
						totList[i]=korList[i]+engList[i]+mathList[i];
						avgList[i]=totList[i]/3;

						System.out.println("\n\t등록이 완료 되었습니다.");
						System.out.print("\n계속 등록 하시겠습니까? (y/n) : ");
						sel = scan.next();					
						if(sel.equals("n")) {							
							i=nameList.length;			
						}else if(count==nameList.length-1) {	
							System.out.println("등록이 불가능합니다");	
							i=nameList.length;			
						}
							count++;
					}//for
				}else
					System.out.println("\n\t저장공간이 가득찼습니다.");
				break;				
			
			case 2:
				if(nameList[0]!=null) {
					System.out.println("\n\t조회\n");
					System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
					System.out.println("-------------------------------------------");
					for(int i=0;i<nameList.length;i++) {
						if(nameList[i]!=null){
						System.out.println(nameList[i]+"\t"+korList[i]+"\t"+engList[i]+"\t"+mathList[i]+"\t"+totList[i]+"\t"+avgList[i]);
						}else {
							break;
						}
					}//for
				}else
					System.out.println("\n등록부터 진행해주세요"); // if
				break;				
				
			case 3:
				if(nameList[0]!=null) {
					System.out.print("\n검색 : ");
					search = scan.next();
					
					for(int i=0;i<nameList.length;i++) 
					{
						if(search.equals(nameList[i])) {
							System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균");
							System.out.println("-------------------------------------------");
							System.out.println(nameList[i]+"\t"+korList[i]+"\t"+engList[i]+"\t"+mathList[i]+"\t"+totList[i]+"\t"+avgList[i]);
							i=nameList.length;
						}else if(i==nameList.length-1)
							System.out.println("\n\t찾을수없습니다.");
						
					}
				}else
					System.out.println("\n등록부터 진행해주세요"); // if

				break;
				
			case 0:
				System.out.println("\n종료되었습니다.");
				flag=false;
				break;		
				
			default :
				System.out.println("\n준비중입니다.");			
				
			}//switch
			
		}//while
		scan.close();
		
	}

}
