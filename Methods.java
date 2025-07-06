
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FourWheeler myCar = new FourWheeler();
        myCar.Toyota();
        myCar.Ford();
        myCar.sleep(6);
        // myCar.BMW();
        // myCar.Bugati(399);
        sc.close();
    }
}

class FourWheeler {

    int a;

    public int walk() {
        System.out.println("Yes i can walk");
        return 0;
    }

    public void Toyota() {
        System.out.println("Toyota is the best");
    }

    public int sleep(int b) {
        // System.out.println("Yes i can sleep");
        return b;
    }

    public void Ford() {
        System.out.println("Ford is the best Racing car once upon a time");
    }

}
