package day2;

import java.util.Scanner;

public class pj5 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		int three[] = new int[10];
		System.out.print("�������� 10���� �Է��Ͻÿ�.");
		for(int i=0,j=0;i<10;i++){
			num[i] = scanner.nextInt();
			if(num[i]%3 == 0){
				three[j] = num[i];
				j++;
			}
		}
		System.out.print("3�ǹ���� ");
		for(int i=0;i<three.length;i++)
			System.out.print(three[i]);
	}
}
