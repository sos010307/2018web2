package day5;
import java.util.Scanner;

class Grade {
	static int math;
	static int science;
	static int english;
	public Grade(int m, int s, int e){
		math = m;science = s;english = e;
	}
	private int average() {
		return (math+science+english)/3;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����,����,���� ������ 3���� ���� �Է�>>");
		math = scanner.nextInt();
		science = scanner.nextInt();
		english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scanner.close();
	}

	
}
