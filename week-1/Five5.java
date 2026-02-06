import java.util.*;
public class Five5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice of regime number\n 1.new regime\n 2.old regime: ");
        String regime=sc.nextLine();
        double tax=0.0;
        switch(regime)
        {
            case "new":
                System.out.println( "1.new regime");
                break;
            case "old":
                System.out.println( "2.old regime");
                break;
            default:
                System.out.println("invalid choice!");
        }
        System.out.print("enter the salary:");
        double salary= sc.nextDouble();
        while(regime=="new")
        {
            if(salary<=250000)
                System.out.println("nil");
            if(salary>250000 && salary<500000)
                tax=(5/100)*salary;
            if(salary>=500000 && salary<750000)
                tax=(10/100)*salary;
            if(salary>=750000 && salary<1000000)
                tax=(15/100)*salary;
            if(salary>=1000000 && salary<1250000)
                tax=(20/100)*salary;
            if(salary>=1250000 && salary<1500000)
                tax=(25/100)*salary;
            if(salary>=1500000)
                tax=(30/100)*salary;
        }
        while(regime=="old")
        {
            if(salary<=250000)
                System.out.println("nil");
            if(salary>250000 && salary<500000)
                tax=(5/100)*salary;
            if(salary>=500000 && salary<1000000)
                tax=(20/100)*salary;
            if(salary>=1000000)
                tax=(30/100)*salary;
        }
        System.out.println("tax for "+salary+"="+tax);
    }
}