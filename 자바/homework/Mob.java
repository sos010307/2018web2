package homework;

public class Mob extends Unit{
	int cooltime = 35;
	int ad = 1;
	int power = 0;
	public int attack() {
		power = ad*((int)(Math.random()*10)+1);
		return power;
	}
}
