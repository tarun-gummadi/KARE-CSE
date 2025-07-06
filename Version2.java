import java.util.Scanner;

public class Version2 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int m;
      System.out.println("enter the total no.of files");
      m=sc.nextInt();
      int[] arr1 = new int[m];
      int num=1;
      for(int i=0;i<m;i++){
        arr1[i]=num;
        num++;
      }     
      int n;
      System.out.println("enter the no.of ignored files");
      n=sc.nextInt();
      int[] arr2= new int[n];
      for(int i=0;i<n;i++){
        System.out.println("enetr the ignored files");
        arr2[i]=sc.nextInt();
      }

      int o;
      System.out.println("enter the no.of tracked files");
      o=sc.nextInt();
      int[] arr3=new int[o];
      for(int i=0; i<o;i++){
        System.out.println("enter the tracked files");
        arr3[i]=sc.nextInt();
      }


      System.out.println("these the total files");
      for(int i=0;i<m;i++){
        System.out.print(arr1[i]);
      }

      System.out.println("these are the files of ignored");
      for(int i=0;i<n;i++){
        System.out.print(arr2[i]);
      }

      System.out.println("these are the files of the tracked");
      for(int i=0;i<o;i++){
        System.out.print(arr3[i]);
      }
      int count=0;
      for(int i=0;i<n;i++){
        for(int j=0;j<o;j++){
          if(arr2[i]==arr3[j]){
            count++;
          }
        }
      }
      System.out.println("the no.of ignored and the tracked are"+count);
      int count1=0;
      for(int i=1;i<=m;i++){
        boolean founda = false;
        for(int j=0;j<n;j++){
          if(arr2[j]==i){
            break;
          }
        }
        if(!founda){
          boolean foundb =false;
        for(int k=0;k<o;k++){
          if(arr3[k]==i){
            foundb=true;
            break;
          }
        }
        if(!foundb){
          count1++;
        }


        }
      }
      System.out.println("these are the files of the unignored and untracked"+count1);
    

      sc.close();


    }
}
