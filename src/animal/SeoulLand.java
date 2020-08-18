package animal;

public class SeoulLand {
	
	public static void main(String args[]) {
		
		System.out.println("************** 서울랜드 **************");
		Animal 사자 = new Animal();
		Animal 호랑이 = new Animal();
		Animal 기린 = new Animal();
		Animal 하마 = new Animal();
		
		사자.setName("사자");
		호랑이.setName("호랑이");
		기린.setName("기린");
		하마.setName("하마");
		
		사자.sleep();
		호랑이.eat();
		기린.workOut();
		하마.eat();
		
	}
}
