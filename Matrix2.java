import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the M : ");
        int m = sc.nextInt();
        for(int i= 1;i<=m;i++){
            for(int j = i;j<=m;j++){
                System.out.print(" ");
            }
            for(int j = i;j<=m;j++)
                System.out.println("*");

            }
            System.out.println(" ");
    }

}

