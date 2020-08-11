package java_0811_3day;

public class java_20_다차원배열 {

	public static void main(String[] args) {
		// 2차원 : 3행 3열
		int[][] marr = new int[3][3];
		for(int i=0;i<marr.length;i++) {
			for(int j=0;j<marr[i].length;j++) {
				System.out.print(marr[i][j]+"\t");
			}//for(j)열
			System.out.println();
		}//for(i)행
		System.out.println();

//		배열에 수 넣기
		int a=1;
		int[][] marr2 = new int[2][4];
		for(int i=0;i<marr2.length;i++) {
			for(int j=0;j<marr2[i].length;j++) {
				marr2[i][j]=a;
				a++;
				System.out.print(marr2[i][j]+"\t");
			}//for(j)열
			System.out.println();
		}//for(i)행
		System.out.println();

	
	
	}//main

}//class
