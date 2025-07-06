import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float C = sc.nextFloat();
        float F = (C * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " +F);
    }
}
