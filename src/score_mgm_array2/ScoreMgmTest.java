/**
 *  2���� �迭�� Ȱ���� ���� ���� ���α׷�
 * 	1.���
 * 	2.��ȸ
 * 	3.�˻�
 * 	4.����
 * 
 */
package score_mgm_arry2;

import java.util.Scanner;

public class ScoreMgmTest {

	public static void main(String[] args) {
		//�⺻
		Scanner scan = new Scanner(System.in);
		String[] nameList = new String[3];
		int[][] scoreList = new int[3][5];
		String[] subList = {"����","����","����"}; //���� ����Ʈ
		String select="";
		int count=0; // ���� ī��Ʈ��

		boolean flag=true;
		
		//�޴�
		System.out.println("==================================");
		System.out.println("=========  ���� ����  ���α׷�    =========");
		System.out.println("=���(1) ��ȸ(2) �˻�(3) ����(4) ����(0)=");
		System.out.println("==================================");
		

				
		while(flag) {			
			
			System.out.print("\n�޴� ���� : ");		
			int menu = scan.nextInt();
			
			switch(menu) {
				case 1: 	//1.���								
						if(count!=3) {
								for(int i=count;i<scoreList.length;i++) {	
	
									System.out.println("\n\t���");
									
									System.out.print("�̸� : ");								
									nameList[i]=scan.next();
									
									int tot=0;
									
									for(int j=0;j<scoreList[i].length;j++) {
										if(j<3) {
										System.out.print(subList[j]+" : ");
										scoreList[i][j] = scan.nextInt();	
										tot+=scoreList[i][j];
										}else if(j==3) { //����
											scoreList[i][j]=tot;
										}else if(j==4) { //���
											scoreList[i][j]=tot/subList.length;
										}
									}//for.j
									
									System.out.println("\n\t����� �Ϸ� �Ǿ����ϴ�.");
									System.out.print("\n��� ��� �Ͻðڽ��ϱ�? (y/n) : ");
									String sel = scan.next();
									count++;
									if(sel.equals("n")) {	
										i=scoreList.length;											
									}else if(count==scoreList.length) 
									{
										System.out.println("�ʰ�");
										i=scoreList.length;	
									}
									

								}//for.i			
						}else if(count==3)
							System.out.println("�ʰ�");
						{
					}
						break;
	
										
				case 2:
					if(nameList[0]!=null) {
						System.out.println("\n\t��ȸ\n");	
						System.out.println("===========================================");
						System.out.println("�̸�\t����\t����\t����\t����\t���");
						for(int i=0;i<scoreList.length;i++) {
							if(nameList[i]!=null) {
								System.out.print("\n"+nameList[i]+"\t");
								for(int j=0;j<scoreList[i].length;j++) {
									System.out.print(scoreList[i][j]+"\t");
								}
							}
						}
					}else {
						System.out.println("��� ���� ���ּ���");						
					}
					System.out.println(); // �ڸ� ���� ����
					break;
					
				case 3:
					if(nameList[0]!=null) {
						System.out.print("\n\t�˻� : ");
						String inName = scan.next();
						System.out.println();
						for(int i=0;i<nameList.length;i++) {
							if(inName.equals(nameList[i])) {
								System.out.println("===========================================");
								System.out.println("�̸�\t����\t����\t����\t����\t���");	
								System.out.print("\n"+nameList[i]+"\t");
								
								for(int j=0;j<scoreList[i].length;j++) {
									System.out.print(scoreList[i][j]+"\t");	
								}
								i=nameList.length;
								
							}else if(i==nameList.length-1)
								System.out.println("��ϵ��� �ʾҽ��ϴ�.");
						}
					}else{
						System.out.println("��� ���� ���ּ���");						
					}
					System.out.println();
					break;
					
				case 4:
					int temp=0;
					if(nameList[0]!=null) {
						System.out.print("\n\t������ �л� �̸� : ");
						String inName = scan.next();
						System.out.println();						
						for(int i=0;i<nameList.length;i++) {
							if(inName.equals(nameList[i])) {	
								temp=i;
								i=nameList.length;
								System.out.print("\t������ �̸� : ");
								nameList[temp]=scan.next();
								int tot=0;
								for(int j=0;j<scoreList[temp].length;j++) {
									if(j<3) {
										System.out.print(subList[j]+" : ");
										scoreList[temp][j] = scan.nextInt();	
										tot+=scoreList[temp][j];
										}else if(j==3) { //����
											scoreList[temp][j]=tot;
										}else if(j==4) { //���
											scoreList[temp][j]=tot/subList.length;
										}//if.j									
								}//for.j			
								System.out.println("������ �Ϸ�Ǿ����ϴ�.");
							}else if(i==nameList.length-1)
								System.out.println("��ϵ��� �ʾҽ��ϴ�.");
						}
					}else{
						System.out.println("��� ���� ���ּ���");						
					}
					System.out.println();
					break;
					
				case 5:		
					if(nameList[0]!=null) {
						System.out.print("\n\t������ �л� �̸� : ");
						String inName = scan.next();
						System.out.println();						
						for(int i=0;i<nameList.length;i++) {
							if(inName.equals(nameList[i])) {	
								temp=i;
								i=nameList.length;
								nameList[temp]=null;
								for(int j=0;j<scoreList[temp].length;j++) {
									scoreList[temp][j]=0;
								}
								count--;
								System.out.println("���� �ž����ϴ�.");
							}else if(i==nameList.length-1)
								System.out.println("��ϵ��� �ʾҽ��ϴ�.");
						}
					}else{
						System.out.println("��� ���� ���ּ���");						
					}
					System.out.println();
					break;
					
				case 0:
					System.out.println("\n\t����");
					flag=false;
					break;
					
			}//switch
			
		}//while
		
		
		
	}//main

}//class
