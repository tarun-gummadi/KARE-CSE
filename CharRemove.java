
import java.util.Scanner;

public class CharRemove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ticket number : ");
        String str1 = sc.nextLine();
        int len = str1.length();
        char[] ch = new char[len];

        for (int i = 0; i < len; i++) {
            ch[i] = str1.charAt(i);
        }
        char[] result = new char[len];
        int j = 0;
        int i = 0;
        while (i < len) {
            if (i + 1 < len && ch[i] == 'E' && ch[i + 1] == 'F') {
                i += 2;
            } else if (i + 1 < len && ch[i] == '5' && ch[i + 1] == '6') {
                i += 2;
            } else if (ch[i] == 'G' || ch[i] == '&') {
                i++;
            } else {
                result[j] = ch[i];
                i++;
                j++;
            }
        }
        System.out.print("CleanedTicket is : ");
        for (int k = 0; k < j; k++) {
            System.out.print(result[k]);
        }
        sc.close();
    }
}
