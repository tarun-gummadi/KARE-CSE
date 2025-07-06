import java.util.Scanner;
public class Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {8,4,32,5,6,7,8,6,5,4,32,23,4,5,6,7};
        int frequency = 0;
        System.out.println("Enter the element to search : ");
        int b = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                frequency++;
            }
            }
            System.out.println("The Frequency of " +b+ " is : " +frequency);
        }
    }