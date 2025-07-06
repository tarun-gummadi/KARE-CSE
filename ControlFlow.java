import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = s.nextInt();
        System.out.print("Enter b number : ");
        int b = s.nextInt();
        if(a>b){
            System.out.println("a is greater than b ");
        } else if (a==b) {
            System.out.println("a is equal to b ");
        }else{
            System.out.println("a is less than b");
        s.close();
        }

    }
}
