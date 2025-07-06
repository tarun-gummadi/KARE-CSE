import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num2 : ");
        int b = sc.nextInt();
        System.out.print("Enter num3 : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("num1 is greater and num1 is : " + a);
        }else if (b>a && b>c){
            System.out.println("num2 is greater and num2 is : " + b);
        }else{
            System.out.println("num3 is greater and num3 is : " + c);
        sc.close();
        }
    }
}