
class Vehicle {

    void move() {
        System.out.println("These are the available cars");
    }
}

class Sevenseater extends FourWheeler {

    void Innova() {
        System.out.println("Innova 7 seater");
    }

    void BMW() {
        System.out.println("BMW 7 seater ");
    }
}

class Fiveseater extends FourWheeler {

    void Benz() {
        System.out.println("Benz 5 seater");
    }

    void Audi() {
        System.err.println("Audi 5 seater");
    }
}

class TwoWheeler extends Vehicle {

    void Cycle() {
        System.out.println("Cycle is 2 wheeler");
    }

    void Bike() {
        System.out.println("Bike is 2 wheeler");
    }
}

class FourWheeler extends Vehicle {

    void seven() {
        System.out.println("These are the Sevenseater cars");
    }

    void five() {
        System.out.println("These are the Fiveseater cars");
    }

    void two() {
        System.out.println("These are the Twowheeler vehicles");
    }
}

public class Inheritence2 {

    public static void main(String[] args) {
        FourWheeler fw = new FourWheeler();
        Sevenseater sv = new Sevenseater();
        fw.seven();
        sv.Innova();
        sv.BMW();
        Fiveseater fv = new Fiveseater();
        fw.five();
        fv.Benz();
        fv.Audi();

        TwoWheeler tw = new TwoWheeler();
        fw.two();
        tw.Cycle();
        tw.Bike();

    }
}
