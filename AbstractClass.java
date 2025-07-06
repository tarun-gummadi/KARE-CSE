
import java.util.Scanner;

public class AbstractClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Son so = new Son();
        so.Fson();
        so.Family();
        GrandSon gs = new GrandSon();
        gs.Gson();
        gs.Family();
        sc.close();
    }
}

abstract class Father {

    abstract void Family();
}

class Son extends Father {

    void Fson() {
        System.out.println("Fson was the first born son in the family");
    }

    void Family() {
        System.out.println("In Family Fson was the first born son");
    }
}

class GrandSon extends Father {

    void Gson() {
        System.out.println("Gson was the last born in son the family");
    }

    void Family() {
        System.out.println("In Family Gson was the last born son");
    }
}
