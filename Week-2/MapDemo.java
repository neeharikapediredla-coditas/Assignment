//QUESTION-9
/**
 9.Write a program to store employee ID and name using:-
 HashMap - LinkedHashMap - TreeMap
 Insert at least 5 entries in each map and print them.
 Observe and explain the ordering behavior of each map.
  */

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            System.out.print("Enter name: ");
            String n = sc.next();
            map.put(id, n);
        }

        System.out.println(map);
    }
}