import java.io.*;
import java.lang.*;
import java.util.*;

/* 
Problem Statement

Develop an object oriented program in C++ to create a base class Employee and derived classes SalariedEmployee, HourlyEmployee and CommisionEmployee.
*/


public class assn2{
    public static void main(String args[]){
        System.out.println("jello world");


        SalariedEmployee e1 = new SalariedEmployee();
        e1.accept();
        System.out.println("\n");
        e1.earnings();
        e1.display();
        System.out.println("\n\n\n");


        HourlyEmployee e2 = new HourlyEmployee();
        e2.accept();
        System.out.println("\n");
        e2.earnings();
        e2.display();
        System.out.println("\n\n\n");


        CommisionEmployee e3 = new CommisionEmployee();
        e3.accept();
        System.out.println("\n");
        e3.earnings();
        e3.display();
        System.out.println("\n\n\n");
    }
}

class Employee{
    String name;
    int id;
    Employee(){
        name = "abc";
        id = 1;
    }
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    void accept(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = s.nextLine();
        System.out.println("Enter id: ");
        this.id = s.nextInt();
    }

    void display(){
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee id: " + this.id);
    }

}

class SalariedEmployee extends Employee{
    double weeklysalary;
    SalariedEmployee(){
        weeklysalary = 10000;
    }
    SalariedEmployee(String name, int id, double weeklysalary){
        super(name,id);
        this.weeklysalary = weeklysalary;
    }

    void accept(){
        super.accept();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter weekly salary: ");
        this.weeklysalary = s.nextDouble();
    }

    void display(){
        super.display();
        System.out.println("Employee weekly salary: " + weeklysalary);
    }
    void earnings(){
        weeklysalary = weeklysalary;
    }
}

class HourlyEmployee extends Employee{
    double wage;
    double hours;
    double Hourlysalary;
    HourlyEmployee(){
        wage = 500;
        hours = 40;
        Hourlysalary = 20000;
    }
    HourlyEmployee(String name, int id, double wage, double hours, double Hourlysalary){
        super(name,id);
        this.wage = wage;
        this.hours = hours;
        this.Hourlysalary = Hourlysalary;
    }
    
    void accept(){
        super.accept();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter wage and hours: ");
        this.wage = s.nextDouble();
        this.hours = s.nextDouble();
        this.Hourlysalary = this.wage * this.hours;
    }

    void display(){
        super.display();
        System.out.println("Employee hourly salary: " + Hourlysalary);
    }

    void earnings(){
        if(hours<40) {
            this.Hourlysalary= this.hours * this.wage;
        }
        else{
            this.Hourlysalary = 40 * this.wage + ((this.hours - 40)*this.wage)* 1.5;
        }
    }
}

class CommisionEmployee extends Employee{
    double grossSales;
    double commissionate;
    double commisionSalary;

    CommisionEmployee(){
        this.grossSales = 15000;
        this.commissionate = 0.7;
    }

    CommisionEmployee(String name, int id, double grossSales,double commissionate){
        super(name,id);
        this.grossSales = grossSales;
        this.commissionate = commissionate;

    }

    void accept(){
        super.accept();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter gross sales and commissionate: ");
        this.grossSales = s.nextDouble();
        this.commissionate = s.nextDouble();
    }

    void display(){
        super.display();
        System.out.println("Employee commision salary: " + commisionSalary);
    }

    void earnings(){
        this.commisionSalary = this.grossSales * this.commissionate;
    }
}


/*
OUTPUT



Enter name: 
Tanish
Enter id: 
33
Enter weekly salary: 
15000


EMPLOYEE DETAILS
Employee name: Tanish
Employee id: 33
Employee weekly salary: 15000.0


Enter name: 
Om
Enter id: 
52
Enter wage and hours: 
600 50


EMPLOYEE DETAILS
Employee name: Om
Employee id: 52
Employee hourly salary: 33000.0


Enter name: 
Smit
Enter id: 
4 
Enter gross sales and commissionate: 
20000 0.3


EMPLOYEE DETAILS
Employee name: Smit
Employee id: 4
Employee commision salary: 6000.0

*/

