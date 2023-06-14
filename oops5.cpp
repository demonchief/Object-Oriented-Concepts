/*

Develop an object oriented program in C++ to create a class Hotel for hotel booking system.

The class Hotel has data members: string cust_name,int cust_id,int income, string city,and string room _type and ahs a default constructor.It has function accept () and display() to output data member values.

The class Hotel has member functions as :getage(),getincome(),getcity() and getrrom_type().

Throw four exceptions as :

   1 ﻿﻿If the age is not between 18 and 55.
   2 ﻿﻿If income is not between 50000 and 100000.
   3 ﻿﻿If city is not Pune or Mumbai
   4 ﻿﻿﻿If room_type is not delux or super delux

Use exception handling to check if above conditions are satisfied (display all customer information)else print error message.



*/

#include<iostream>
#include<fstream>
#include<string>
#include<cstring>


using namespace std;

class hotel{
	private:
	char cust_name[10];
	int cust_id;
	int cust_age;
	int income;
	char city[10]; 
	char room_type[10];
	int d;
	
	public:
	hotel(){
		cust_id = 0;
		income = 0;
		d =0;
	}
	void accept();
	void display();
	void getage();
	void getincome();
	void getcity();
	void getroomtype();	
};

void hotel::accept(){
    d=0;
	cout<<"\nenter name: ";
	cin>>cust_name;
	cout<<"\nenter id: ";
	cin>>cust_id;
	getage();
	getincome();
	getcity();
	getroomtype();
}

void hotel::display(){
	if (d==4){
		cout<<"\n\nCustomer data is correct with d = "<<d<<"\n";
		cout<<"\ncustomer name: "<<cust_name;
		cout<<"\ncustomer id: "<<cust_id;
		cout<<"\ncustomer age: "<<cust_age;
		cout<<"\ncustomer income: "<<income;
		cout<<"\ncity: "<<city;
		cout<<"\nroom type: "<<room_type<<endl;
	}
	else cout<<"\nCustomer data is not correct with d = "<<d<<"\n";
}

void hotel::getage(){
	try{
		cout<<"\nenter age: ";
		cin>>cust_age;
		if(cust_age<18 || cust_age >55){
			throw(cust_age);
		}
		else d++;
	}
	catch(int x){
		cout<<"\nValueError: age should be between 18-55\n";
	}
	
}

void hotel::getincome(){
	try{
		cout<<"\nenter income: ";
		cin>>income;
		if (income <50000 or income>100000){
			throw(1.1);
		}
		else d++;
	}
	catch(double y){
		cout<<"\nValueError: income should be between 50000 - 100000\n";
	}
}

void hotel::getcity(){
	try{
		cout<<"\nenter city: ";
		cin>>city;
		char res[] = "pune";
		char res1[] = "mumbai";
		if ( strcmp(city,res) == 0 || strcmp(city,res1) == 0){
			d++;
		}
		else throw(city);
	}
	catch(char *z){
		cout<<"\nValueError: city should be pune or mumbai\n";
	}
}


void hotel::getroomtype(){
	try{
		cout<<"\nenter room type: ";
		cin>>room_type;
		char res[] = "deluxe";
		char res1[] = "superdeluxe";
		if ( strcmp(room_type,res) ==0   || strcmp(room_type,res1) ==0){
			d++;
		}
		else throw(room_type);
	}
	catch(char *a){
		cout<<"\nValueError: room type should be deluxe or superdeluxe\n";
	}
}

int main(){
	cout<<"jello world\n";
	hotel h1;
    char ch;
	
    do{
        h1.accept();
        h1.display();
        cout<<"\ndo you want to book another hotel room? y:yes \nchoice: ";
        cin>>ch;
    }while(ch=='y');

	
	
	return 0;
}


/* OUTPUT



enter name: Tanish

enter id: 1

enter age: 16

ValueError: age should be between 18-55

enter income: 25000

ValueError: income should be between 50000 - 100000

enter city: nashik

ValueError: city should be pune or mumbai

enter room type: suite

ValueError: room type should be deluxe or superdeluxe

Customer data is not correct with d = 0

do you want to book another hotel room? y:yes 
choice: y

enter name: sujal 

enter id: 2

enter age: 19

enter income: 60000

enter city: pune

enter room type: deluxe


Customer data is correct with d = 4

customer name: sujal
customer id: 2
customer age: 19
customer income: 60000
city: pune
room type: deluxe

do you want to book another hotel room? y:yes 
choice: y

enter name: sana

enter id: 3

enter age: 20

enter income: 30000

ValueError: income should be between 50000 - 100000

enter city: mumbai

enter room type: deluxe

Customer data is not correct with d = 1

do you want to book another hotel room? y:yes 
choice: n

*/
