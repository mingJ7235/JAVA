package tms;

public abstract class Public {

	String [] arStation = {"����", "����", "����", "����"};
	
	abstract int pay (int money);
	abstract void showDestMsg(String destination);
	abstract String go (int btnIndex, int money);
}
