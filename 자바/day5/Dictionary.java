package day5;
import java.util.Scanner;
class Dictionary {
	private static String [] kor = {"사랑","아기","돈","미래","희망"};
	private static String [] eng = {"love","baby","money","future","hope"};
	protected static String kor2Eng(String word){
		String sen = null;
		for(int i=0;i<kor.length;i++){
			if(word.equals(kor[i])){
				sen = word+"은 "+eng[i];
			}else
				sen = word+"은 사전에 없습니다.";
		}
		return sen;
	}
}
class DicApp extends Dictionary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.print("한영 단어 검색 프로그렘입니다.\n");
		while(true){
			System.out.print("한글단어?");
			word = sc.nextLine();
			if(word.equals("그만"))
				break;
			else
				System.out.print(kor2Eng(word));
		}
		
	}
}
