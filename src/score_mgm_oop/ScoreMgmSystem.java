package score_mgm_oop;

import java.util.Scanner;

public class ScoreMgmSystem {
	//Field
	/**필드선언
	 * 
	 */
	ScoreVO[] scoreList;
	Scanner scan = new Scanner(System.in);
	int addrInfo=0;
	int searchNum=-1;
	//Constructor
	//Method
	
	/**
	 * 초기화 담당
	 */
	public void init() {
		setNum();
		showMenu();
		choiceMenu();
	}
	
	/**
	 * 등록 인원 설정
	 */
	public void setNum() {
		System.out.print("등록할 학생 수를 입력해 주세요 : ");
		int selNum=scan.nextInt();
		if(selNum>0) {
			scoreList = new ScoreVO[selNum];
		}else {
			System.out.println("다시 설정해 주세요");
			setNum();
		}
	}
	
	/**
	 * 메뉴 출력
	 */
	public void showMenu() {
		System.out.println("\t\t================");
		System.out.println("\t\t==== 성적관리  ====");
		System.out.println("\t\t================");
		System.out.println("\t1.등록\t2.조회\t3.수정\t4.삭제\t5.특정 학생 검색\t6.종료");
	}
	
	/**
	 * 메뉴 선택 가능
	 */
	public void choiceMenu() {
		searchNum=-1;
		System.out.print("\n메뉴를 선택해 주세요 : ");
		switch(scan.nextInt()) {
		case 1:
			insert();
			break;
			
		case 2:
			searchScore();
			break;
			
		case 3:
			editScore();
			break;
			
		case 4:
			deleteScore();
			break;
			
		case 5:
			selSearch();
			break;
			
		case 6:
			System.exit(0);
			break;
		}
	}
	
	/**
	 * 성적등록
	 */
	public void insert() {
		if(addrInfo<scoreList.length) {
			ScoreVO score = new ScoreVO();
			
			System.out.print("\n이름을 입력해 주세요 : ");
			score.setName(scan.next());
			
			System.out.print("국어 성적을 입력해 주세요 : ");
			score.setKor(scan.nextInt());
			
			System.out.print("영어 성적을 입력해 주세요 : ");
			score.setEng(scan.nextInt());
			
			System.out.print("수학 성적을 입력해 주세요 : ");
			score.setMath(scan.nextInt());
			
			scoreList[addrInfo]=score;
			addrInfo++;
		}else {
				System.out.println("더이상 등록할 수 없습니다.");
		}
		
		choiceMenu();
		}
	
	
	/**
	 * 성적조회
	 */
	public void searchScore() {
		int searchNum=0;
		int size=scoreList.length;
		searchStu(0,size);
		choiceMenu();
		
	}
	
	public void searchStu(int searchNum, int size) {		
		if(scoreList[0]!=null) {
			for(int i=searchNum;i<size;i++) {
				if(scoreList[i]!=null) {
					System.out.print(scoreList[i].getName()+"\t");
					System.out.print(scoreList[i].getKor()+"\t");
					System.out.print(scoreList[i].getEng()+"\t");
					System.out.println(scoreList[i].getMath());
				}
			}
		}else {
			System.out.println("\n\t등록먼저 해주세요.");
		}
		choiceMenu();
	}
	
	public void selSearch() {
		if(scoreList[0]!=null) {
			System.out.print("검색할 학생 이름을 입력해 주세요 : ");			
			int selSearchNum = searchInfo(scan.next());
			searchStu(selSearchNum,selSearchNum+1);
		}
		
		choiceMenu();
	}
	
	/**
	 * 성적수정
	 */
	public void editScore() {
		if(scoreList[0]!=null) {
			System.out.print("수정할 학생 이름을 입력해 주세요 : ");			
			searchInfo(scan.next());
			if(searchNum!=-1) {
				System.out.print("수정하실 이름으로 입력해 주세요 : ");
				scoreList[searchNum].setName(scan.next());
				System.out.print("국어 : ");
				scoreList[searchNum].setKor(scan.nextInt());
				System.out.print("영어 : ");
				scoreList[searchNum].setEng(scan.nextInt());
				System.out.print("수학 : ");
				scoreList[searchNum].setMath(scan.nextInt());
				
			}else {
				System.out.println("해당 이름을 찾을 수 없습니다.");
			}
			
		}else {
			System.out.println("\n\t등록먼저 해주세요.");
		}
		
		choiceMenu();
		
	}
	
	/**
	 * 학생 찾기
	 */
	public int searchInfo(String name) {	
		 for(int i=0;i<addrInfo;i++) {
			 if(scoreList[i].getName().equals(name)) {
				 searchNum=i;
			 }
		 }		 
		 return searchNum;
	}
	
	/**
	 * 성적삭제
	 */
	public void deleteScore() {
		if(scoreList[0]!=null) {	
			System.out.print("삭제할 학생 이름 입력 : ");
			searchInfo(scan.next());
			if(searchNum!=-1) {
				for(int i=searchNum;i<scoreList.length-1;i++) {
					scoreList[i]=scoreList[i+1];
					searchNum=i;
				}
				addrInfo--;
				scoreList[addrInfo]=null;
			}
		}else {
			System.out.println("\n\t등록먼저 해주세요.");
		}
		
		choiceMenu();
	}
	
	/**
	 * 특정 학생 검색
	 */
	
}
