package homework;

public class User extends Unit{
	int mp = 0;
	String type[] = {"근거리","원거리"};
	int ad = 0;
	int ap = 0;
	int level = 1;
	String sk = "";
	public String skill (String sk) {
		switch(sk) {
			case "q":
			case "Q":
				this.sk = "Q 스킬을 사용했따!";
				break;
			case "w":
			case "W":
				this.sk = "W 스킬을 사용했따!";
				break;
			case "e":
			case "E":
				this.sk = "E 스킬을 사용했따!";
				break;
			case "r":
			case "R":
				this.sk = "R 궁극기 스킬을 사용했따! 가즈아ㅏㅏㅏㅏ";
				break;
			default:
				this.sk = "기본공격!";
				break;
		}
		return sk;
	}
	
}
