package java_0826_13day;

public class StaticTest {

	public static void main(String[] args) {
		StaticObject so = new StaticObject();
		System.out.println("우유\t: "+so.Milk);
//		System.out.println("아메리카노\t: "+StaticObject.milk); 	//milk는 스테틱영역에 없어서 사용불가
		System.out.println("아메리카노\t: "+so.Americano);			//비효율적이지 못쓰는건 아님
										// ㄴ>>so라는 객체생성해서 그 객체에서 ameriacno를 찾고 없는걸 확인해서 static으로 가서
										//StaticObject.Americano를 가져온다. 즉 비효율적
		
		System.out.println("아메리카노\t: "+StaticObject.Americano);
		
		so.Milk=100;
//		StaticObject.Americano=100; 	//final이 붙으면 수정이 불가능하다
		
		StaticObject.test();
		so.test();	//비효율
		
		System.out.println(so.Milk);
		System.out.println(StaticObject.Americano);
		
	}

}
