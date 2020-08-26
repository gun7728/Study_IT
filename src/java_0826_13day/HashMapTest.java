package java_0826_13day;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		Map map = new HashMap();
		Map<String,String> map2 = new HashMap<String, String>();
		String name = "이름";
		String value = "홍길동";
		String kor = "국어점수";
		String score = "100";
		map2.put(name, value);
		map2.put(kor,score);
		System.out.println(map2.get(name));
		System.out.println(map2.get(kor));
		System.out.println(Integer.parseInt(map2.get(kor))+100);
	}

}
