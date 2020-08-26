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
	 * ���
	 */
	public Object input(String fname){
		ScoreVO score = new ScoreVO();
		 
		if(fname.equals("insert")) {
			System.out.print("�л���>");
			String name = scan.next();
			int idx = searchIndex(name);
			if(nameCheck(name)) {				
					System.out.println("�̹� ��ϵ� �̸��Դϴ�");
					choiceMenu();
				}else {
					score.setName(name);
				}			
		}
		
		System.out.print("����>");
		score.setKor(scan.nextInt());
		
		System.out.print("����>");
		score.setEng(scan.nextInt());
		
		System.out.print("����>");
		score.setMath(scan.nextInt());
		
		return score;
	}
	
	public void insert(){		
		if(scoreList.add((ScoreVO)input("insert"))){
			System.out.println("����� �Ϸ�Ǿ����ϴ�");
		}else {
			System.out.println("����� �����Ͽ����ϴ�");
		}
		
		choiceMenu();
	}
	
	/**
	 * �������
	 */
	public void select(){
		if(scoreList.size()!=0) {
			System.out.println("�л���\t����\t����\t����");
			for(ScoreVO score : scoreList) {
				System.out.print(score.getName());
				System.out.print("\t"+score.getKor());
				System.out.print("\t"+score.getEng());
				System.out.println("\t"+score.getMath());			
			}
		}else {
			System.out.println("��Ϻ��� ���ּ���");
		}		
		choiceMenu();
	}
	
	/**
	 * �ε��� �˻�
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
	 * ����
	 */
	public void update(){
		System.out.print("������ �л���>");
		String name = scan.next();
		int update_idx = searchIndex(name);
		if(update_idx!=-1) {
			ScoreVO update_score = (ScoreVO)input("update");
			update_score.setName(name);
			scoreList.set(update_idx,update_score);
			System.out.println("������ �Ϸ� �Ǿ����ϴ�");
		}else {
			System.out.println("�ش� �л��� ��ϵ��� �ʾҽ��ϴ�");
		}
		
		choiceMenu();
	}
	
	
	/**
	 * ����
	 */
	public void delete(){
		System.out.print("������ �л���>>");
		String name = scan.next();
		int delete_idx = searchIndex(name);{
			if(delete_idx!=-1) {
				scoreList.remove(delete_idx);
				System.out.println("������ �Ϸ� �Ǿ����ϴ�");
			}else {
				System.out.println("�ش� �л��� ��ϵ��� �ʾҽ��ϴ�");
			}
		}
		
		choiceMenu();
	}
	
	
	
	/**
	 * �޴� ���
	 */
	public void showMenu() {
		System.out.println("==============================");
		System.out.println("\t���� ���� �ý���   ");
		System.out.println("==============================");	
		System.out.println("  1. ���� ���");
		System.out.println("  2. ���� ��ȸ");
		System.out.println("  3. ���� ����");
		System.out.println("  4. ���� ����");
		System.out.println("  5. ���α׷� ����");
		System.out.println("==============================");	
	}

	 
	/**
	 * �޴� ����
	 */
	public void choiceMenu() {
		System.out.print("\n�޴� ����>");
		
		switch(scan.nextInt()) {
		case 1:		insert();		break;
		case 2:		select();		break;
		case 3:		update();		break;
		case 4:		delete();		break;
		
		case 5:		
			System.out.println("== ���α׷��� �����մϴ� ==");
			System.exit(0);	
			break;
			
		default:
			System.out.println("�غ���~");
		}
	}	


}
