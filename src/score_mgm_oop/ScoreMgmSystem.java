package score_mgm_oop;

import java.util.Scanner;

public class ScoreMgmSystem {
	//Field
	/**�ʵ弱��
	 * 
	 */
	ScoreVO[] scoreList;
	Scanner scan = new Scanner(System.in);
	int addrInfo=0;
	int searchNum=-1;
	//Constructor
	//Method
	
	/**
	 * �ʱ�ȭ ���
	 */
	public void init() {
		setNum();
		showMenu();
		choiceMenu();
	}
	
	/**
	 * ��� �ο� ����
	 */
	public void setNum() {
		System.out.print("����� �л� ���� �Է��� �ּ��� : ");
		int selNum=scan.nextInt();
		if(selNum>0) {
			scoreList = new ScoreVO[selNum];
		}else {
			System.out.println("�ٽ� ������ �ּ���");
			setNum();
		}
	}
	
	/**
	 * �޴� ���
	 */
	public void showMenu() {
		System.out.println("\t\t================");
		System.out.println("\t\t==== ��������  ====");
		System.out.println("\t\t================");
		System.out.println("\t1.���\t2.��ȸ\t3.����\t4.����\t5.Ư�� �л� �˻�\t6.����");
	}
	
	/**
	 * �޴� ���� ����
	 */
	public void choiceMenu() {
		searchNum=-1;
		System.out.print("\n�޴��� ������ �ּ��� : ");
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
	 * �������
	 */
	public void insert() {
		if(addrInfo<scoreList.length) {
			ScoreVO score = new ScoreVO();
			
			System.out.print("\n�̸��� �Է��� �ּ��� : ");
			score.setName(scan.next());
			
			System.out.print("���� ������ �Է��� �ּ��� : ");
			score.setKor(scan.nextInt());
			
			System.out.print("���� ������ �Է��� �ּ��� : ");
			score.setEng(scan.nextInt());
			
			System.out.print("���� ������ �Է��� �ּ��� : ");
			score.setMath(scan.nextInt());
			
			scoreList[addrInfo]=score;
			addrInfo++;
		}else {
				System.out.println("���̻� ����� �� �����ϴ�.");
		}
		
		choiceMenu();
		}
	
	
	/**
	 * ������ȸ
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
			System.out.println("\n\t��ϸ��� ���ּ���.");
		}
		choiceMenu();
	}
	
	public void selSearch() {
		if(scoreList[0]!=null) {
			System.out.print("�˻��� �л� �̸��� �Է��� �ּ��� : ");			
			int selSearchNum = searchInfo(scan.next());
			searchStu(selSearchNum,selSearchNum+1);
		}
		
		choiceMenu();
	}
	
	/**
	 * ��������
	 */
	public void editScore() {
		if(scoreList[0]!=null) {
			System.out.print("������ �л� �̸��� �Է��� �ּ��� : ");			
			searchInfo(scan.next());
			if(searchNum!=-1) {
				System.out.print("�����Ͻ� �̸����� �Է��� �ּ��� : ");
				scoreList[searchNum].setName(scan.next());
				System.out.print("���� : ");
				scoreList[searchNum].setKor(scan.nextInt());
				System.out.print("���� : ");
				scoreList[searchNum].setEng(scan.nextInt());
				System.out.print("���� : ");
				scoreList[searchNum].setMath(scan.nextInt());
				
			}else {
				System.out.println("�ش� �̸��� ã�� �� �����ϴ�.");
			}
			
		}else {
			System.out.println("\n\t��ϸ��� ���ּ���.");
		}
		
		choiceMenu();
		
	}
	
	/**
	 * �л� ã��
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
	 * ��������
	 */
	public void deleteScore() {
		if(scoreList[0]!=null) {	
			System.out.print("������ �л� �̸� �Է� : ");
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
			System.out.println("\n\t��ϸ��� ���ּ���.");
		}
		
		choiceMenu();
	}
	
	/**
	 * Ư�� �л� �˻�
	 */
	
}
