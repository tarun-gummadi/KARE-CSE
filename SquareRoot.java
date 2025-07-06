import java.util.Scanner;

public class SquareRoot {
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
        if(discriminant>0){
            double sqrtD = (discriminant);
            double root = (-b + discriminant1)/(2 * a);
            double root1 = (-b - discriminant1)/(2 * a);
            System.out.println("Root 1: " + root);
            System.out.println("Root 2: " + root1);
        }else if(discriminant==0){
            double root = -b/(2 * a);
            System.out.println("Root: " + root);
        }else {
            double root = -b / (2 * a);
            System.out.println("Root 1: " + root);
            System.out.println("Root 2: " + root);
        }
     }
}
