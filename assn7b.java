import java.io.*;
import java.util.*;

class oops7b{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        Thread t11 = new Thread(t1);
        t11.start();

        MyThreadToo t2 = new MyThreadToo();
        Thread t22 = new Thread(t2);
        t22.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}

class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread one created");
        }
    }
}

class MyThreadToo implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread two created");
        }
    }
}

/*
OUTPUT

Thread one created
Thread two created
Thread two created
Thread two created
Thread two created
Thread two created
Thread two created
Thread two created
Thread two created
Thread two created
Thread two created
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created

*/

