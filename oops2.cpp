/* 
Problem Statement

Develop an object oriented program in C++ to create a base class Employee and derived classes SalariedEmployee, HourlyEmployee and CommisionEmployee.

The class Employee has data members: string Ename, in EmpiD and has a default constructor and parameterized constructor. It has function display to output data member values; and function earnings().

The class SalariedEmployee has data member: double weeklysalary and has a default constructor and parameterized constructor. The function earnings) displays weekly salary.

The class HourlyEmployee has data members: double wage, double hours and double Hourlysalary; and has a default constructor and parameterized constructor. The function earnings) is defined as if(hours<40) ( Hourlysalary= hours*wage; ] else

{ Hourlysalary=40*wage + ((hours-40)*wage)* 1.5; }

The class CommisionEmployee has data members: double grossSales, double commissionate, double Commisionsalary; and has a default constructor and parameterized constructor. The function earnings)

is defined as Commisionsalary = grossSales * commissionate;

Create objects of derived classes and display their earnings
*/

#include<iostream>
using namespace std;

class employee{
	private:
	string name;
	int id;
	public:
	employee(){
		name = "abc";
		id = 1;
	}
	employee(string a,int b){
		name = a;
		id  = b;
	}
	virtual void accept(){
		cout<<"\nenter name and id: ";
		cin>>name;
		cin>>id;
	}
	virtual void display(){
	cout<<"\nNAME: "<<name<<"\nID: "<<id;
	}
	virtual void earnings()=0;
};

class salariedEmployee:public employee{
	private:
	double weeklySalary;
	public:
	salariedEmployee():employee(){
		weeklySalary = 10000;
	}
	salariedEmployee(string a, int b, double c):employee(a,b){
		weeklySalary = c;

	}
	void accept(){
		cout<<"\nenter salary: ";
		cin>>weeklySalary;
	}
	void display(){
		employee::display();
		cout<<"\nWEEKLY SALARY: "<<weeklySalary;
	}
	void earnings(){
		weeklySalary = weeklySalary;
	}
};

class hourlyEmployee:public employee{
	private:
	double wage;
	double hours;
	double hourlySalary;
	public:
	hourlyEmployee():employee(){
		
		wage = 500;
		hours = 40;
		hourlySalary = 20000;
	}
	
	hourlyEmployee(string a, int b,double x,double y,double z):employee(a,b){
		wage = x;
		hours = y;
		hourlySalary = z;
	}
	
	void accept(){
		employee::accept();
		cout<<"\nenter hours: ";
		cin>>hours;
	}
	
	void earnings(){
		if (hours<40){
			hourlySalary = hours*wage;
		}
		else {
			hourlySalary = (40*wage) + ((hours-40)*wage)*1.5;
		}
	}
	void display(){
		employee::display();
		cout<<"\nHOURLY SALARY: "<<hourlySalary;
	}
};

int main(){
	cout<<"hello world\n";

	salariedEmployee s("xyz",2,20000);
	s.earnings();
	s.display();
	
	employee *emp;
	
	hourlyEmployee h;
	
	emp = &h;
	emp->accept();
	emp->earnings();
	emp->display();

	return 0;
}

/*
OUTPUT
saanvi@her-techplay:~/code/ads_oops$ ./a.out
hello world

NAME: xyz
ID: 2
WEEKLY SALARY: 20000
enter name and id: vidwesh 41

enter hours: 45

NAME: vidwesh
ID: 41
HOURLY SALARY: 23750
*/
