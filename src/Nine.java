//9. Create a sequenced set and demonstrate iterating over the set in forward and reverse
//order.

import java.util.ArrayList;
import java.util.SequencedCollection;

public class Nine {

    public static void main(String[] args) {

        SequencedCollection<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C++");
        subjects.add("Go");

        System.out.println("Forward order iteration:");
        for (String subject : subjects) {
            System.out.println(subject);
        }

        System.out.println("\nReverse order iteration:");
        SequencedCollection<String> reversedSubjects = subjects.reversed();
        for (String subject : reversedSubjects) {
            System.out.println(subject);
        }
    }
}