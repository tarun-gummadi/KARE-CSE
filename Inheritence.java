
import java.util.Scanner;

public class Inheritence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        son so = new son();
        so.properties();
        so.properties1();
        so.properties2();

        sc.close();
    }
}

class GrandFather {

    void properties() {
        System.out.println("Belongs to GrandFather");
    }
}

class Father extends GrandFather {

    void properties1() {
        System.out.println("Belongs to Father");
    }
}

class son extends Father {

    void properties2() {
        System.out.println("Belongs to Son");
    }
}
