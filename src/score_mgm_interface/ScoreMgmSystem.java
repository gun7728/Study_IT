package score_mgm_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import commons.util.DataStandardManager;

public class ScoreMgmSystem implements DataStandardManager {
	//Field
	List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	
	Scanner scan = new Scanner(System.in);
	//Constructor
	
	//Method
	public ScoreMgmSystem() {
		showMenu();
		choiceMenu();
	}
	
	public boolean nameCheck(String name) {
		boolean result = false;

		for(ScoreVO score : scoreList) {
			if(score.getName()!=null) {
			if(score.getName().equals(name)) {
				result = true;
			}
			}
		}
		
		return result;
	}
	
	
	
	/**
	 * 등록
	 */
	public Object input(String fname){
		ScoreVO score = new ScoreVO();
		 
		if(fname.equals("insert")) {
			System.out.print("학생명>");
			String name = scan.next();
			int idx = searchIndex(name);
			if(nameCheck(name)) {				
					System.out.println("이미 등록된 이름입니다");
					choiceMenu();
				}else {
					score.setName(name);
				}			
		}
		
		System.out.print("국어>");
		score.setKor(scan.nextInt());
		
		System.out.print("영어>");
		score.setEng(scan.nextInt());
		
		System.out.print("수학>");
		score.setMath(scan.nextInt());
		
		return score;
	}
	
	public void insert(){		
		if(scoreList.add((ScoreVO)input("insert"))){
			System.out.println("등록이 완료되었습니다");
		}else {
			System.out.println("등록이 실패하였습니다");
		}
		
		choiceMenu();
	}
	
	/**
	 * 성적출력
	 */
	public void select(){
		if(scoreList.size()!=0) {
			System.out.println("학생명\t국어\t영어\t수학");
			for(ScoreVO score : scoreList) {
				System.out.print(score.getName());
				System.out.print("\t"+score.getKor());
				System.out.print("\t"+score.getEng());
				System.out.println("\t"+score.getMath());			
			}
		}else {
			System.out.println("등록부터 해주세요");
		}		
		choiceMenu();
	}
	
	/**
	 * 인덱스 검사
	 */
	public int searchIndex(String name) {
		int idx=-1;
		
		for(ScoreVO score : scoreList) {
			if(score.getName().equals(name)) {
				idx=scoreList.indexOf(score);
			}
		}
		
		return idx;
	}
	
	/**
	 * 수정
	 */
	public void update(){
		System.out.print("수정할 학색명>");
		String name = scan.next();
		int update_idx = searchIndex(name);
		if(update_idx!=-1) {
			ScoreVO update_score = (ScoreVO)input("update");
			update_score.setName(name);
			scoreList.set(update_idx,update_score);
			System.out.println("수정이 완료 되었습니다");
		}else {
			System.out.println("해당 학생이 등록되지 않았습니다");
		}
		
		choiceMenu();
	}
	
	
	/**
	 * 삭제
	 */
	public void delete(){
		System.out.print("삭제할 학생명>>");
		String name = scan.next();
		int delete_idx = searchIndex(name);{
			if(delete_idx!=-1) {
				scoreList.remove(delete_idx);
				System.out.println("삭제가 완료 되었습니다");
			}else {
				System.out.println("해당 학생이 등록되지 않았습니다");
			}
		}
		
		choiceMenu();
	}
	
	
	
	/**
	 * 메뉴 출력
	 */
	public void showMenu() {
		System.out.println("==============================");
		System.out.println("\t성적 관리 시스템   ");
		System.out.println("==============================");	
		System.out.println("  1. 성적 등록");
		System.out.println("  2. 성적 조회");
		System.out.println("  3. 성적 수정");
		System.out.println("  4. 성적 삭제");
		System.out.println("  5. 프로그램 종료");
		System.out.println("==============================");	
	}

	 
	/**
	 * 메뉴 선택
	 */
	public void choiceMenu() {
		System.out.print("\n메뉴 선택>");
		
		switch(scan.nextInt()) {
		case 1:		insert();		break;
		case 2:		select();		break;
		case 3:		update();		break;
		case 4:		delete();		break;
		
		case 5:		
			System.out.println("== 프로그램을 종료합니다 ==");
			System.exit(0);	
			break;
			
		default:
			System.out.println("준비중~");
		}
	}	


}
