import java.util.Scanner;
public class MoreUnique {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number of array elements: ");
            int n=sc.nextInt();
            int[] arr= new int[n];
            System.out.print("Enter the array elements: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
                for (int i = 0; i <arr.length; i++) {
                    int count =0;
                    for (int j = 0; j <arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            count++;
                        }
                    }if(count==1){
                        System.out.println("Unique elements are : "+arr[i]);
                }
            }
        }
    }
