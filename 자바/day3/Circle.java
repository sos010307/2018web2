package day3;

public class Circle {
	int radius;
	String name;
	
	public Circle(){ //�Ű����� ���� ������
		radius = 1;name = ""; //�ʵ� �ʱ�ȭ
	}
	public Circle(int r,String n){ //�Ű� ������ ���� ������
		radius = r;name = n; //�Ű� ������ �ʵ� �ʱ�ȭ
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public static void main(String[] agrs){
		Circle pizza = new Circle(10, "�ڹ�����");
		pizza.radius = 10;
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area); //��ü ����, �������� 10����, �̸��� "�ڹ�����"�� �ʱ�ȭ
		
		Circle donut = new Circle(); //��ü ����, �������� 1, �̸��� ""�� �ʱ�ȭ
		donut.name = "�ڹٵ���"; //�̸� ����
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}
