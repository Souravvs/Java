/*
 * Author: Sourav V S
 * Date: 01-08-25
 * Description: Java program to implement static method.
 */

package p_108;

class Student{
	String name;
	int rollNum;
	static int studentCount = 0;
	
	
	Student(String name, int rollNum){
		this.name = name;
		this.rollNum = rollNum;
		studentCount++;
		
	}
	
	public void studentDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNum);
	}
	
	public static void displayStudentCount() {
		System.out.println("Total no. of students: " + studentCount);
	}
}


public class Static_Var {
	public static void main(String[] args) { 
		Student student1 = new Student("Abhilash", 22);
		student1.studentDetails();
		Student student2 = new Student("Bilal", 11);
		student2.studentDetails();
		Student student3 = new Student("Bhaskaran", 1);
		student3.studentDetails();
		
		Student.displayStudentCount();
		
	}

}
