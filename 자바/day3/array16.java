package day3;

import java.util.Scanner;

public class array16 {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		String my;
		String str[] = {"가위","바위","보"};
		System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.\n");
		
		while(true){
			System.out.print("\n가위 바위 보!>>");
			int n = (int)(Math.random()*3);
			my = sc.nextLine();
			
			if(my.equals("가위")){
				System.out.print("사용자 = "+my+",컴퓨터 = "+str[n]+",");
				if(str[n].equals("가위")){
					System.out.print("비겼습니다");
				}else if(str[n].equals("바위")){
					System.out.print("사용자가 졌습니다");
				}else if(str[n].equals("보")){
					System.out.print("사용자가 이겼습니다");
				}
				continue;
			}else if(my.equals("바위")){
				System.out.print("사용자 = "+my+",컴퓨터 = "+str[n]+",");
				if(str[n].equals("바위")){
					System.out.print("비겼습니다");
				}else if(str[n].equals("보")){
					System.out.print("사용자가 졌습니다");
				}else if(str[n].equals("가위")){
					System.out.print("사용자가 이겼습니다");
				}
				continue;
			}else if(my.equals("보")){
				System.out.print("사용자 = "+my+",컴퓨터 = "+str[n]+",");
				if(str[n].equals("보")){
					System.out.print("비겼습니다");
				}else if(str[n].equals("가위")){
					System.out.print("사용자가 졌습니다");
				}else if(str[n].equals("바위")){
					System.out.print("사용자가 이겼습니다");
				}
				continue;
			}else if(my.equals("그만")){
				System.out.print("게임을 종료합니다....");
				break;
			}else{
				System.out.print("잘못된 입력값입니다. 다시 입력하세요");
				continue;
			}
		}
		sc.close();
	}
}
