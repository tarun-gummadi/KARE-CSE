public class Average {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
             {4,5,6},
             {7,8,9}
        };
        int sum=0;
        int avg =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                    sum = sum+arr[i][j];
                    avg = sum/9;
            }
        }
        System.out.println(" "+sum);
            System.out.println(" "+avg);
    }
    }
