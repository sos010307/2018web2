package day2;
import java.util.Scanner;
public class project2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double money,oman,man,chun,bek,oship,ship,il;
		System.out.print("금액을 입력하세요:");
		money = scanner.nextInt();
		oman = Math.floor(money/50000);
		man = Math.floor(money-oman*50000);
		chun = Math.floor(money-oman*50000-man*10000);
		bek = Math.floor(money-oman*50000-man*10000 - chun*1000);
		oship = Math.floor(money-oman*50000-man*10000 - chun*1000 - bek*100);
		ship = Math.floor(money-oman*50000-man*10000 - chun*1000 - bek*100 - oship*50);
		il = Math.floor(money-oman*50000-man*10000 - chun*1000 - bek*100 - oship*50 - ship*10);
		System.out.print("오만원권"+oman+"개");
		System.out.print("만원권"+man+"개");
		System.out.print("천원권"+chun+"개");
		System.out.print("백원권"+bek+"개");
		System.out.print("오십원권"+oship+"개");
		System.out.print("십원권"+ship+"개");
		System.out.print("일원권"+il+"개");
	}
}
