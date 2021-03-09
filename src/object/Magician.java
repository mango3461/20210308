package object;

public class Magician {
	public int level;
	public int mana;
	public int mgAtk;
	public String id;
	
	public void getStatus() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("마나 : " + mana);
		System.out.println("마법공격력 : " + mgAtk);
		System.out.println();
	}
	
	public Magician(String userId) {
		System.out.println("법사 아이디 생성중입니다...");
		level = 1;
		mana = 15;
		mgAtk = 5;
		id = userId;
	}
	
	
	public void huntMonster() {
		System.out.println("사냥을 시작합니다.");
		level += 1;
		mana -= 4;
	}
	
	public void meditation() {
		mana = 15;
	}
}


