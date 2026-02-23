//2. Write a program that demonstrates the usage of the var keyword to declare variables
//with inferred types.

public class Two {

    public static void main(String[] args) {

        var number = 100;
        var message = "Welcome to Java";
        var percentage = 85.5;

        var names = new java.util.ArrayList<String>();
        names.add("Nik");
        names.add("Dip");

        for (var name : names) {
            System.out.println(name);
        }


        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
        System.out.println("Percentage: " + percentage);
    }
}