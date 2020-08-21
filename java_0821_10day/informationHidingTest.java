package java_0821_10day;

public class informationHidingTest {

	public static void main(String[] args) {
		//접근제어자
		InfoVO vo = new InfoVO();
//		vo.name = "홍길동";
		vo.age = 123;
		vo.addr="길동";
		
		vo.setAge(10);
		vo.setAge("10");
		
	}



}
