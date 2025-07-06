import java.util.Scanner;
public class AverageMinandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of ana Array : ");
        int a = sc.nextInt();
        int sum = 0;
        int avg = 0;
        int[] arr = new int[a];
        int max = arr[1];
        int min = arr[1];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
        }
    }
    int avgsum = sum-max-min;
    avg  = avgsum/a;
    System.out.println("The average is : "+avg);
    }
}

