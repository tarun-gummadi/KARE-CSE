import  java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the M : ");
        int m = sc.nextInt();
        for(int i= 1;i<=m;i++){
            for(int j = 1;j<=m;j++){
                if(i>=j){
                    System.out.print("*");
                }else{
                    System.out.println("");
                }
            }
        }

    }
}
