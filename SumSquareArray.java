import java.util.Scanner;
public class SumSquareArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    boolean found = false;
    for (int i = 0; i < n ; i++) {
        for (int j = i + 1; j < n ; j++) {
            for (int k = j + 1; k < n; k++) {
                int a = arr[i], b = arr[j], c = arr[k];
                if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                    System.out.println(a*a + ", " + b*b + ", " + c*c);
                    System.out.println(a + ", " + b + ", " + c);
                    found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No such triplet found.");
        }
        sc.close();
    }
}

