import java.util.Scanner;
public class Secondmaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp =0;
        int [] arr = {2,3,5,7,1,2,4,9,7,5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
        int min =arr[0];
        System.out.println(" ");
        int Scount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                Scount++;
            }
        }
        System.out.println(arr[Scount]);
        }
    }
