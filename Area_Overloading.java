/*
 * Author: Sourav V S
 * Date: 21-07-25
 * Description: Java program to create a class named "AreaCalculator" that contains overloading methods named "area".
 */

class AreaCalculator{
	public void area(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle: " + area);
	}
	public void area(double length, double width) {
		double area = length * width;
		System.out.println("Area of Rectangle: " + area);
	}
	public void area(float base, float height) {
		float area = 0.5f * base * height;
		System.out.println("Area of Triangle: " + area);
	}
	public void area(int side) {
		int area = side * side;
		System.out.println("Area of Square: " + area);
	}
}
public class Area_Overloading {
	public static void main(String[] args) {
	AreaCalculator arcalc = new AreaCalculator();
	arcalc.area(2.143);
	arcalc.area(3.013, 2.101);
	arcalc.area(4.12, 3.01);
	arcalc.area(5);
	
	}
}
