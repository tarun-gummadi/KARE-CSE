
class Animal {

    void main() {
    }
}

class Dog extends Animal {

    void Janthuvu() {
        System.out.println("Dog is the scariest");
    }
}

class cat extends Animal {

    void Janthuvu() {
        System.out.println("Cat is the cutest");
    }
}

public class Override {

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.Janthuvu();
        cat ct = new cat();
        ct.Janthuvu();
    }
}
