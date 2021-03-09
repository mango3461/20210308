package object;

public class AcTest {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사임");
		Magician m1 = new Magician("법사임");
//		w1.level = 1;
//		w1.id = "전사";
//		w1.hp = 20;
//		w1.atk = 3;
		
		w1.getStatus();
		w1.huntMonster();
		w1.getStatus();
		
		w1.heal();
		w1.getStatus();
		
		m1.getStatus();
		m1.huntMonster();
		m1.getStatus();

		m1.meditation();
		m1.getStatus();
	}

}
