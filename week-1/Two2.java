//In a program, input 3 numbers : compute the average of three numbers

import java.util.Scanner;
public class Two2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("Enter the third number: ");
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("average of 3 numbers "+a+"," +b+","+c+ "="+avg);
    }
}