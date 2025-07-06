
import java.util.Scanner;

public class BigAndSmall {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the  string: ");
    //     String str = sc.nextLine();
    //     String result = "";
    //     for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);
    //         if (ch >= 'A' && ch <= 'Z') {
    //             ch = (char) ((int) (ch) + 32);
    //         } else if (ch <= 'a' && ch <= 'z') {
    //             ch = (char) ((int) (ch) - 32);
    //         } else {
    //             result += ch;
    //         }
    //     }
    //     for(int i =0;i<ch;i++)
    //     System.out.println("Modified string: " + result);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter old password: ");
        String input = sc.nextLine();
        if (input.length() == 0) {
            System.out.println("null");
            return;
        }
        int len = input.length();
        char[] result = new char[len];

        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[i] = (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                result[i] = (char) (ch + 32);
            } else {
                result[i] = ch;
            }
        }
        System.out.print("New password: ");
        for (int i = 0; i < len; i++) {
            System.out.print(result[i]);
        }

        sc.close();
    }
}
