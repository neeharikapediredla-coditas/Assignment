//QUESTION-7
/**
 7.Create an enum OrderStatus with values: -
 • PLACED - SHIPPED - DELIVERED - CANCELLED
 • Each enum constant should have a message (example: “Order has been
 placed”).
 • Add a method inside the enum to return the message.
 • Use the enum in a class and print order status details.
 */

import java.util.Scanner;

enum OrderStatus{PLACED,SHIPPED,DELIVERED,CANCELLED}

public class OrderDemo {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter status:");
        OrderStatus s=OrderStatus.valueOf(sc.next().toUpperCase());

        System.out.println(s);
    }
}