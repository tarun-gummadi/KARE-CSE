import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int a = sc.nextInt();
        if((a%4 == 0 && a%100 !=0) || (a % 400 ==0)){
            System.out.println("The year is leap year");
        }else {
            System.out.println("The year is not leap year");
        }
    }
}
