/**
 * *********���� ����**********
 *		Test������ ���� ����
 * 1. �޴� ���� �� ���� - while
 * 2. ������ ���� - 1���� ��, �л���, ����, ����, ����
 * 
 */
package score_mgm_array1;

import java.util.Scanner;

public class ScoreMgmTest {

	public static void main(String[] args) {
		
		
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("-------    ���� ���� ���α׷�         -------");
		System.out.println("--- ���(1) ��ȸ(2) �˻�(3) ����(0) ---");
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
			
			System.out.print("\n�޴� ���� : ");
			int menu = scan.nextInt();		 		//�޴� ����
			
			switch(menu) {
			case 1:
				//���
				if(count!=nameList.length) {
					System.out.println("\n\t���");
				
					//�л��� ����		
	
					for(int i=count;i<nameList.length;i++) {
						System.out.print((i+1)+"�� �л��� : ");				
						nameList[i]=scan.next();
						System.out.print("���� : ");
						korList[i]=scan.nextInt();
						System.out.print("���� : ");
						engList[i]=scan.nextInt();
						System.out.print("���� : ");
						mathList[i]=scan.nextInt();
						
						totList[i]=korList[i]+engList[i]+mathList[i];
						avgList[i]=totList[i]/3;

						System.out.println("\n\t����� �Ϸ� �Ǿ����ϴ�.");
						System.out.print("\n��� ��� �Ͻðڽ��ϱ�? (y/n) : ");
						sel = scan.next();					
						if(sel.equals("n")) {							
							i=nameList.length;			
						}else if(count==nameList.length-1) {	
							System.out.println("����� �Ұ����մϴ�");	
							i=nameList.length;			
						}
							count++;
					}//for
				}else
					System.out.println("\n\t��������� ����á���ϴ�.");
				break;				
			
			case 2:
				if(nameList[0]!=null) {
					System.out.println("\n\t��ȸ\n");
					System.out.println("�̸�\t����\t����\t����\t����\t���");
					System.out.println("-------------------------------------------");
					for(int i=0;i<nameList.length;i++) {
						if(nameList[i]!=null){
						System.out.println(nameList[i]+"\t"+korList[i]+"\t"+engList[i]+"\t"+mathList[i]+"\t"+totList[i]+"\t"+avgList[i]);
						}else {
							break;
						}
					}//for
				}else
					System.out.println("\n��Ϻ��� �������ּ���"); // if
				break;				
				
			case 3:
				if(nameList[0]!=null) {
					System.out.print("\n�˻� : ");
					search = scan.next();
					
					for(int i=0;i<nameList.length;i++) 
					{
						if(search.equals(nameList[i])) {
							System.out.println("\n�̸�\t����\t����\t����\t����\t���");
							System.out.println("-------------------------------------------");
							System.out.println(nameList[i]+"\t"+korList[i]+"\t"+engList[i]+"\t"+mathList[i]+"\t"+totList[i]+"\t"+avgList[i]);
							i=nameList.length;
						}else if(i==nameList.length-1)
							System.out.println("\n\tã���������ϴ�.");
						
					}
				}else
					System.out.println("\n��Ϻ��� �������ּ���"); // if

				break;
				
			case 0:
				System.out.println("\n����Ǿ����ϴ�.");
				flag=false;
				break;		
				
			default :
				System.out.println("\n�غ����Դϴ�.");			
				
			}//switch
			
		}//while
		scan.close();
		
	}

}
