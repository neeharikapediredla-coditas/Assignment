//8. Write a program that demonstrates usage of the sequenced collection to iterate over a
//list in forward and reverse order.

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class Eight {

    public static void main(String[] args) {

        SequencedSet<Integer> rollNumbers = new LinkedHashSet<>();

        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        System.out.println("Forward order iteration:");
        for (Integer rollNumber : rollNumbers) {
            System.out.println(rollNumber);
        }

        System.out.println("\nReverse order iteration:");
        SequencedSet<Integer> reversedSet = rollNumbers.reversed();
        for (Integer rollNumber : reversedSet) {
            System.out.println(rollNumber);
        }
    }
}