package day5;
import java.util.Scanner;

class Phone {
	public Phone (){}
	static String name[];
	static String tel[];
	
}

class PhoneBook extends Phone{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int num = -1;
		String search = null;
		int man;
		System.out.print("�ο����� �Է��ϼ��� >>");
		man = sc.nextInt();
		name = new String[man];
		tel = new String[man];
		
		for(int i=0;i<man;i++){
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>");
			name[i] = sc.next();
			tel[i] = sc.next();
		}
		System.out.print("����Ǿ����ϴ�...");
		
		while(flag){
			System.out.print("�˻��� �̸�>>");
			search = sc.nextLine();
			for(int i=0;i<man;i++){
				if(search.equals("�׸�")){
					flag = false;
					break;
				}else if(search.equals(name[i]))
					num = i;
				
			}
			if(num == -1 && flag == true && search != null)
				System.out.print(search + " �� �����ϴ�.\n");
			else if(flag == true)
				System.out.print(search + "�� ��ȣ�� " + tel[num] +"�Դϴ�.\n");
			num = -1;
		}
		sc.close();
	}
}
