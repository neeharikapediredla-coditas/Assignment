//QUESTION-6
/**
 6.Create a List<String> containing employee names.
 • Use lambda expressions to: -
 o Print all names.
 o Filter names starting with letter ‘A’
 o Sort the names alphabetically
 */

import java.util.*;

public class LambdaDemo {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();

        System.out.println("Enter 4 names:");
        for(int i=0;i<4;i++)
            list.add(sc.next());

        list.forEach(n->System.out.println(n));
        list.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
    }
}