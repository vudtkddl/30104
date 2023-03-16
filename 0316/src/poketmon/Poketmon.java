package poketmon;

public class Poketmon {
	String poketName;
	int legs;
	String skill;
	
	public Poketmon() {}
	public Poketmon(String poketName, int legs, String skill) {
		this.poketName = poketName;
		this.legs = legs;
		this.skill = skill;
	}
	
	public void showInfomation() {
		System.out.println("이름 : " + poketName);
		System.out.println("다리 : " + legs);
		System.out.println("기술 : " + skill);
	}
	
}
