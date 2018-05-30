package day3;

public class Circle {
	int radius;
	String name;
	
	public Circle(){ //매개변수 없는 생성자
		radius = 1;name = ""; //필드 초기화
	}
	public Circle(int r,String n){ //매개 변수를 가진 생성자
		radius = r;name = n; //매개 변수로 필드 초기화
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public static void main(String[] agrs){
		Circle pizza = new Circle(10, "자바피자");
		pizza.radius = 10;
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area); //객체 생성, 반지름을 10으로, 이름을 "자바피자"로 초기화
		
		Circle donut = new Circle(); //객체 생성, 반지름을 1, 이름을 ""로 초기화
		donut.name = "자바도넛"; //이름 변경
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
