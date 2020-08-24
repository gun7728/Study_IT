package java_0824_11day;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		
		삼각형 a1 = new 삼각형();
		사각형 b1 = new 사각형();
		
		alist.add(a1);	//상속받은 최상위 개체인 object형태로 들어간다 (나머지는 비활성화)
		alist.add(b1);	//상속받은 최상위 개체인 object형태로 들어간다
		
		
		삼각형 a11 = (삼각형)alist.get(0);	//비활성화 시킨 삼각형을 명시해줘서 가져온다.
		사각형 b11 = (사각형)alist.get(1);
		
		a11.draw();
		b11.draw();
	}

}
