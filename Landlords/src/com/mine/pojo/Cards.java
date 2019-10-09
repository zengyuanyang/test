package com.mine.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Cards {
	private HashMap<String,String> allCards = new HashMap<String, String>();  //以键值对形式存储所有牌，键：牌大小，值：牌的图片路径
	private ArrayList<String> allCardsList = new ArrayList<String>();		  //只存储牌大小的ArrayList
	private ArrayList<String> myCardsList = new ArrayList<String>();		  //存储玩家手牌的ArrayList
	private ArrayList<String> chuCardsList = new ArrayList<String>();         //储存当前打出去的牌
	public Cards() {
		allCards.put("A1", ".\\src\\com\\mine\\swing\\images\\A1.jpg");
		allCards.put("A2", ".\\src\\com\\mine\\swing\\images\\A2.jpg");
		allCards.put("A3", ".\\src\\com\\mine\\swing\\images\\A3.jpg");
		allCards.put("A4", ".\\src\\com\\mine\\swing\\images\\A4.jpg");
		allCards.put("B1", ".\\src\\com\\mine\\swing\\images\\B1.jpg");
		allCards.put("B2", ".\\src\\com\\mine\\swing\\images\\B2.jpg");
		allCards.put("B3", ".\\src\\com\\mine\\swing\\images\\B3.jpg");
		allCards.put("B4", ".\\src\\com\\mine\\swing\\images\\B4.jpg");
		allCards.put("C1", ".\\src\\com\\mine\\swing\\images\\C1.jpg");
		allCards.put("C2", ".\\src\\com\\mine\\swing\\images\\C2.jpg");
		allCards.put("C3", ".\\src\\com\\mine\\swing\\images\\C3.jpg");
		allCards.put("C4", ".\\src\\com\\mine\\swing\\images\\C4.jpg");
		allCards.put("D1", ".\\src\\com\\mine\\swing\\images\\D1.jpg");
		allCards.put("D2", ".\\src\\com\\mine\\swing\\images\\D2.jpg");
		allCards.put("D3", ".\\src\\com\\mine\\swing\\images\\D3.jpg");
		allCards.put("D4", ".\\src\\com\\mine\\swing\\images\\D4.jpg");
		allCards.put("E1", ".\\src\\com\\mine\\swing\\images\\E1.jpg");
		allCards.put("E2", ".\\src\\com\\mine\\swing\\images\\E2.jpg");
		allCards.put("E3", ".\\src\\com\\mine\\swing\\images\\E3.jpg");
		allCards.put("E4", ".\\src\\com\\mine\\swing\\images\\E4.jpg");
		allCards.put("F1", ".\\src\\com\\mine\\swing\\images\\F1.jpg");
		allCards.put("F2", ".\\src\\com\\mine\\swing\\images\\F2.jpg");
		allCards.put("F3", ".\\src\\com\\mine\\swing\\images\\F3.jpg");
		allCards.put("F4", ".\\src\\com\\mine\\swing\\images\\F4.jpg");
		allCards.put("G1", ".\\src\\com\\mine\\swing\\images\\G1.jpg");
		allCards.put("G2", ".\\src\\com\\mine\\swing\\images\\G2.jpg");
		allCards.put("G3", ".\\src\\com\\mine\\swing\\images\\G3.jpg");
		allCards.put("G4", ".\\src\\com\\mine\\swing\\images\\G4.jpg");
		allCards.put("H1", ".\\src\\com\\mine\\swing\\images\\H1.jpg");
		allCards.put("H2", ".\\src\\com\\mine\\swing\\images\\H2.jpg");
		allCards.put("H3", ".\\src\\com\\mine\\swing\\images\\H3.jpg");
		allCards.put("H4", ".\\src\\com\\mine\\swing\\images\\H4.jpg");
		allCards.put("I1", ".\\src\\com\\mine\\swing\\images\\I1.jpg");
		allCards.put("I2", ".\\src\\com\\mine\\swing\\images\\I2.jpg");
		allCards.put("I3", ".\\src\\com\\mine\\swing\\images\\I3.jpg");
		allCards.put("I4", ".\\src\\com\\mine\\swing\\images\\I4.jpg");
		allCards.put("J1", ".\\src\\com\\mine\\swing\\images\\J1.jpg");
		allCards.put("J2", ".\\src\\com\\mine\\swing\\images\\J2.jpg");
		allCards.put("J3", ".\\src\\com\\mine\\swing\\images\\J3.jpg");
		allCards.put("J4", ".\\src\\com\\mine\\swing\\images\\J4.jpg");
		allCards.put("K1", ".\\src\\com\\mine\\swing\\images\\K1.jpg");
		allCards.put("K2", ".\\src\\com\\mine\\swing\\images\\K2.jpg");
		allCards.put("K3", ".\\src\\com\\mine\\swing\\images\\K3.jpg");
		allCards.put("K4", ".\\src\\com\\mine\\swing\\images\\K4.jpg");
		allCards.put("L1", ".\\src\\com\\mine\\swing\\images\\L1.jpg");
		allCards.put("L2", ".\\src\\com\\mine\\swing\\images\\L2.jpg");
		allCards.put("L3", ".\\src\\com\\mine\\swing\\images\\L3.jpg");
		allCards.put("L4", ".\\src\\com\\mine\\swing\\images\\L4.jpg");
		allCards.put("M1", ".\\src\\com\\mine\\swing\\images\\M1.jpg");
		allCards.put("M2", ".\\src\\com\\mine\\swing\\images\\M2.jpg");
		allCards.put("M3", ".\\src\\com\\mine\\swing\\images\\M3.jpg");
		allCards.put("M4", ".\\src\\com\\mine\\swing\\images\\M4.jpg");
		allCards.put("N", ".\\src\\com\\mine\\swing\\images\\N.jpg");
		allCards.put("O", ".\\src\\com\\mine\\swing\\images\\O.jpg");
		
		for (Map.Entry<String, String> m : allCards.entrySet()) {
			allCardsList.add(m.getKey());
		}
		Collections.shuffle(allCardsList);
		
		for(int i = 0;i < 17;i++) {
			myCardsList.add(allCardsList.get(i));
		}
		TreeSet<String> flag = new TreeSet<String>();
		flag.addAll(myCardsList);
		myCardsList.clear();
		myCardsList.addAll(flag);
	}
	
	public HashMap<String, String> getAllCards() {
		return allCards;
	}
	public void setAllCards(HashMap<String, String> allCards) {
		this.allCards = allCards;
	}

	public ArrayList<String> getAllCardsList() {
		return allCardsList;
	}

	public void setAllCardsList(ArrayList<String> allCardsList) {
		this.allCardsList = allCardsList;
	}

	public ArrayList<String> getMyCardsList() {
		return myCardsList;
	}

	public void setMyCardsList(ArrayList<String> myCardsList) {
		this.myCardsList = myCardsList;
	}

	public ArrayList<String> getChuCardsList() {
		return chuCardsList;
	}

	public void setChuCardsList(ArrayList<String> chuCardsList) {
		this.chuCardsList = chuCardsList;
	}
	

}
