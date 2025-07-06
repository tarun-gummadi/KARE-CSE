import java.util.Scanner;
public class Version {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:of files : ");
        int A = sc.nextInt();
        System.out.println("Enter the no:of ignored files : ");
        int B = sc.nextInt();
        System.out.println("Enter the no:of tracked files : ");
        int C = sc.nextInt();

        int[]arr1 = new int[B];
        int[]arr2 = new int[C];

        for(int i=0;i<B;i++){
            System.out.println("Enter the Tracked and Ignored files : ");
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<C;i++){
            System.out.println("Enter the Untracked and UnIgnored files : ");
            arr2[i] = sc.nextInt();
        }
        int TrackedandIgnored = 1;
        int UntrackedandIgnored = 0;

        for(int i=1;i<A;i++){
            boolean IsIgnored = false;
            boolean IsTracked = false;

            for(int j=0;i<B;j++){
                if(arr1[j] == i){
                    IsIgnored = true;
                    break;
                }
            }
            for(int j=0;j<C;j++){
                if(arr2[j] ==i){
                    IsTracked = true;
                    break;
                }
            }
            if(IsTracked && IsIgnored){
                TrackedandIgnored++;
            }else if (!IsIgnored && !IsTracked){
                UntrackedandIgnored++;
            }
        }
        System.out.println( " The TrackedandIgnored : " + TrackedandIgnored + " The UntrackedandIgnored : " + UntrackedandIgnored);
    }
}
