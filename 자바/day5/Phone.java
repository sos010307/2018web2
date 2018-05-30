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
		System.out.print("인원수를 입력하세요 >>");
		man = sc.nextInt();
		name = new String[man];
		tel = new String[man];
		
		for(int i=0;i<man;i++){
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			name[i] = sc.next();
			tel[i] = sc.next();
		}
		System.out.print("저장되었습니다...");
		
		while(flag){
			System.out.print("검색할 이름>>");
			search = sc.nextLine();
			for(int i=0;i<man;i++){
				if(search.equals("그만")){
					flag = false;
					break;
				}else if(search.equals(name[i]))
					num = i;
				
			}
			if(num == -1 && flag == true && search != null)
				System.out.print(search + " 이 없습니다.\n");
			else if(flag == true)
				System.out.print(search + "의 번호는 " + tel[num] +"입니다.\n");
			num = -1;
		}
		sc.close();
	}
}
