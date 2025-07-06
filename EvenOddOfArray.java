import java.util.Scanner;
public class EvenOddOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int a = sc.nextInt();
        int count =0;
        int [] arr1 = new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the "+(i+1)+"st value : ");
            arr1[i]=sc.nextInt();
            if(arr1[i]%2 ==0){
                count++;
            }
        }
        System.out.println("The no.of of even numbers are : "+count);
        System.out.print("The no.of of odd number are : "+(a-count));

    }
}
