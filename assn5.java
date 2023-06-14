import java.io.*;
import java.lang.*;
import java.util.*;

/*

Write a menu-driven program for banking system which accept the personal data for
Customer(cid, cname, amount). Implement the user-defined/standard exceptions, wherever
required to handle the following situations:
1. Account should be created with minimum amount of 1000 rs.
2. For withdrawal of amount, if wth_amt>amount.
3. cid should be in the specific range of 1 to 20.
4. Entered amount should be positive.

*/
class assn4{
    public static void main(String args[]) throws Exception{
        System.out.println("jello world");
        bank b = new bank();
        Scanner s = new Scanner(System.in);
        int ch;
        do{
            System.out.println("choose operation: \n1:Create Account \n2:Withdraw Amount \n3:Deposit Amount \n4:View Balance ");
            System.out.print("your choice: ");
            ch = s.nextInt();
            System.out.println();
            switch(ch){
                case 1:
                    b.login();
                    System.out.println();
                    break;
                case 2:
                    b.withdraw();
                    System.out.println();
                    break;
                case 3:
                    b.deposit();
                    System.out.println();
                    break;
                case 4: 
                    b.view();
                    System.out.println();
                    break;
            }
        }while(ch<5);

        FileOutputStream fos = new FileOutputStream("bankData.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(b);
	oos.close();
	//s2.display();

	bank b1;
	FileInputStream fis = new FileInputStream("bankData.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	b1 = (bank) ois.readObject();
	b1.view();
	ois.close();
    }
}


class InvalidIdException extends Exception{
    void invalidId( int i){
        System.out.println("InvalidIdException: id should be in range 1-20\nentered id is "+ i);
        System.out.println();
    }
}

class LowAmountException extends Exception{
    void lowAmount(double a){
        System.out.println("LowAmountException: opening balance should be atleast 1000\namount entered is " + a);
        System.out.println();
    }
}

class LowBalanceException extends Exception{
    double wam;
    LowBalanceException(double wam){
        this.wam = wam;
    }
    void lowBalance(double am){
        System.out.println("LowBalanceException: the amount you want to withdraw " + wam + " is greater than your balance " + am);
        System.out.println();
    }
}

class NegativeAmountException extends Exception{
    void negativeAmount(){
        System.out.println("NegativeAmountException: enter valid positive amount");
    }
}

class bank implements Serializable{
    String cname;
    int cid;
    double amount;

    void login(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("enter cid: ");
            this.cid = s.nextInt();

            if (cid<1 || cid>20){
                throw new InvalidIdException();
            }

            System.out.println("enter amount to be added while creating an acc: ");
            this.amount = s.nextDouble();

            if(amount<1000){
                throw new LowAmountException();
            }

        }
        catch(InvalidIdException iie){
            iie.invalidId(cid);
        }
        catch(LowAmountException lae){
            lae.lowAmount(amount);
        }
    }


    void withdraw(){
        double wth_amt;
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("enter amount to be withdrawn: ");
            wth_amt = s.nextDouble();

            if (wth_amt > this.amount){
                throw new LowBalanceException(wth_amt);
            }
            else{
                this.amount = this.amount - wth_amt;
                System.out.println("Amount debited\nBalance: "+amount);
                System.out.println();
            }
        }
        catch(LowBalanceException lbe){
            lbe.lowBalance(amount);
        }
    }

    void deposit(){
        double dpt_amt;
        Scanner s  = new Scanner(System.in);
        try{
            System.out.println("enter amount to be deposited: ");
            dpt_amt = s.nextDouble();
            if(dpt_amt<0){
                throw new NegativeAmountException();
            }
            else{
                this.amount = this.amount + dpt_amt;
                System.out.println("Amount deposited");
                System.out.println("Balance: "+ amount);
            }
        }
        catch(NegativeAmountException nae){
            nae.negativeAmount();
        }
    }

    void view(){
        System.out.println("Details:");
        System.out.println("Customer ID: "+ cid);
        System.out.println("Balance: " + amount);
    }

}

/*
OUTPUT

choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 1

enter cid: 
23
InvalidIdException: id should be in range 1-20
entered id is 23


choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 1

enter cid: 
2
enter amount to be added while creating an acc: 
500
LowAmountException: opening balance should be atleast 1000
amount entered is 500.0


choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 1

enter cid: 
2
enter amount to be added while creating an acc: 
1500

choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 4

Details:
Customer ID: 2
Balance: 1500.0

choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 2

enter amount to be withdrawn: 
500
Amount debited
Balance: 1000.0


choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 3

enter amount to be deposited: 
400
Amount deposited
Balance: 1400.0

choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 4

Details:
Customer ID: 2
Balance: 1400.0

choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 2

enter amount to be withdrawn: 
1500
LowBalanceException: the amount you want to withdraw 1500.0 is greater than your balance 1400.0


choose operation: 
1:Create Account 
2:Withdraw Amount 
3:Deposit Amount 
4:View Balance 
your choice: 5
*/
