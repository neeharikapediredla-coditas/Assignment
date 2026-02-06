//QUESTION-5
/**
 5. Write a program to prove that Java follows pass by value: -
 • Pass a primitive variable to a method and modify it.
 • Pass an object to a method and modify its internal state.
 • Print values before and after method calls.
 */

import java.util.Scanner;

public class PassByValueDemo {

    int data;

    static void change(int x){
        x=100;
    }

    static void changeObj(PassByValueDemo d){
        d.data=200;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int a=sc.nextInt();

        change(a);
        System.out.println("Primitive: "+a);

        PassByValueDemo obj=new PassByValueDemo();

        System.out.print("Enter object value: ");
        obj.data=sc.nextInt();

        changeObj(obj);
        System.out.println("Object: "+obj.data);
    }
}