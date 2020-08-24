package java_0824_11day;

public class ObjectTest {

	public static void main(String[] args) {
		Object obj = new Object();
		원 obj2 = new 원();
		obj = obj2;	//obj2는 ojb도 가지고있고 원도 가지고있어서 더 크므로, obj2에잇는 object를 obj에 넣을 수 있다. 
					//(도형, 원은 비활성화 상태로 넣어진다)
		
		원 obj3 = (원)obj;	//obj에 obj2를 넣어준 상태이므로 원,도형이 있는 상태고, 원을 명시함으로 활성화 하여 넣어줄 수 있다.
			
		System.out.println("obj----->"+obj.hashCode());
		System.out.println("obj2----->"+obj3.hashCode());
	}

}
