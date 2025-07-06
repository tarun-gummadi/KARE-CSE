import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Enter the case : ");
        int d = sc.nextInt();
        switch (d) {
            case 1:
                System.out.println("Result is : " +(a+b+c));
                break;
            case 2:
                System.out.println("Result is : " +((a+b)-c));
                break;
            case 3:
                System.out.println("Result is : " +((a+b)*c));
                break;
            default:
                System.out.println("Doesn't exist");
        }
    }
}
