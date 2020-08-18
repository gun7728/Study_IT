package java_0818_7day;

public class MethodTest2 {
	
	int i=100,j=100;
	
	//리턴없고, 파라미터없음
	public void sum1() {
		System.out.println("result : "+(i+j));
	}
	
	//리턴있고,파라미터없음
	public int sum2() {
		return i+j;
	}
	
	//리턴없고,파라미터있음
	public void sum3(int a,int b) {
		System.out.println(a+b);
	}
	
	//리턴있고,파라미터있음
	public boolean getName(String name) {
		boolean result=false;
		if(name.equals("홍길동")) {
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
		
		if(md.getName("홍길동")) {
			System.out.println("홍길동이 맞습니다.");
		}else
			System.out.println("홍길동이 아닙니다.");
	}

}
