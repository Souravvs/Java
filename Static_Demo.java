/*
 * Author: Sourav V S
 * Date: 21-07-25
 * Description: Java demo program for static variables.*/
package package_1;

class Student{
	String name;
	static int studentCount = 0;
	
	Student(String name){
		this.name = name;
		studentCount++;
	}
	public void printDetails() {
		System.out.println(name);
		System.out.println(studentCount);
	}
}

public class Static_Demo {
	public static void main(String []args) {
		Student student1 = new Student("Stud1");
		student1.printDetails();
		Student student2 = new Student("Stud2");
		student2.printDetails();
	}
}
