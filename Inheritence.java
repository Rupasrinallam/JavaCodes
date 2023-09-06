
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}


class Dog extends Animal {
    Dog(String name) {
        super(name); // Call the superclass constructor
    }


    void bark() {
        System.out.println(name + " is barking.");
    }
}


class Cat extends Animal {
    Cat(String name) {
        super(name); // Call the superclass constructor
    }


    void purr() {
        System.out.println(name + " is purring.");
    }
}

public class Inheritence {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");


        dog.eat();
        cat.sleep();


        dog.bark();
        cat.purr();
    }
}


