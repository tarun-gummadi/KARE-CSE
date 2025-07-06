
class Calc {

    void addition() {

    }
}

class integer extends Calc {

    int add(int a, int b) {
        return a + b;
    }
}

class doubled extends Calc {

    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {

    public static void main(String[] args) {
        Calc cl = new Calc();
        System.out.println(cl.add(20, 30));
        System.out.println(cl.add(20.12345543, 37.28378));

    }
}
