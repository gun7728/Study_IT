package tv_changechannel;

import java.util.Scanner;

public class RemoteCon {

	public static void main(String[] args) {
		
		Tv_Model �ＺTV = new Tv_Model();
		Tv_Model ����TV = new Tv_Model();
		Tv_Model �ʸ���TV = new Tv_Model();
		
		�ＺTV.setName("�Ｚ");
		����TV.setName("����");
		�ʸ���TV.setName("�ʸ���");
		
		�ＺTV.changeChannel(5);
		����TV.changeChannel(7);
		�ʸ���TV.changeChannel(9);
	}

}
