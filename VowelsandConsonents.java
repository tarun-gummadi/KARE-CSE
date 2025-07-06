
import java.util.Scanner;

public class VowelsandConsonents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0;
        int consonents = 0;
        int count_vowels = 0;
        int count_consonents = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonents++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonents);

        for (int i = 1; i < str.length(); i++) {
            if (vowels % i == 0) {
                count_vowels++;
            }
            if (consonents % i == 0) {
                count_consonents++;
            }

        }

        if (count_vowels == 2) {
            System.out.println("0");
        } else {
            System.out.println("   vowel is not a prime number");
        }
        if (count_consonents == 2) {
            System.out.println("1");
        } else {
            System.out.println("   consonent  also not a prime number");

        }

    }
}
