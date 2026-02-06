//QUESTION--10
/**10. Create a class Student with fields:-
        • id
• name
• marks
• Store multiple Student objects in an ArrayList and:-
o Sort students by marks using Comparable
o Sort students by name using Comparator
o Print the sorted results*/

import java.util.*;

class Student implements Comparable<Student>{

    int id,marks;
    String name;

    Student(int i,String n,int m){
        id=i; name=n; marks=m;
    }

    public int compareTo(Student s){
        return s.marks-marks;
    }

    public String toString(){
        return id+" "+name+" "+marks;
    }
}

public class StudentDemo {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        ArrayList<Student> list=new ArrayList<>();

        for(int i=0;i<3;i++){
            System.out.print("Id: ");
            int id=sc.nextInt();
            System.out.print("Name: ");
            String n=sc.next();
            System.out.print("Marks: ");
            int m=sc.nextInt();

            list.add(new Student(id,n,m));
        }

        Collections.sort(list);
        System.out.println(list);
    }
}