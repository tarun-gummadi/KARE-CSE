import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
         for(int i =0;i<a;i++){
            System.out.print("Enter the " +(i+1)+"st value  : ");
            arr1[i] = sc.nextInt();
        }
        for(int i =0;i<a;i++){
            System.out.print(" " +arr1[i]);
        }
    }
}