package java_0821_10day;

public class informationHidingTest {

	public static void main(String[] args) {
		//����������
		InfoVO vo = new InfoVO();
//		vo.name = "ȫ�浿";
		vo.age = 123;
		vo.addr="�浿";
		
		vo.setAge(10);
		vo.setAge("10");
		
	}



}
