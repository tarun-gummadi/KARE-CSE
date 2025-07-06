import java.util.Scanner;

public class MinAndMax {
            public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the rows");
        int row = sc.nextInt();
        System.out.println("enter the size of the column");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the matrix elements");
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
