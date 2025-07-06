
abstract class Animal {

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal is eating...");
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
        super.eat();
    }
}

public class Super {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
