package day3;

public class book {
	String title;
	String author;
	
	void show(){
		System.out.println(title + " " + author);
	}
	public book(){
		this("", "");
		System.out.println("������ ȣ���");
	}
	
	public book(String title){
		this(title,"���ڹ̻�");
	}
	public book(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args){
		book littlePrince = new book("�����", "�������丮");
		book loveStory = new book("������");
		book emptyBook = new book();
		loveStory.show();
	}
}
