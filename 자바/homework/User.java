package homework;

public class User extends Unit{
	int mp = 0;
	String type[] = {"�ٰŸ�","���Ÿ�"};
	int ad = 0;
	int ap = 0;
	int level = 1;
	String sk = "";
	public String skill (String sk) {
		switch(sk) {
			case "q":
			case "Q":
				this.sk = "Q ��ų�� ����ߵ�!";
				break;
			case "w":
			case "W":
				this.sk = "W ��ų�� ����ߵ�!";
				break;
			case "e":
			case "E":
				this.sk = "E ��ų�� ����ߵ�!";
				break;
			case "r":
			case "R":
				this.sk = "R �ñر� ��ų�� ����ߵ�! ����Ƥ�������";
				break;
			default:
				this.sk = "�⺻����!";
				break;
		}
		return sk;
	}
	
}
