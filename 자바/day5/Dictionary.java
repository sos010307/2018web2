package day5;
import java.util.Scanner;
class Dictionary {
	private static String [] kor = {"���","�Ʊ�","��","�̷�","���"};
	private static String [] eng = {"love","baby","money","future","hope"};
	protected static String kor2Eng(String word){
		String sen = null;
		for(int i=0;i<kor.length;i++){
			if(word.equals(kor[i])){
				sen = word+"�� "+eng[i];
			}else
				sen = word+"�� ������ �����ϴ�.";
		}
		return sen;
	}
}
class DicApp extends Dictionary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.print("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.\n");
		while(true){
			System.out.print("�ѱ۴ܾ�?");
			word = sc.nextLine();
			if(word.equals("�׸�"))
				break;
			else
				System.out.print(kor2Eng(word));
		}
		
	}
}
