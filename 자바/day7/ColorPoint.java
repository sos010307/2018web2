package day7;
class Point {
	String color,XY;
	public Point(){
		color = "BLACK";
		XY = "(0,0)";
	}
	public void setXY(int i,int j){
		XY = "("+i+","+j+")"+"의 점";
	}
	public void setColor(String color){
		this.color = color+"색의 ";
	}
	public String toString(){
		return color+XY;
	}
}
public class ColorPoint extends Point{
	public ColorPoint(int x,int y){
		
	}
	public static void main(String[] args){
		ColorPoint zeroPoint = new ColorPoint(0, 0);
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5,5);
		cp.setColor("Red");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
