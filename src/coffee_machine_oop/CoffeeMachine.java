package coffee_machine_oop;

import java.util.Scanner;

public class CoffeeMachine {
	//Field
	int coin,choiceMenuPrice,select;
	String choiceMenu;
	String[] menuList = {"����", "��ũĿ��","������", "�Ƹ޸�ī��"};
	int[] priceList = {200,300,300,400};
	

	
	//Method
	
	//�޴� ���
	public void showMenu() {
		for(int i=0;i<menuList.length;i++) {
			System.out.println("\t"+(i+1)+". "+menuList[i]+":"+priceList[i]);
		}
		System.out.println("================================");
	}//showMenu
	
	//���� üũ
	public boolean coinCheck(int coin) {
		boolean result=false;
		this.coin = coin;	//��������(this.)coin�� �������� coin���� ����
		if(coin>=200) {
			System.out.println("�ֹ� �����մϴ�.");
			System.out.println("coin------------>>"+coin);
			result=true;
			showChoiceMenu();	//Ŭ�������� �ٸ� �޼ҵ� ����ȣ�� �� �Ķ���� ����
		}else {
			System.out.println("�ݾ��� �����մϴ�.");
			System.out.println("coin------------>>"+coin);			
			result=false;
		}
		return result;
	}//coinCheck
	
	
	//�ֹ� ������ �޴��� ���
	public void showChoiceMenu() {		
		if(coin>=200 && coin<300) {
			System.out.println("�ֹ����� �޴� : [����]");
			select=1;
		}else if(coin>=300 && coin<400) {
			System.out.println("�ֹ����� �޴� : [����],[��ũĿ��],[������]");
			select=3;
		}else if(coin>=400) {
			System.out.println("�ֹ����� �޴� : [����],[��ũĿ��],[������],[�Ƹ޸�ī��]");
			select=4;
		}		
		orderMenu();
	}//showChoiceMenu
	
	
	//�޴� ����
	public void orderMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�޴��� ������ �ּ���");
		int menu=scan.nextInt();
		if(menu>select) {
			System.out.println("\n\t�߸������̽��ϴ�.\n");
			showChoiceMenu();
		}else {
			switch(menu) {
				case 1:
					choiceMenu = menuList[menu-1];
					choiceMenuPrice = priceList[menu-1];
					break;
				case 2:
					choiceMenu = menuList[menu-1];
					choiceMenuPrice = priceList[menu-1];
					break;
				case 3:
					choiceMenu = menuList[menu-1];
					choiceMenuPrice = priceList[menu-1];
					break;
				case 4:
					choiceMenu = menuList[menu-1];
					choiceMenuPrice = priceList[menu-1];
					break;
				default:
					System.out.println("�غ����Դϴ�.");
			}//switch
			
			giveMenu();
			System.out.print("�����Ͻ� �޴��� " + choiceMenu+"�̰�,");
			System.out.print(" ������ " + choiceMenuPrice+"�� �Դϴ�.\n");
		}
		
		
	}//orderMenu
	
	
	//�ܵ� ���
	public int calChange() {
		int change=0;
		if(coin>choiceMenuPrice) {
			change = coin - choiceMenuPrice;			
		}
		return change;
	}//calChange
	
	//�޴�, �ܵ� ����
	public void giveMenu() {
		if(calChange() != 0) {
			System.out.print("\n�ֹ��Ͻ� �޴� "+choiceMenu+"�̰�, ");
			System.out.print(" �ܵ��� " + calChange()+"�� �Դϴ�.\n");
		}else {
			System.out.println("\n�ֹ��Ͻ� �޴� "+choiceMenu+"�Դϴ�.");
		}
	}//giveMenu
	
	
	
}//class







