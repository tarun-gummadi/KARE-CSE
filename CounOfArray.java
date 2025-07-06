import java.util.Scanner;

public class CounOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,20,10,10,20,5,20};
        int n = arr.length;
        int[] visited = new int[n];

        for(int i=0;i<n;i++){
            if(visited[i]==1)
                continue ;

            int count = 1;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=1;
                }
            }
            visited[i] = 1;
            System.out.println(arr[i]+ " " +count);
        }
    }
}

