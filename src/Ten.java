//10. Write a program that demonstrates the use of a sequenced map to iterate over the
//entries in both insertion and reverse order.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class Ten {

    public static void main(String[] args) {

        // LinkedHashMap maintains insertion order
        SequencedMap<Integer, String> studentMap = new LinkedHashMap<>();

        studentMap.put(101, "Nik");
        studentMap.put(102, "Ram");
        studentMap.put(103, "Anu");

        System.out.println("Iteration in insertion order:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nIteration in reverse order:");
        SequencedMap<Integer, String> reversedMap = studentMap.reversed();
        for (Map.Entry<Integer, String> entry : reversedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}