import java.util.Scanner;
public class UniqueElements {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number of array elements: ");
            int n=sc.nextInt();
            int[] arr= new int[n];
            System.out.print("Enter the array elements: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
                for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.print("Unique numbers: ");
                System.out.print(arr[0] + " ");
                for (int i = 1; i < n; i++) {
                    if (arr[i] != arr[i - 1]) {
                        System.out.print(arr[i] + " ");
                    }
            }
            System.out.println();
            sc.close();
        }

    }
