import java.util.Scanner;

public class Strings {
        public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a lowercase string: ");
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;  
        }
        System.out.println("Uppercase string: " + result);
        sc.close();

}
}

