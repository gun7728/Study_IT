package java_0825_12day;

public class ���ﵿ������ {

	public static void main(String[] args) {
			
//		���� a = new ����() //�߻�Ŭ������ ��ü ������ �Ұ�����(�ڽ��� ���ؼ��� ���� ����)
		Object[] dogList = new ������[2];
		����[] catList = new �����[2];
		
		
		������ Ǫ�� = new ������("Ǫ��");
		������ ġ�Ϳ� = new ������("ġ�Ϳ�");
		dogList[0] = Ǫ��;
		dogList[1] = ġ�Ϳ�;

		����� �� = new �����("��");	
		����� ���þȺ�� = new �����("���þȺ��");
		
		catList[0]=��;
		catList[1]=���þȺ��;

		for(Object an : dogList) {
			������ dog = (������)an;
			dog.sleep();
//			an.sleep();
		}
		
		for(Object an : catList) {
			����� cat=(�����)an;
			cat.sleep();
		}
		
//		���� ���� = new ����();	//Ŭ������ �߻�Ŭ������ ��ü �����̺Ұ����ϴ�.
//		Ǫ��.setName("�ǻ�"); //�θ�� �ڽ��� ���� �޼ҵ尡 ������� �ڽ��� ������ ����
//		System.out.println(Ǫ��.getName());
//		
//		Ǫ��.sleep();	//���� sleep �޼ҵ带 �ڽİ� �θ� ������������ ������ �ڽĸ� ����

	}
}
