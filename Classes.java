
import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car cr = new Car();
        cr.run();
        cr.walk();
        sc.close();

    }
}

class Car {

    void run() {
        System.out.println("Car will run ");
    }

    void walk() {
        System.out.println("Car will walk ");
    }
}
