import java.util.Scanner;
public class VowelsandConsonents {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.nextLine().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            System.out.print(("The character is Vowel"));
        } else {
            System.out.print(("The character is Consonent"));
        }
   }
}
