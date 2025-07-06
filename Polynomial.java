import java.util.Scanner;
public class Polynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double discriminant = ((b*b)-4*a*c);
        double discriminant1 = Math.pow(discriminant,0.5);

        if (discriminant > 0) {
            double sqrtD = (discriminant);
            double root1 = (-b + discriminant1)/(2 * a);
            double root2 = (-b - discriminant1)/(2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root: " + root);
        }
        else {
            double real = -b / (2 * a);
            double imag = (-discriminant1)/(2*a);
            System.out.println("Roots are complex and imaginary.");
            System.out.println("Root 1: " + real + " + " + imag + "i");
            System.out.println("Root 2: " + real + " - " + imag + "i");
        }

        sc.close();
    }
}

