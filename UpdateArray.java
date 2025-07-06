
import java.util.ArrayList;

public class UpdateArray {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        System.out.println("Original ArrayList: " + colors);
        String oldElement = colors.set(1, "Yellow");
        System.out.println("Updated ArrayList: " + colors);
        System.out.println("Replaced element: " + oldElement);
    }
}
