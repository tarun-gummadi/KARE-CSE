import java.util.Scanner;

public class MaxOfRow {
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
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0;i<arr.length;i++){
                int max = arr[0][0];
                int max1 = arr[0][0];

            for(int j = 0;j<arr.length;j++){
                if(arr[j][i]>max  && arr[i][j]>max1){
                    max = arr[i][j];
                    max = arr[j][i];

                }
            }
            System.out.println( "max number from row and is " +max);

            System.out.println( "max number from column is: " +max1);
        }

    }
}