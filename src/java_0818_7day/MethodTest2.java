package java_0818_7day;

public class MethodTest2 {
	
	int i=100,j=100;
	
	//���Ͼ���, �Ķ���;���
	public void sum1() {
		System.out.println("result : "+(i+j));
	}
	
	//�����ְ�,�Ķ���;���
	public int sum2() {
		return i+j;
	}
	
	//���Ͼ���,�Ķ��������
	public void sum3(int a,int b) {
		System.out.println(a+b);
	}
	
	//�����ְ�,�Ķ��������
	public boolean getName(String name) {
		boolean result=false;
		if(name.equals("ȫ�浿")) {
			result=true;
		}
			
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest2 md = new MethodTest2();
		
		md.sum1();
		
		System.out.println("result :"+ md.sum2());
		
		md.sum3(100,100);
		
		if(md.getName("ȫ�浿")) {
			System.out.println("ȫ�浿�� �½��ϴ�.");
		}else
			System.out.println("ȫ�浿�� �ƴմϴ�.");
	}

}
