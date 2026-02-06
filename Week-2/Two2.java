// QUESTION-2
/**2. Create a custom runtime exception called InvalidAgeException.
 • Throw this exception if age is less than 18 while creating a User object.
 • Catch the exception and print a meaningful error message.
 • Demonstrate why this exception is treated as a runtime exception.*/
import java.util.*;
class InvalidAgeException extends RuntimeException
{
    InvalidAgeException(String text)
    {
        super(text);
    }
}

class User1
{
    int age;
    User1(int age)
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        this.age=age;
        System.out.println("User created Successfully. Age: "+age);
    }
}
public class Two2
{
 public static void main(String[] args )
 {
     Scanner sc=new Scanner(System.in);
     try
     {
         System.out.println("Enter the age of the person: ");
         int age = sc.nextInt();
         User u = new User1(age);
     }
     catch(InvalidAgeException e)
     {
         System.out.println(e.getMessage());
     }
 }
}
