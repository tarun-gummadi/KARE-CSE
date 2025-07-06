import java.util.Scanner;
public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array  : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2  = new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter the "+(i+1)+" value in Array1  : ");
            arr1[i]=sc.nextInt();
            arr2[i] = arr1[i];
        }
        System.out.println("The Array2 elements are : ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]);
        }
    }
}
