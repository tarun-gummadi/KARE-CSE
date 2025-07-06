// import java.util.Scanner;

// public class OperationNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a : ");
//         double a = sc.nextDouble();
//         System.out.println("Enter b : ");
//         double b = sc.nextDouble();
//         Addition ad = new Addition();
//         ad.addition();
//         Substraction sb = new Substraction();
//         sb.addition();
//         Multiplication ml = new Multiplication();
//         ml.addition();
//         Division dv = new Division();
//         dv.addition();
//     }
// }
// abstract class Complex{
//     abstract void addition();
//     // abstract void substraction();
//     // abstract void multiplication();
//     // abstract void division();
// }
// class Addition extends Complex{
//     void addition(double a , double b){
//         System.out.println("Addition is : "+(a+b));
//     }
// }
// class Substraction extends Complex{
//     void addition(double a, double b){
//         System.out.println("Substraction is : "+(a-b));
//     }
// }
// class Multiplication extends Complex{
//     void addition(double a , double b){
//         System.out.println("Multiplication is : "+(a*b));
//     }
// }
// class Division extends Complex{
//     void addition(double a , double b){
//         System.out.println("Division is : "+(a/b));
//     }
// }
import java.util.Scanner;

class ComplexNumber {

    double real;
    double imag;

    ComplexNumber(double r, double i) {
        real = r;
        imag = i;
    }

    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(real + c.real, imag + c.imag);
    }

    ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(real - c.real, imag - c.imag);
    }

    ComplexNumber multiply(ComplexNumber c) {
        double r = real * c.real - imag * c.imag;
        double i = real * c.imag + imag * c.real;
        return new ComplexNumber(r, i);
    }

    ComplexNumber divide(ComplexNumber c) {
        double denominator = c.real * c.real + c.imag * c.imag;
        if (denominator == 0) {
            return null;
        }
        double r = (real * c.real + imag * c.imag) / denominator;
        double i = (imag * c.real - real * c.imag) / denominator;
        return new ComplexNumber(r, i);
    }

    void print(String label) {
        System.out.printf("%s: %.2f + %.2fi\n", label, real, imag);
    }
}

public class OperationNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.print("Enter real and imaginary part of second complex number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);

        ComplexNumber result;

        result = c1.add(c2);
        result.print("Addition");

        result = c1.subtract(c2);
        result.print("Subtraction");

        result = c1.multiply(c2);
        result.print("Multiplication");

        result = c1.divide(c2);
        if (result != null) {
            result.print("Division");
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        sc.close();
    }
}
