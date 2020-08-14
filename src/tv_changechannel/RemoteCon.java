package tv_changechannel;

import java.util.Scanner;

public class RemoteCon {

	public static void main(String[] args) {
		
		Tv_Model »ï¼ºTV = new Tv_Model();
		Tv_Model ¿¤ÁöTV = new Tv_Model();
		Tv_Model ÇÊ¸³½ºTV = new Tv_Model();
		
		»ï¼ºTV.setName("»ï¼º");
		¿¤ÁöTV.setName("¿¤Áö");
		ÇÊ¸³½ºTV.setName("ÇÊ¸³½º");
		
		»ï¼ºTV.changeChannel(5);
		¿¤ÁöTV.changeChannel(7);
		ÇÊ¸³½ºTV.changeChannel(9);
	}

}
