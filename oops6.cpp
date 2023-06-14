#include<iostream>
#include<list>
#include<stack>
#include<vector>
#include<deque>
using namespace std;

class stack1{
	vector<int> v;
	vector<int>::iterator itr;
	public:
	void display(){
		itr = v.end();
		itr--;
		
		while(itr != v.begin()){
			
			cout<<"\nelement: "<<*itr;
			itr--;
		}
		cout<<"\nelement: "<<*itr<<endl;
	}
	void push(){
		
		int num;
		cout<<"\nenter the element to be added: ";
		cin>>num;
		v.push_back(num);
	}
	
	
	void pop(){
		int num;
		itr = v.end();
		itr--;
		num = *itr;
		v.pop_back();
		cout<<"\nthe element deleted is: "<<num;
	}
};

class queue1{
	deque<int> dq;
	deque<int>::iterator itr;
	public:
	void display(){
		itr = dq.begin();		
		while(itr != dq.end()){
			
			cout<<"element: "<<*itr;
			itr++;
		}
	}
	void insert(){
		
		int num;
		cout<<"\nenter the element to be added: ";
		cin>>num;
		dq.push_back(num);
	}
	
	
	void del(){
		int num;
		itr = dq.begin();
		num = *itr;
		dq.pop_front();
		cout<<"\nthe element deleted is: "<<num;
	}
	
};

int main(){
	cout<<"jello world\n";
	
	stack1 s;
	int ch;
	do{
		cout<<"\nchoose operation for stack:\n1:push\t2:pop\t3:display\nchoice: ";
		cin>>ch;
		switch(ch){
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
		}
	}while(ch<4);
	
	queue1 q;
	do{
		cout<<"\nchoose operation for queue:\n1:insert\t2:delete\t3:display\nchoice: ";
		cin>>ch;
		switch(ch){
			case 1:
				q.insert();
				break;
			case 2:
				q.del();
				break;
			case 3:
				q.display();
				break;
		}
	}while(ch<4);
	
	cout<<endl;
	return 0;
}

/*
OUTPUT

saanvi@her-techplay:~/code/cpp$ g++ oops6_vector.cpp
saanvi@her-techplay:~/code/cpp$ ./a.out
jello world

choose operation for stack:
1:push	2:pop	3:display
choice: 1

enter the element to be added: 23

choose operation for stack:
1:push	2:pop	3:display
choice: 1

enter the element to be added: 56

choose operation for stack:
1:push	2:pop	3:display
choice: 1

enter the element to be added: 78

choose operation for stack:
1:push	2:pop	3:display
choice: 3

element: 78
element: 56
element: 23

choose operation for stack:
1:push	2:pop	3:display
choice: 2

the element deleted is: 78
choose operation for stack:
1:push	2:pop	3:display
choice: 3

element: 56
element: 23

choose operation for stack:
1:push	2:pop	3:display
choice: 4
------------------------------------------------------
choose operation for queue:
1:insert	2:delete	3:display
choice: 1

enter the element to be added: 55

choose operation for queue:
1:insert	2:delete	3:display
choice: 1

enter the element to be added: 88

choose operation for queue:
1:insert	2:delete	3:display
choice: 1

enter the element to be added: 22

choose operation for queue:
1:insert	2:delete	3:display
choice: 3

element: 55 element: 88 element: 22

choose operation for queue:
1:insert	2:delete	3:display
choice: 2

the element deleted is: 55
choose operation for queue:
1:insert	2:delete	3:display
choice: 3

element: 88
element: 22
choose operation for queue:
1:insert	2:delete	3:display
choice: 4



*/
