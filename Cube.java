import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cube upto :  ");
        int a = sc.nextInt();
        for (int i = 1;i<a;i++) {
            int cube = i*i*i;
            
            System.out.println("The cube of " +i+ "is : "+cube);
        }
        sc.close();
    }
}