
import java.util.Scanner;

public class AbstractBicycle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MountainBike mb = new MountainBike();
        mb.gear(2);
        mb.speed(90);
        mb.height(40);
    }

}

abstract class Bicycle {

    abstract void gear();

    abstract void height();
}

class MountainBike extends Bicycle {

    void gear(int a) {
        System.out.println("no of gears : ");
    }

    void speed(int b) {
        System.out.println("Speed of the bicycle :");
    }

    void height(int c) {
        System.out.println("Seat height is : ");
    }
}
