package java_0824_11day;

public class DrawTest1 {

	public static void main(String[] args) {
		원 원 = new 원("빨강");
		삼각형 초록색삼각형 = new 삼각형("초록");
		사각형 파랑색사각형 = new 사각형("노랑");
		도형 노랑색삼각형 = new 삼각형("노랑색");
//		삼각형 파랑삼각형 = new 도형(); //자식으로 부모 호출 불가
		노랑색삼각형.color="빨강색";
		
		도형 a = new 도형();
		도형 b = new 원();
		도형 c = new 사각형();
		도형 d = b;
		d=c;
		원 f = (원)b;
		사각형 g=(사각형)c;
		
		
		원.draw();
		초록색삼각형.draw();
		파랑색사각형.draw();
		노랑색삼각형.draw();
		System.out.println(노랑색삼각형.color);
		
		초록색삼각형 = (삼각형)노랑색삼각형;
		// ㄴ>> 삼각형 타입		ㄴ>>도형타입에 속해있는 노랑색 삼각형을 삼각형 타입으로 명시
		
	}

}
