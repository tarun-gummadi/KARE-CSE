public class PairOfSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,};
        int a =6;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==a && arr[i]!=arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }

    }
}
