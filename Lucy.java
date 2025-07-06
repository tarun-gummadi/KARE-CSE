import java.util.Scanner;
public class Lucy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] fav = new int[n];

        for (int i = 0; i < n; i++) {
            fav[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i <= N - n; i++) {
            boolean match = true;
            for (int j = 0; j < n; j++) {
                if (sequence[i + j] != fav[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
