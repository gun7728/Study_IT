package java_0824_11day;

import java.util.HashMap;

public class ObjectTest2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		String key = "test";
		String value = "123";
		
		String name = "»ï°¢Çü";
		»ï°¢Çü a = new »ï°¢Çü();
		
		hm.put(key, value);		
		hm.put(name,a);
		
		»ï°¢Çü aa = (»ï°¢Çü)hm.get(name);
		
		System.out.println(hm.get(key));
		System.out.println(hm.get(name));
		aa.draw();
	}

}
