//4. Create a sealed class hierarchy where Animal is a sealed class and Dog and Cat are
//its permitted subclasses

public class SealedClass {

    public static void main(String[] args) {

        One.Animal dog = new Dog();
        One.Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }

    public static final class Dog extends One.Animal {

        @Override
        public void makeSound() {
            System.out.println("SealedClass.Dog barks");
        }
    }

    public static final class Cat extends One.Animal {

        @Override
        public void makeSound() {
            System.out.println("SealedClass.Cat meows");
        }
    }
}