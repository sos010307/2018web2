package day3;

public class book {
	String title;
	String author;
	
	void show(){
		System.out.println(title + " " + author);
	}
	public book(){
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public book(String title){
		this(title,"작자미상");
	}
	public book(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args){
		book littlePrince = new book("어린왕자", "생택쥐페리");
		book loveStory = new book("춘향전");
		book emptyBook = new book();
		loveStory.show();
	}
}
