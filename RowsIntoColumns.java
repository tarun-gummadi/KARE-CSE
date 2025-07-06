import java.util.Scanner;

public class RowsIntoColumns {
    // public static void main(String[] args) {
    //     int[][] arr = {
    //         {1, 2, 3},
    //         {4, 5, 6} };
    //     int r = arr.length;
    //     int c = arr[0].length;
    //     int[][] arr1 = new int[c][r];
    //     for (int i = 0; i < r; i++) {
    //         for (int j = 0; j < c; j++) {
    //             arr1[j][i] = arr[i][j];
    //         }
    //     }
    //     System.out.println("Original Matrix:");
    //     printMatrix(arr);

    //     System.out.println("Transposed Matrix:");
    //     printMatrix(arr1);
    // }
    // public static void printMatrix(int[][] matrix) {
    //     for (int[] row : matrix) {
    //         for (int val : row) {
    //             System.out.print(val + " ");
    //         }
    //         System.out.println();
    //     }
    // }

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
        int[][] arr2 = new int[b][a];

        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                arr2[j][i]=arr[i][j];
                System.out.print(" " +arr[j][i]);
            }
            System.out.println(" ");
            }
            System.out.println();
        }
    }

