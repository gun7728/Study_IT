package tv_changechannel;

public class Tv_Model {
	String name;
	
	public void setName(String name) {
		this.name=name;	
	}
	
	
	public void changeChannel(int channel) {
		System.out.println(name+"TV ä���� "+channel+"������ ����Ǿ����ϴ�.");
	}
	
}
