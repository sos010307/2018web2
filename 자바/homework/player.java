package homework;
import java.util.Scanner;
public class player {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String champion[] = {"����","������","�ü�"};
		String userch ="";
		int pic = 0;
		System.out.print("�÷����� ĳ���͸� ������ �ּ���");
		userch = sc.nextLine();
		
		for(int i=0;i<champion.length;i++) {
			if(userch.equals(champion[i]));
				pic = i;
		}
		
	}
	
}
