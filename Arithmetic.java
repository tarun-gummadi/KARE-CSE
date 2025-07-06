
import java.util.Scanner;

public class Arithmetic {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 0;
//         try {
//             System.out.println((a / b));
//         } catch (ArithmeticException e) {
//             System.out.println("Arithemetic error occured");
//         }
//     }
// }

// java program to create a method that takes a string as input and throws an exception if the string doesnt contain vowels.
// java program to create a method that takes an integer as parameter and throws and exception if the number is odd
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the integer : ");
//     int integer = sc.nextInt();
//     try {
//         if(integer%2==0){
//             System.out.println("Given number is Even ");
//         }
//     } catch (ArithmeticException e) {
//         System.out.println("The given number  is odd ");
//     }
//     finally{
//         System.out.println("the given number is odd");
//     }
//     }
// }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        try {
            if (str == "a" || str == "e" || str == "i" || str == "o" || str == "u") {
                System.out.println("The string is : " + str);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(" given string doesn't contain Vowel ");
        }
    }
}
