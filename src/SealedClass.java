//4. Create a sealed class hierarchy where Animal is a sealed class and Dog and Cat are
//its permitted subclasses

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        ((Dog) dog).bark();

        System.out.println();

        cat.eat();
        ((Cat) cat).meow();
    }
}
sealed class Animal permits Dog, Cat {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

final class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

final class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}
