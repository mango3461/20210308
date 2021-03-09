package polymorph;

public class GameMain {
	public static void main(String[] args) {
		// 전사를 생성해주세요.
		Warrior w1 = new Warrior(25, 4, 1);
		// 오크를 orc1, orc2 두 개 생성해주세요.
		Orc o1 = new Orc();
		Orc o2 = new Orc();
		Dragon d1 = new Dragon();
		Dragon d2 = new Dragon();
		Troll t1 = new Troll();
		Goblin g1 = new Goblin();
				
		w1.showHp();
		o1.showHp();
		o2.showHp();
		d1.showHp();
		t1.showHp();
		g1.showHp();
		// orc1에게 전사의 hunt메서드를 적용하세요.
		w1.hunt(o1);
		w1.hunt(t1);
		w1.hunt(d1);
		w1.hunt(g1);
		// 전사, orc1, orc2의 체력을 조회해주세요.
		w1.showHp();
		o1.showHp();
		o2.showHp();
		d1.showHp();
		t1.showHp();
		g1.showHp();
	}
}
