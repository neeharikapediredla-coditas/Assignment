//QUESTION-1
/**1. Write a Java program that:-
        • Takes two integers from the user.
        • Performs division of the first number by the second.
• Handles the following exceptions: -
o ArithmeticException (division by zero)
o InputMismatchException (non-integer input) -
o Uses multiple catch blocks and a finally block to print: “Program execution
completed”.*/
import java.util.*;
public class One1
{
public static void main(String[] args)
{
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int result=num1/num2;
        System.out.println("The Result of num1/num2= "+result);
    }
    catch(ArithmeticException e)
    {
        System.out.println("The denominator cannot be a 0");
    }
    catch(InputMismatchException e)
    {
        System.out.println("Please enter valid numbers: ");
    }
    finally
    {
        System.out.println("Program execution completed");
    }
}
}
