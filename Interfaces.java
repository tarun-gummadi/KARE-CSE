
import java.util.Scanner;

public class Interfaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        Operations op = new Operations();
        // op.cr = new Operations();
        // Operations sr = new Operations();
        // System.out.println("Enter the Radius and Side : ");
        // float r = sc.nextFloat();
        // double s = sc.nextDouble();
        op.area(2);
        op.perimeter(3);
        op.area(4);
        op.perimeter(5);

    }
}

interface Circle {

    void area();

    void perimeter();
}

interface Square {

    void area();

    void perimeter();
}

class Operations implements Circle, Square {

    void area(float r) {
        System.out.println("Area od circle is : " + (3.14 * r * r));
    }

    void perimeter(float r) {
        System.out.println("Perimeyter of circle is : " + (2 * 3.14 * r));
    }

    void area(double s) {
        System.out.println("Area of the Square is : " + (s * s));
    }

    void perimeter(double s) {
        System.out.println("Perimeter of the Square is : " + (4 * s));
    }
}
