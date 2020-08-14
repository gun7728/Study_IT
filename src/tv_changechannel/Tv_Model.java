package tv_changechannel;

public class Tv_Model {
	String name;
	
	public void setName(String name) {
		this.name=name;	
	}
	
	
	public void changeChannel(int channel) {
		System.out.println(name+"TV 채널이 "+channel+"번으로 변경되었습니다.");
	}
	
}
