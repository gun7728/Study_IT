/**
 * ���˾��� �ްԼ��� Ŀ�����Ǳ⿡�� 300��¥�� ��ũ Ŀ�Ǹ� ���÷��� �Ѵ�. ����, 500��¥�� ������ �ְ�, ��ũĿ�Ǹ� �����Ѵ�. Ŀ������ �� �̶�� �޽����� �߸鼭, ����� ���˾��� Ŀ�ǿ� �Ž����� 200�����޴´�.
���� - Ŀ�����Ǳ��� �޴��� ��ũĿ��(300��), �Ƹ޸�ī��(400��), ������(300��), ����(200��) �̴�.

1. �޴����� �� ���
2. ������ ����
3. �ֹ� & �ܵ�
4. �޴� ����
 * 
 */
package coffee_machine_stru;

import java.util.Scanner;

public class CoffeeMachineTest {

	public static void main(String[] args) {
		//1.�޴����� �� ���
		Scanner scan = new Scanner(System.in);
		
		int menuNum=0;
		String sel="";
		String[] menu = new String[menuNum];
		int[] price = new int[menuNum];
		int selNum =0;
		int inPrice=0;
		
		boolean flag=true;
		boolean coinFlag=true;
		
		while(flag) {
			System.out.println();
			System.out.println("�ֹ��Ͻðڽ��ϱ�? (y/n)");
			System.out.print("���� : ");
			sel=scan.next();
			if(sel.equals("y")) {					//�޴� ����
				coinFlag=true;
				if(menuNum!=0) 
				{
					System.out.println("\n�޴��� ������ �ּ���.");		
					System.out.println("0. ���");			
					for(int i=0;i<menu.length;i++) {
						System.out.print((i+1)+". "+menu[i]+" : "+price[i]+"\t");
					}//�޴� ���
					System.out.print("\n���� : ");						
					selNum=(scan.nextInt()-1);
					if(selNum!=-1)
					{
						if(selNum<menu.length) 
						{					
							System.out.print("\n"+menu[selNum]+"�� ���� : ");
							System.out.println(price[selNum]+"���� �Ա��� �ּ���.");
							System.out.print("�Ա� : ");
							inPrice=scan.nextInt();
							while(coinFlag) 
							{
								if(inPrice<price[selNum]) {
									System.out.println((price[selNum]-inPrice)+"���� �����մϴ�");
									System.out.print("�Ա� : ");	
									inPrice=inPrice+scan.nextInt();							
								}if(inPrice==price[selNum]) {
									System.out.println("\n"+menu[selNum]+"��(��) ì���ּ���.");
									coinFlag=false;
								}else if(inPrice>price[selNum])
								{
									System.out.println("�Ž����� "+(inPrice-price[selNum])+ "���� "+menu[selNum]+"��(��) ì���ּ���.");			
									coinFlag=false;
								}
							}
									
							
						}else
							System.out.println("\n�ٽ� ������ �ּ���");
					}else if(selNum==-1) 
						System.out.println("\n\t���");
					
				}else
					System.out.println("������ ���� �޴��� ������ �ּ���.");
				

				
			}else if(sel.equals("n")) {				//����
				System.out.println("�����մϴ�.");
				flag=false;
			}else if(sel.equals("mgm")) 			//������ ���
			{
				System.out.print("\n�޴��� ������ �Է��� �ּ��� : "); //�޴� ����
				menuNum=scan.nextInt();	
				menu = new String[menuNum];
				price = new int[menuNum];
				for(int i=0;i<menu.length;i++) 
				{
					System.out.print("\n�޴��� �߰����ּ��� : ");
					menu[i] = scan.next();
					System.out.print(menu[i]+"�� ������ �Է��� �ּ��� : ");
					price[i] = scan.nextInt();
					
				}//for
			}else if(sel.equals("edit"))
			{
				
			}else
				System.out.println("�ٽ� ������ �ּ���");	//�ٽü���
		}//while

	}//main

}//while
