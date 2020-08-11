package java_0811_3day;

public class java_20_가변형배열 {

	public static void main(String[] args) {
		//가변형 배열
		//정해준 값의 행에 지정해주지 않은 열을 나중에 주는방법
				int[][] arr = new int[4][];
				arr[0] = new int[4];
				arr[1] = new int[3];
				arr[2] = new int[2];
				arr[3] = new int[4];
			
				arr[2] = new int[3];
				int a=0;
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						arr[i][j]=a;
						a+=10;
						System.out.print(arr[i][j]+"\t");
					}//for(J)열
					System.out.println();
				}//for(I)행
	}//main

}//class
