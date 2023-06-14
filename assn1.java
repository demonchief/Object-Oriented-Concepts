package assn1;
import java.util.*;
import java.io.*;

public class assn1{

	public static void main(String[] args) throws Exception{
		Student s1 = new Student();
		//s1.getdata();
		s1.result();
		s1.display();
		
		float[] m = new float[]{89,92,94,96,99};
		Student s2 = new Student("vidwesh",45,m);
		s2.result();
		s2.display();
	}

}

class Student{
	String name;
	int rn;
	float marks[];
	float avg;
	char grade;
	
	Student() {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter name: ");
		this.name = scn.next();
		System.out.println("enter rn: ");
		this.rn = scn.nextInt();
		marks = new float[5];
		for(int i=0;i<5;i++) {
			System.out.println("enter marks: ");
			this.marks[i] = scn.nextFloat();
		}
		scn.close();
	}
	
	Student(String a, int b,float c[]){
		this.name = a;
		this.rn = b;
		this.marks = c;
	}
	
	void display() {
		System.out.println("STUDENT DETAILS");
		System.out.println("name: " + this.name);
		System.out.println("rn: " + this.rn);
		for(int i=0;i<5;i++) {
			System.out.println("marks of subject " + i +": " + marks[i]);
		}
		System.out.println("Average: " + avg);
		System.out.println("Grade: " + grade);
	}
	
	void result() {
		avg=0;
		for(int i=0;i<5;i++) {
			avg = avg + marks[i];
		}
		avg = avg/5;
		
		if (avg>=90) {
			grade = 'A';
		}
		else if(avg>=80 && avg<90) {
			grade = 'B';
		}
		else if(avg<80) {
			grade = 'C';
		}
		
	}
}

/*
OUTPUT

saanvi@her-techplay:~/code/java/assn1$ java assn1.java
enter name: 
saanvi
enter rn: 
33
enter marks: 89
enter marks: 99
enter marks: 92
enter marks: 94
enter marks: 93


STUDENT DETAILS
name: saanvi
rn: 33
marks of subject 0: 89.0
marks of subject 1: 99.0
marks of subject 2: 92.0
marks of subject 3: 94.0
marks of subject 4: 93.0
Average: 93.4
Grade: A


STUDENT DETAILS
name: vidwesh
rn: 45
marks of subject 0: 89.0
marks of subject 1: 92.0
marks of subject 2: 94.0
marks of subject 3: 96.0
marks of subject 4: 99.0
Average: 94.0
Grade: A


*/
