package day3;

import java.util.Scanner;

public class pj5 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		int three[] = new int[10];
		System.out.print("�������� 10���� �Է��Ͻÿ�.");
		for(int i=0,j=0;i<10;i++){
			num[i] = scanner.nextInt();
		}
		System.out.print("3�ǹ���� ");
		for(int i=0;i<num.length;i++){
			if(num[i]%3 == 0){
				System.out.print(num[i]+" ");
			}
		}
	}
}
