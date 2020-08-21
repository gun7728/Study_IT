package coffee_machine_oop2;

import java.util.Scanner;

public class MachineMgmSystem {

	Scanner scan = new Scanner(System.in);
	CoffeeVO[] coffeeList;	
	CoffeeVO choice_menu;
	
	public MachineMgmSystem() {
		init();
		showMenu();		//�޴����
		coinCheck(0);	//���μ���
	}
		
	public void init() {
		String[] nameList = {"����", "��ũĿ��","������", "�Ƹ޸�ī��"};
		int[] priceList = {200,300,300,400};
		
		coffeeList = new CoffeeVO[nameList.length];
		int i=0;
		for(String name : nameList) {					
			int price = priceList[i];
			
			CoffeeVO coffee = new CoffeeVO();
			coffee.setName(name);
			coffee.setPrice(price);
			
			coffeeList[i]=coffee;
			
			i++;
		}
	}//init
	
	
	public void showMenu() {
		System.out.println("______________________");
		System.out.println("________ ���Ǳ� ________");
		System.out.println("______________________");
		int no=1;
		for(CoffeeVO list : coffeeList) {
			System.out.print(" "+no +" . "+list.getName()+"\t: ");
			System.out.print(list.getPrice()+"\n");
			no++;
		}
	}//showMenu

	
	public void canOrder(int num) {
		System.out.print("�ֹ� ���� �޴� : ");
		if(num>=1) {
			System.out.print("1.����");
		}
		
		if(num>=2) {
			System.out.print(", 2.��ũĿ��, 3.������");
		}	
		
		if(num>=3) {
			System.out.print(", 4.�Ƹ޸�ī��");
		}
		
	}
	/**
	 * ���� �Է¹޾�, üũ�Ѵ�.
	 */
	public void coinCheck(int oriCoin) {
			int coin=oriCoin;
			System.out.println("______________________");
			System.out.println("\n\t���� ���Ծ� : "+oriCoin);
			if(coin==0) {
				System.out.print("\n������ �Է��� �ּ��� >>");					
				coin = oriCoin+ scan.nextInt();
			}else {
				System.out.println("������ �����ðڽ��ϱ�?(y/n)");
				String answer = scan.next();
				if(answer.equals("y"))
				{
						System.out.print("\n������ �Է��� �ּ��� >>");					
						coin = oriCoin+ scan.nextInt();
						
				}else if(answer.equals("n")) {
					System.out.println("");
				}else {
					System.out.println("�߸� �����̽��ϴ�.");
				}
			}
			boolean flag=true;
			
			while(flag) {
			if(coin>=200) {
				System.out.println("\n���Աݾ� >> "+coin);
				if(coin>=400) {
					canOrder(3);
				}else if(coin>=300) {
					canOrder(2);
				}else
					canOrder(1);
				System.out.println("\n\t������ �߰��Ͻ÷��� 0���� �Է����ּ��� >>");
				System.out.print("\n�޴��� �������ּ��� >> ");
				int selNum=scan.nextInt();
				if(selNum!=0) {
					selectMenu(selNum, coin);
					flag=false;
				}else if(selNum==0) {
					coinCheck(coin);
				}
				
			}else {
				System.out.println("\n���Աݾ� >> "+coin);
				System.out.print("������ �� �־��ּ��� >> ");
				coin=coin+scan.nextInt();
			}//if,else
		}//while			
			
	}//coinCheck
	
	
	public void selectMenu(int num,int oriCoin) {
		switch(num) {
			case 1:
				oriCoin=oriCoin-200;
//				choice_menu = coffeeList[num-1];
				System.out.println("\n\t"+coffeeList[num-1].getName()+"�� �غ����Դϴ�.");
				break;
				
			case 2:
				if(oriCoin<300) {
					printOrder(num,oriCoin);
				}else{
					oriCoin=oriCoin-300;
					System.out.println("\n\t"+coffeeList[num-1].getName()+"�� �غ����Դϴ�.");
				}
				break;
				
			case 3:
				if(oriCoin<300) {
					printOrder(num,oriCoin);
				}else {
					oriCoin=oriCoin-300;
					System.out.println("\n\t"+coffeeList[num-1].getName()+"�� �غ����Դϴ�.");
				}
				break;
			
			case 4:
				if(oriCoin<400) {
					printOrder(num,oriCoin);
				}else {
					oriCoin=oriCoin-400;
					System.out.println("\n\t"+coffeeList[num-1].getName()+"�� �غ����Դϴ�.");
				}
				break;
			
			default:
				System.out.println("�߸� �����̽��ϴ�.");
				System.out.print("�ٽ� ������ �ּ��� : ");
				selectMenu(scan.nextInt(), oriCoin);
				break;
		}//switch
		if(oriCoin!=0) {
			System.out.println("�ܵ��� ��ȯ�Ͻðڽ��ϱ�?(y/n)");
			String sel = scan.next();
			if(sel.equals("y")) {
			System.out.println("\n\t"+coffeeList[num-1].getName()+"�� �ܵ��� ì���ּ���.");
			System.out.println("\t�ܵ� : " +oriCoin);
			coinCheck(0);
			}else if(sel.equals("n")){
				System.out.println("\n\t"+coffeeList[num-1].getName()+"�� ì���ּ���.");
				System.out.println("������ : "+oriCoin);
				coinCheck(oriCoin);
			}else {
				System.out.println("\n\t�ٽ� �������ּ���.");
			}
		}else {
			System.out.println("\n\t"+coffeeList[num-1].getName()+"�� ì���ּ���.");
			coinCheck(0);
		}
	}//selectMenu
	
	public void printOrder(int num,int oriCoin) {
		System.out.println("\n\t"+coffeeList[num-1].getName()+"�� ���� >> "+coffeeList[num-1].getPrice());
		System.out.println("\t���Աݾ� >> "+oriCoin);
		System.out.println("\t�ֹ��� �Ұ����մϴ�");
		coinCheck(oriCoin);
	}
	
	
	
	
}//class


