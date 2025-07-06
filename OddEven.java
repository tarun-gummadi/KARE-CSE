import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of number : ");
        int a = sc.nextInt();
        int odd = 0;
        int even = 0;
        for(int i= 1;i<=a;i++){
            System.out.print("Enter the number : ");
            int n=sc.nextInt();
            if(n%2==1){
                odd = odd+1;
            }else{
                even = even+1;
            }
        }
        System.out.println("The odd numbers are : " +odd);
        System.out.println("The even numbers are  :" +even);
    }
}
