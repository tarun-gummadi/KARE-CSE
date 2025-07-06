import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of rows : ");
        int a = sc.nextInt();
        System.out.println("Enter the no.of columns : ");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter the Matrix value : ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(" " +arr[i][j]);
            }
            System.out.println();
        }
    }
}

