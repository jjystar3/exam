package main;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));
		
		for(Student stu : list) {
			System.out.println(stu.toString());			
		}

	}

}

class Student {
	int studentID;
	String studentName;

	public Student(int num, String name) {
		super();
		this.studentID = num;
		this.studentName = name;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}

}