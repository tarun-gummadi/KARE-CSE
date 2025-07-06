
import java.util.Scanner;

public class Classess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//         Car cr = new Car();
//         cr.run();
//         cr.walk();
//         sc.close();
//     }
// }
// class Car {
//     void run() {
//         System.out.println(" Car will run ");
//     }
//     void walk() {
//         System.out.println("Car will walk ");
//     }
        FourWheeler myCar = new FourWheeler();
        myCar.Toyota();
        myCar.Ford();
        myCar.BMW();
        myCar.Bugati(399);
        sc.close();
    }
}

class FourWheeler {

    void Toyota() {
        System.out.println("Toyota is best for Racing");
    }

    void Ford() {
        System.out.println("Ford is oldest model which beaten Ferrari");
    }

    void BMW() {
        System.out.println("BMW provides the best cars ");
    }

    void Bugati(int a) {
        System.out.println("Bugati can travel " + a + " Kmph");
    }

}
