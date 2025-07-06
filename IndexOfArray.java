import java.util.Scanner;

public class IndexOfArray {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
         for(int i =0;i<a;i++){
            arr1[i] = sc.nextInt();
         }
         System.out.print("Enter the element ot find : ");
         int b = sc.nextInt();
         for(int i = 0;i<a;i++){
            if(arr1[i] == b){
                System.out.println("The element " + b+ " is at index " + i);
                return;
        }
    }
    System.out.println("No such element is found");
    }
}