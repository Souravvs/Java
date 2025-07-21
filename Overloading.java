class Calculator{
	
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("Two Integer Sum:\t" + sum);
	}
	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Three Integer Sum:\t" + sum);
	}
	public void add(double a, double b) {
		double sum = a + b;
		System.out.println("Two Double Sum:\t" + sum);
	}
	public void add(String a, int b) {
		String sum =  a + "\t" +  b;
		System.out.println("String Concatenate:\t" + sum);
	}
}
public class Overloading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 3);
		calc.add(2, 3, 1);
		calc.add(2.102, 3.001);
		calc.add("Number", 10);
	}
}
