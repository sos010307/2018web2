package day2;
import java.util.Scanner;
public class project2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double money,oman,man,chun,bek,oship,ship,il;
		System.out.print("�ݾ��� �Է��ϼ���:");
		money = scanner.nextInt();
		oman = Math.floor(money/50000);
		man = Math.floor(money-oman*50000);
		chun = Math.floor(money-oman*50000-man*10000);
		bek = Math.floor(money-oman*50000-man*10000 - chun*1000);
		oship = Math.floor(money-oman*50000-man*10000 - chun*1000 - bek*100);
		ship = Math.floor(money-oman*50000-man*10000 - chun*1000 - bek*100 - oship*50);
		il = Math.floor(money-oman*50000-man*10000 - chun*1000 - bek*100 - oship*50 - ship*10);
		System.out.print("��������"+oman+"��");
		System.out.print("������"+man+"��");
		System.out.print("õ����"+chun+"��");
		System.out.print("�����"+bek+"��");
		System.out.print("���ʿ���"+oship+"��");
		System.out.print("�ʿ���"+ship+"��");
		System.out.print("�Ͽ���"+il+"��");
	}
}
