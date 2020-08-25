package java_0825_12day;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();	//오브젝트 타입으로 10개 생성
		// = Object[] ob = new Object[10]		
		
		강아지 dog1 = new 강아지("해피");
		강아지 dog2 = new 강아지("뽀삐");
		고양이 cat1 = new 고양이();
		
		list.add(dog1);
		list.add(dog2);
		list.add(cat1);
		
		강아지 dog1_1 = (강아지)list.get(0);
		강아지 dog2_1 = (강아지)list.get(1);
		고양이 cat1_1 = (고양이)list.get(2);
		
		dog1_1.sleep();
		dog2_1.sleep();
		cat1_1.sleep();
	}

}
