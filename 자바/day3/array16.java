package day3;

import java.util.Scanner;

public class array16 {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		String my;
		String str[] = {"����","����","��"};
		System.out.print("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.\n");
		
		while(true){
			System.out.print("\n���� ���� ��!>>");
			int n = (int)(Math.random()*3);
			my = sc.nextLine();
			
			if(my.equals("����")){
				System.out.print("����� = "+my+",��ǻ�� = "+str[n]+",");
				if(str[n].equals("����")){
					System.out.print("�����ϴ�");
				}else if(str[n].equals("����")){
					System.out.print("����ڰ� �����ϴ�");
				}else if(str[n].equals("��")){
					System.out.print("����ڰ� �̰���ϴ�");
				}
				continue;
			}else if(my.equals("����")){
				System.out.print("����� = "+my+",��ǻ�� = "+str[n]+",");
				if(str[n].equals("����")){
					System.out.print("�����ϴ�");
				}else if(str[n].equals("��")){
					System.out.print("����ڰ� �����ϴ�");
				}else if(str[n].equals("����")){
					System.out.print("����ڰ� �̰���ϴ�");
				}
				continue;
			}else if(my.equals("��")){
				System.out.print("����� = "+my+",��ǻ�� = "+str[n]+",");
				if(str[n].equals("��")){
					System.out.print("�����ϴ�");
				}else if(str[n].equals("����")){
					System.out.print("����ڰ� �����ϴ�");
				}else if(str[n].equals("����")){
					System.out.print("����ڰ� �̰���ϴ�");
				}
				continue;
			}else if(my.equals("�׸�")){
				System.out.print("������ �����մϴ�....");
				break;
			}else{
				System.out.print("�߸��� �Է°��Դϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
		}
		sc.close();
	}
}
