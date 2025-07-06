import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no:of Friends : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] partyDay = new boolean[101];
        int savedFriendships = 0;

        for (int i = 0; i < n; i++) {
            if (!partyDay[arr[i]]) {
                partyDay[arr[i]] = true;
                savedFriendships++;
            }
        }
        System.out.println("No:Of Friendships saved are : " +savedFriendships);

        sc.close();
    }
}
