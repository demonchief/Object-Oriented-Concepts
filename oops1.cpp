#include<iostream>
#include<string.h>
using namespace std;

class student{
	private:
	int rn;
	string name;
	char dob[20];
	int aadharNo;
	string bloodGroup;
	string address;
	
	public:
	student(){
		name = "saanvi";
		rn = 1;
		strcpy(dob,"12/07/2003");
		address = "pune";
	}
	
	student(int a,string b, char c[20], string d){
		rn = a;
		name = b;
		strcpy(dob,c);
		address = d;
	}
	
	void getData(){
		cout<<"\nenter roll no: ";
		cin>>rn;
		cout<<"\nenter name: ";
		cin>>name;
		cout<<"\nenter dob: ";
		cin>>dob;
		cout<<"\nenter address: ";
		cin>>address;
	}
	
	void displayData(){
		cout<<"\nstudent data: ";
		cout<<"\nroll no: "<<rn;
		cout<<"\nname: "<<name;
		cout<<"\ndob: "<<dob;
		cout<<"\naddress: "<<address;
	}
};



int main(){
	cout<<"hello world";
	student s1;
	//s1.getData();
	s1.displayData();
	cout<<endl;
	
	student s2(41,"vidwesh","15/11/2003","delhi");
	s2.displayData();
	cout<<endl;
	return 0;
}

/*
OUTPUT


saanvi@her-techplay:~/code/cpp$ g++ oops1.cpp
saanvi@her-techplay:~/code/cpp$ ./a.out
hello world
student data: 
roll no: 1
name: saanvi
dob: 12/07/2003
address: pune

student data: 
roll no: 41
name: vidwesh
dob: 15/11/2003
address: delhi

*/
