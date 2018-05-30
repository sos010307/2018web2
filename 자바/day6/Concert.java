package day6;
import java.util.Scanner;

class Member{
	static Scanner sc = new Scanner(System.in);
	static String getseat[] = {"S","A","B"}; 
	static String seatline[][] = new String[3][10];
	static int num,seatnum;
	static String name;
	public void Reservation(){
		
	}
	public void seatSlice(){
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		num = sc.nextInt();
		System.out.print(getseat[num-1]+">>");
	}
}

public class Concert extends Member{
	public static void main(String[] args){
		Member sS = new Concert();
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				seatline[i][j] = "---";
			}
		}		
		
		System.out.print("명품콘서트홀 예약 시스템입니다.\n");
		while(true){
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			num = sc.nextInt();
			switch(num){
				case 1:
					sS.seatSlice();
					for(int i=0;i<10;i++){
						System.out.print(" "+seatline[num-1][i]+" ");
					}
					System.out.print("\n");
					System.out.print("이름>>");
					name = sc.next();
					System.out.print("번호>>");
					seatnum = sc.nextInt()-1;
					for(int i=0;i<10;i++){
						if(seatnum == i){
							if(seatline[num-1][i].equals("---"))
								seatline[num-1][i] = name; 
							else if(seatnum > 10 && seatnum <= 0)
								System.out.print("잘못된 좌석번호입니다.\n");
							else
								System.out.print("이미 예약된 좌석입니다.\n");
						}
					}
					continue;
				case 2:
					for(int i=0;i<3;i++){
						System.out.print(getseat[i]+" >>");
						for(int j=0;j<10;j++){
							System.out.print(" "+seatline[i][j]+" ");
						}
						System.out.print("\n");
					}
					System.out.print("<<조회를 완료하였습니다>>\n");
					continue;
				case 3:
					sS.seatSlice();
					for(int i=0;i<10;i++){
						System.out.print(" "+seatline[num-1][i]+" ");
					}
					System.out.print("이름>>");
					name = sc.next();
					for(int i=0;i<10;i++){
						if(seatline[num-1][i].equals(name))
							seatline[num-1][i] = "---"; 
					}
					System.out.print("예약이 취소되었습니다\n");
					continue;
				case 4:
					break;
				default:
					System.out.print("잘못된 메뉴 선택입니다. 다시 선택해 주세요.\n");
					continue;
			}
		break;
		}
	}
}
