//1. In a program, input the side of a square. You have to output the area of the square

import java.util.Scanner;
public class One1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int a=sc.nextInt();
        int area=(a*a);
        System.out.println("area of square with a side"+a+ "="+area);
    }
}