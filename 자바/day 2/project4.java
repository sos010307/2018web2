package day2;

import java.util.Scanner;

public class project4 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3���Է�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int median = a;
		if((a>=b && a<=c) || (a>=c && a<=b))
			median = a;
		else if((b>=a && b<=c) || (b>=c && b<=a))
			median = b;
		else
			median = c;
		System.out.print("�߰�����" + median);
		scanner.close();
		
	}
}
