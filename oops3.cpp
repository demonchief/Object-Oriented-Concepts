#include<iostream>
using namespace std;

class complex{
	private:
	float real;
	float img;
	public:
	complex(){
		real = 0;
		img = 0;
	}
	complex(int r,int i){
		real = r;
		img = i;
	}
	
	void accept(){
		cout<<"\nenter real part: ";
		cin>>real;
		cout<<"\nenter imaginary part: ";
		cin>>img;
	}
	
	void display(){
		cout<<"complex number is: "<<real<<" + "<<img<<"i"<<endl;
	}
	
	complex operator + (complex num){
		complex c;
		c.real = real + num.real;
		c.img = img + num.img;
		return c;
	}
	
	complex operator - (complex num){
		complex c;
		c.real = real - num.real;
		c.img = img - num.img;
		return c;
	}
	complex operator * (complex num){
		complex c;
		c.real = ((real * num.real) + ((img * num.img)*-1));
		c.img = ((real * num.img) + (img * num.real));
		return c;
	}
	
	complex operator / (complex num){
		complex c;
		c.real = ((real * num.real) + (img * num.img)) / (( num.real * num.real ) + ( num.img * num.img ));
		c.img = ((real * num.img * -1) + (img * num.real)) / (( num.real * num.real ) + ( num.img * num.img ));
		return c;
	}
	
	friend ostream& operator <<(ostream &out,complex &num){
	        out<<num.real<<" + i"<<num.img;
	        return out;
	}
	
	friend istream& operator >>(istream &in,complex &num){
	        in>>num.real>>num.img;
	        return in;
	}
	
};

int main(){
	cout<<"hello world\n";
	complex c1,c2;
	complex c3,c4,c5,c6;
	int ch;
	
        do{
	        cout<<"\nenter operation: \n1:add	2:subtract	3:multiply	4:divide \nchoice: ";
	        cin>>ch;
	        switch(ch){
		        case 1:
		        cin>>c1;
		        cin>>c2;
		        c3 = c1 + c2;
		        cout<<"\naddition is: ";
		        cout<<c3;
		        break;
		        
		        case 2:
		        cin>>c1;
		        cin>>c2;
		        c4 = c1 - c2;
		        cout<<"\nsubtraction is: ";
		        cout<<c4;
		        break;
		        
		        case 3:
		        cin>>c1;
		        cin>>c2;
		        c5 = c1*c2;
		        cout<<"\nmultiplication is: ";
		        cout<<c5;
		        break;
		        
		        case 4:
		        cin>>c1;
		        cin>>c2;
		        c6 = c1/c2;
		        cout<<"\ndivision is: ";
		        cout<<c6;
		        break;
	        }
        }while(ch<5);
        
        
        
        return 0;
}

/*

OUTPUT

saanvi@her-techplay:~/code/cpp$ g++ oops3.cpp
saanvi@her-techplay:~/code/cpp$ ./a.out
hello world

enter operation: 
1:add	2:subtract	3:multiply	4:divide 
choice: 1
5 2
4 -1

addition is: 9 + i1
enter operation: 
1:add	2:subtract	3:multiply	4:divide 
choice: 2
5 2
4 -1

subtraction is: 1 + i3
enter operation: 
1:add	2:subtract	3:multiply	4:divide 
choice: 3
5 2
4 -1

multiplication is: 22 + i3
enter operation: 
1:add	2:subtract	3:multiply	4:divide 
choice: 4
5 2
4 -1

division is: 1.05882 + i0.764706
enter operation: 
1:add	2:subtract	3:multiply	4:divide 
choice: 5


*/
