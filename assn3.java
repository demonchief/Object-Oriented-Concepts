import java.util.Scanner;

public class assn3 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.getData();
		e.earnings();
		e.putData();

	}

}


interface Salary{
	public void earnings();
}


interface Data{
	public void getData();
	public void putData();
}

class Employee implements Salary,Data{
	String name;
	int id;
	int weeklySal;
	
	public void getData() {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Employee name: ");
		name = s.nextLine();
		System.out.println("Enter employee id; ");
		id = s.nextInt();
	}
	
	public void earnings() {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Weekly Salary: ");
		weeklySal = s.nextInt();
		s.close();
	}
	
	public void putData() {
		System.out.println("Employee name is " + name);
		System.out.println("Employee id is " + id);
		System.out.println("Employee Salary is "+ weeklySal);
	}
	

	
}

/*
OUTPUT


Enter Employee name: 
manasi
Enter employee id; 
33
Enter Weekly Salary: 
15000
Employee name is manasi
Employee id is 33
Employee Salary is 15000
*/

