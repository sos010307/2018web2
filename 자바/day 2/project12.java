package day2;

import java.util.Scanner;

public class project12 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		for(int i = 0;i < 5;i++){
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max)
				max = intArray[i];
		}
		System.out.print("�Էµ� ������ ���� ū ���� "+ max +"�Դϴ�.");
	}
}
