/**
 * �л� 3���� ��,��,�� ������ �Է¹޾�, ����ϼ���
 */

package java_0811_3day;

import java.util.Scanner;

public class java_19_ArrayTest2 {

	public static void main(String[] args) {
		// 1. �л� A�� ������ �ް�
		// 2. �л� B�� ������ �ް�
		// 3. �л� C�� ������ �ް� While�� or For�� ���
		System.out.print("�� ���� �л��� �Է� �Ͻó���? : ");		
		Scanner scan = new Scanner(System.in);
		int many = scan.nextInt();
		String[] name= new String[many]; 		//�Է��� �л� ��
		
		String[] subList = {"����","����","����"};
		int[] kor = new int[many];
		int[] eng = new int[many];
		int[] math = new int[many];				// �л� �� ����Ʈ
		int[] tot=new int[many];
		double[] avgList = new double[many];
				
		
		for(int i=0;i<name.length;i++) {
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name[i]=scan.next();	
			System.out.print("���� : ");	
			kor[i] = scan.nextInt();	
			System.out.print("���� : ");	
			eng[i] = scan.nextInt();	
			System.out.print("���� : ");	
			math[i] = scan.nextInt();	
			
			
			tot[i]=math[i]+eng[i]+kor[i];
			avgList[i]=tot[i]/subList.length;
			}//for(name)
		
		System.out.println("�л���\t����\t����\t����\t����\t���");
		System.out.println("===========================================");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avgList[i]);
		}//���

	}//main

}//class
