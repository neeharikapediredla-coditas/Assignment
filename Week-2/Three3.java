//QUESTION-3
/**
 3. Create an abstract class Employee with: -
 • An abstract method calculateSalary()
 • A concrete method displayDetails()
 • Create two subclasses: -
 o FullTimeEmployee
 o PartTimeEmployee

 Override calculateSalary() in both classes and demonstrate runtime polymorphism.
 */

import java.util.Scanner;

abstract class Employee {

    String name;

    Employee(String name){
        this.name=name;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {

    double salary;

    FullTimeEmployee(String n,double s){
        super(n);
        salary=s;
    }

    double calculateSalary(){
        return salary;
    }
}

class PartTimeEmployee extends Employee {

    double hours,rate;

    PartTimeEmployee(String n,double h,double r){
        super(n);
        hours=h;
        rate=r;
    }

    double calculateSalary(){
        return hours*rate;
    }
}

public class Three3 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Full Time Employee Name: ");
        String n1=sc.next();

        System.out.print("Enter Salary: ");
        double sal=sc.nextDouble();

        Employee e1=new FullTimeEmployee(n1,sal);

        System.out.print("Enter Part Time Employee Name: ");
        String n2=sc.next();

        System.out.print("Enter Hours: ");
        double h=sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r=sc.nextDouble();

        Employee e2=new PartTimeEmployee(n2,h,r);

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}