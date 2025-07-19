package project1;

import java.util.Scanner;

class Student{
	String name;
	int rollNum;
	String department;
	
	Student(String name, int rollNum, String department){
		this.name = name;
		this.rollNum = rollNum;
		this.department = department;
	}
	public void printStudentInfo() {
		System.out.println("Student Details:");
		System.out.println("Name:\t\t" + name);
		System.out.println("Roll Number:\t" + rollNum);
		System.out.println("Department:\t" + department);
	}
}

public class Parameterized_Const {
	public static void main(String[] args) {
		String name;
		int rollNum;
		String dept;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = sc.nextLine();
		System.out.println("Enter the roll number: ");
		rollNum = sc.nextInt();
   sc.nextLine();
		System.out.println("Enter the department: ");
		dept = sc.nextLine();
		
		Student stud = new Student(name, rollNum, dept);
		stud.printStudentInfo();
	}
}
