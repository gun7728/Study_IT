package java_0825_12day;

public class 역삼동물병원 {

	public static void main(String[] args) {
			
//		동물 a = new 동물() //추상클래스는 객체 생성이 불가능함(자식을 통해서만 생성 가능)
		Object[] dogList = new 강아지[2];
		동물[] catList = new 고양이[2];
		
		
		강아지 푸들 = new 강아지("푸들");
		강아지 치와와 = new 강아지("치와와");
		dogList[0] = 푸들;
		dogList[1] = 치와와;

		고양이 샴 = new 고양이("샴");	
		고양이 러시안블루 = new 고양이("러시안블루");
		
		catList[0]=샴;
		catList[1]=러시안블루;

		for(Object an : dogList) {
			강아지 dog = (강아지)an;
			dog.sleep();
//			an.sleep();
		}
		
		for(Object an : catList) {
			고양이 cat=(고양이)an;
			cat.sleep();
		}
		
//		동물 동물 = new 동물();	//클래스가 추상클래스라 객체 생성이불가능하다.
//		푸들.setName("뽀삐"); //부모와 자식이 같은 메소드가 있을경우 자식이 무조건 실행
//		System.out.println(푸들.getName());
//		
//		푸들.sleep();	//같은 sleep 메소드를 자식과 부모가 가지고있으면 있으면 자식만 실행

	}
}
