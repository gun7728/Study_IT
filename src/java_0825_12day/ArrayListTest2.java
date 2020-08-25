package java_0825_12day;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
//		ArrayList<강아지> list = new ArrayList<강아지>();
		//강아지만 들어갈수있는 10개의 배열을 만든다
		//강아지[] list = new 강아지[10];와 비슷하다
		ArrayList<강아지> list = new ArrayList<강아지>(2);
		// ㄴ>> 2개로 배열을 생성하고 실행해도 부족할 시 알아서 추가해서 생성한다.
		
		String[] nameList = {"뽀삐","삐삐","코코"};
		
		for(String name : nameList) {
			강아지 dog = new 강아지(name);
			list.add(dog);
		}
		for(강아지 dog : list) {
			dog.sleep();
		}
		
	}

}
