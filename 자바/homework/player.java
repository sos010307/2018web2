package homework;
import java.util.Scanner;
public class player {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String champion[] = {"전사","마법사","궁수"};
		String userch ="";
		int pic = 0;
		System.out.print("플레이할 캐릭터를 선택해 주세요");
		userch = sc.nextLine();
		
		for(int i=0;i<champion.length;i++) {
			if(userch.equals(champion[i]));
				pic = i;
		}
		
	}
	
}
