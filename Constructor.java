
import java.util.Scanner;

class fourWheeler {

    void fourWheeler() {
        System.out.println("This the is default Constructor ");
    }

    void fourWheeler(int a) {
        System.out.println("This is the parametarized  constructor  " + a);
    }
}

public class Constructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fourWheeler fw = new fourWheeler();
        fw.fourWheeler();
        fw.fourWheeler(6);
    }
}
