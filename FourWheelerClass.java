
import java.util.Scanner;

public class FourWheelerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
