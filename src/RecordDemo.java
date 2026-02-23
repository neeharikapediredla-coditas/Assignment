//5. Write a record class to represent a Person with fields name and age, and demonstrate
//        its usage.


public class RecordDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Nik", 22);
        Person person2 = new Person("Nik", 22);

        // Accessing record components (no getters needed)
        System.out.println("Name: " + person1.name());
        System.out.println("Age: " + person1.age());

        // Records automatically provide equals(), hashCode(), and toString()
        System.out.println(person1);
        System.out.println("Objects equal: " + person1.equals(person2));
    }

    public static record Person(String name, int age) {

    }
}