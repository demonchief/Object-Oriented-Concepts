import java.util.*;
import java.io.*;

class assn6{
    public static void main(String args[]){
        int sum=0;
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al); 

        for(int i:al){
            sum = sum+i;
        }
        System.out.println("sum of all elemets is : " + sum);
        int x = al.remove(1);
        System.out.print("elements after removing index 1 : ");
        for(int i:al){
            System.out.print(i+" ");
        }
        System.out.println();

        int num = al.get(1);
        System.out.println("element at index 1: "+num);

        System.out.println(al);

        al.set(2,600);
        System.out.println(al);

        al.sort(Comparator.naturalOrder());
        System.out.println(al);
    }
}

/*
OUTPUT

[1, 2, 3, 4]
sum of all elemets is : 10
elements after removing index 1 : 1 3 4 
element at index 1: 3
[1, 3, 4]
[1, 3, 600]
[1, 3, 600]
*/
