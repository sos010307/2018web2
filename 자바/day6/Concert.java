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
		System.out.print("�¼����� S(1), A(2), B(3)>>");
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
		
		System.out.print("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.\n");
		while(true){
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			num = sc.nextInt();
			switch(num){
				case 1:
					sS.seatSlice();
					for(int i=0;i<10;i++){
						System.out.print(" "+seatline[num-1][i]+" ");
					}
					System.out.print("\n");
					System.out.print("�̸�>>");
					name = sc.next();
					System.out.print("��ȣ>>");
					seatnum = sc.nextInt()-1;
					for(int i=0;i<10;i++){
						if(seatnum == i){
							if(seatline[num-1][i].equals("---"))
								seatline[num-1][i] = name; 
							else if(seatnum > 10 && seatnum <= 0)
								System.out.print("�߸��� �¼���ȣ�Դϴ�.\n");
							else
								System.out.print("�̹� ����� �¼��Դϴ�.\n");
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
					System.out.print("<<��ȸ�� �Ϸ��Ͽ����ϴ�>>\n");
					continue;
				case 3:
					sS.seatSlice();
					for(int i=0;i<10;i++){
						System.out.print(" "+seatline[num-1][i]+" ");
					}
					System.out.print("�̸�>>");
					name = sc.next();
					for(int i=0;i<10;i++){
						if(seatline[num-1][i].equals(name))
							seatline[num-1][i] = "---"; 
					}
					System.out.print("������ ��ҵǾ����ϴ�\n");
					continue;
				case 4:
					break;
				default:
					System.out.print("�߸��� �޴� �����Դϴ�. �ٽ� ������ �ּ���.\n");
					continue;
			}
		break;
		}
	}
}
