
// public class MgicMatrix {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {16, 2, 3, 13},
//             {5, 11, 10, 8},
//             {9, 7, 6, 12},
//             {4, 14, 15, 1}
//         };
//         if (isMgicMatrix(matrix)) {
//             System.out.println("The matrix is a Magic Matrix ");
//         } else {
//             System.out.println("The matrix is not a Magic Matrix ");
//         }
//     }
//     public static boolean isMgicMatrix(int[][] matrix) {
//         int n = matrix.length;
//         int expectedSum = 0;
//         for (int j = 0; j < n; j++) {
//             expectedSum += matrix[0][j];
//         }
//         for (int i = 0; i < n; i++) {
//             int rowSum = 0;
//             for (int j = 0; j < n; j++) {
//                 rowSum += matrix[i][j];
//             }
//             if (rowSum != expectedSum) {
//                 return false;
//             }
//         }
//         for (int j = 0; j < n; j++) {
//             int colSum = 0;
//             for (int i = 0; i < n; i++) {
//                 colSum += matrix[i][j];
//             }
//             if (colSum != expectedSum) {
//                 return false;
//             }
//         }
//         int diagonalSum = 0;
//         for (int i = 0; i < n; i++) {
//             diagonalSum += matrix[i][i];
//         }
//         if (diagonalSum != expectedSum) {
//             return false;
//         }
//         int antiDiagonalSum = 0;
//         for (int i = 0; i < n; i++) {
//             antiDiagonalSum += matrix[i][n - 1 - i];
//         }
//         if (antiDiagonalSum != expectedSum) {
//             return false;
//         }
//         return true;
//     }
// }
import java.util.Scanner;

public class MgicMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] arr1 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int sumi = 0;
        int sumai = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumi += arr1[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    sumai = sumai + arr1[i][j];
                }
            }
        }
        int sumr = 0;
        int sumc = 0;
        System.out.println(sumai);
        System.out.println(sumi);
        if (sumai == sumi) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sumr += arr1[i][j];
                    sumc += arr1[j][i];
                }
            }
            System.out.println(sumr);
            System.out.println(sumc);
            if (sumr == sumc && sumr == sumi) {
                System.out.println("the matrix is a magic matric");
            } else {
                System.out.println("the matrix is not a magic matrix");
            }

        } else {
            System.out.println("the matrix is not a magic matrix");
        }

    }
}
