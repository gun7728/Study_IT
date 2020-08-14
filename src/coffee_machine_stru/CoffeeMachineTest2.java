/**
 * ���˾��� �ްԼ��� Ŀ�����Ǳ⿡�� 300��¥�� ��ũ Ŀ�Ǹ� ���÷��� �Ѵ�. 
 * ����, 500��¥�� ������ �ְ�, ��ũĿ�Ǹ� �����Ѵ�. Ŀ������ �� �̶�� �޽����� �߸鼭,
 * ����� ���˾��� Ŀ�ǿ� �Ž����� 200�����޴´�.
 * ���� - Ŀ�����Ǳ��� �޴��� ��ũĿ��(300��), �Ƹ޸�ī��(400��), ������(300��), ����(200��) �̴�.
 * 
 * 1)���, ����� ����
 *	��� : ��, �ްԼ�, Ŀ�����Ǳ�, ����(��), �޴�
 * 	���� : ���� �ֱ�, �޴� ����, Ŀ�� ����(�޽���), �Ž�����, Ŀ�� ���� 
 *     (Ŭ����)	   (��������)
 *		��	 	:	 ����(O) 
 *		���Ǳ�	:	 ����(O), �޴�(O) 

 *		
 *  Ŭ���� : ��
 *   -�Ӽ� : ���� 
 *	 -��� : ���� ����, �޴� ����
 *  
 *  Ŭ���� : ���Ǳ�
 *   -�Ӽ� : ����, �޴�
 *   -��� : �ݾ� Ȯ��, �޴� ����, �ܵ� ���
 *   
 *(������ Ŭ����)
 *	-Ŭ���� : Customer.java
 *		��������	: int coin
 *		�޼ҵ�	: int insertCoin(), choiceMenu()
 *
 *	-Ŭ���� : CoffeeMachine.java
 *		��������	: int coin, String[] menu, int priceList, String choiceMenu,
 *					int choiceMenuPrice
 *		�޼ҵ�	: void coinCheck(int coin), void makeMenu(), ....
 *  
 */

package coffee_machine_stru;

import java.util.Scanner;

public class CoffeeMachineTest2 {

	public static void main(String[] args) {
		String[] menuList = {"����", "��ũĿ��","������", "�Ƹ޸�ī��"};
		int[] priceList = {200,300,300,400};
		
		System.out.println("================================");
		System.out.println("\t������ ���� �ްԼ� ���Ǳ�\t");
		System.out.println("================================");
		for(int i=0;i<menuList.length;i++) {
			System.out.println("\t"+(i+1)+". "+menuList[i]+":"+priceList[i]);
		}
		System.out.println("================================");
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int coin = 0;
		
		while(flag) {			
			System.out.print("������ �־��ּ���>");
			coin += scan.nextInt();
			
			if(coin>=200) {
				//�ֹ����� �޴� ����
				if(coin>=200 && coin<300) {
					System.out.println("�ֹ����� �޴� : [����]");
				}else if(coin>=300 && coin<400) {
					System.out.println("�ֹ����� �޴� : [����],[��ũĿ��],[������]");
				}else if(coin>=400) {
					System.out.println("�ֹ����� �޴� : [����],[��ũĿ��],[������],[�Ƹ޸�ī��]");
				}
				
				//�޴�����
				System.out.print("�޴��� �������ּ���(��ȣ)>");
				int menu = scan.nextInt();
				String choiceMenu = "";
				int choiceMenuPrice = 0;
				
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
				}
				
				System.out.print("�����Ͻ� �޴��� " + choiceMenu+"�̰�,");
				System.out.print("������ " + choiceMenuPrice+" �Դϴ�.\n");
				
				//�ܵ���� �� �޴�����
				System.out.println("-- �޴��� �ϼ��Ǿ����ϴ�.--");
				int change = 0;
				if(coin>choiceMenuPrice) {
					change = coin - choiceMenuPrice;
					System.out.println("�ֹ��Ͻ� �޴� " + choiceMenu+"�Դϴ�.");
					System.out.println("�ܵ��� " + change +" �Դϴ�.");
				}else {
					System.out.println("�ֹ��Ͻ� �޴� " + choiceMenu+"�Դϴ�.");
				}
				
				flag = false;
				
			}else {
				System.out.println("�ݾ��� �����մϴ�.");
				System.out.println("coin------>>" + coin);
				
			}//if
			
		}//while
		
		
	}//main

}//class

























