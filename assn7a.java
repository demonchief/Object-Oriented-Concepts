import java.io.*;
import java.util.*;

class oops7a{
    public static void main(String args[]){
        MyThread t = new MyThread();
        MyThreadToo t2 = new MyThreadToo();
        t.start();
        t2.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread one created");
        }
    }
}

class MyThreadToo extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread two created");
        }
    }
}
/*
OUTPUT


Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Thread one created
Main Thread
Main Thread
Main Thread
Thread two created
Thread two created
Thread two created
Thread two created
Thread two created
Main Thread
Main Thread
Main Thread
Main Thread
Thread two created
Thread two created
Thread two created
Thread two created
Thread two created
Main Thread
Main Thread
Main Thread

*/
