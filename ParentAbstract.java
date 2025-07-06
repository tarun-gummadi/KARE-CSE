
import java.util.Scanner;

class Parent {

    void fun(int m) {
        int i, k = 0;
        int[] arr1 = new int[20];
        while (m != 0) {
            i = m % 10;
            arr1[k++] = i;
            m = m / 10;
        }
        int sum = 0;
        for (int j = 0; j < arr1.length; j++) {
            for (int l = j + 1; l < arr1.length; l++) {
                sum += arr1[j] + arr1[l];
            }
        }
        System.out.println(sum);
    }
}

public class ParentAbstract {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Parent obj = new Parent();
        System.out.println("Enter the number : ");
        int m = sc.nextInt();
        obj.fun(m);
    }
}
