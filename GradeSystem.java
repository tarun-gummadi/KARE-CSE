import java.util.Scanner;

public class GradeSystem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int a = sc.nextInt();

        if(a>=90){
            System.out.print("Grade A");
        }else if ( a>=80 && a<90){
            System.out.print("Grade B");
        }else if (a>=70 && a<80) {
            System.out.print("Grade C");
        }else if(a>=60 && a<70){
            System.out.print("Grade D");
        }else {
            System.out.print("Failed");
        }
    }
}
