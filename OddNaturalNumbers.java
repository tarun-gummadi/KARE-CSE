import java.util.Scanner;
public class OddNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of odd natural numbers : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==1){
                System.out.println(i);
            sum = sum + i;
            }
        }
        System.out.println("The sum is : " +sum);
    }
}
