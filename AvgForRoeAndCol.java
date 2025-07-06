public class AvgForRoeAndCol {
    public static void main(String[] args) {
         int[][] arr = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("Average of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j];
            }
            double rowAvg = (double) rowSum / cols;
            System.out.println("Row " + (i + 1) + " average = " + rowAvg);
        }
        System.out.println("\nAverage of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }
            double colAvg = (double) colSum / rows;
            System.out.println("Column " + (j + 1) + " average = " + colAvg);
        }
    }
}
