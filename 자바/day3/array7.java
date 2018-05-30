package day3;
import java.util.Scanner;

public class array7 {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		double sum = 0;
		System.out.print("·£´ıÇÑÁ¤¼öµé: ");
		for(int i=0;i<10;i++){
			num[i] = (int)(Math.random()*10 + 1);
			sum += num[i];
			System.out.print(num[i]+" ");
		}
		System.out.print("\nÆò±ÕÀº "+sum/num.length);
	}
}
