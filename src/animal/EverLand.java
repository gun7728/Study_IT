package animal;

public class EverLand {
	
	public static void main(String args[]) {
		
		System.out.println("************** 에버랜드 **************");
		Animal 사자 = new Animal();
		Animal 호랑이 = new Animal();
		Animal 기린 = new Animal();
		Animal 하마 = new Animal();
		
		사자.setName("사자");
		호랑이.setName("호랑이");
		기린.setName("기린");
		하마.setName("하마");
		
		System.out.println(사자.getName());
		System.out.println(호랑이.getName());
		System.out.println(기린.getName());
		System.out.println(하마.getName());
		
		사자.sleep();
		호랑이.eat();
		기린.workOut();
		하마.eat();
		
	}

}
