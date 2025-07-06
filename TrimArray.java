
import java.util.*;

public class TrimArray {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        System.out.println("Original ArrayList: " + colors);
        String oldElement = colors.set(1, "Yellow");
        colors.remove(1);
        System.out.println("Updated ArrayList: " + colors);
        System.out.println("Removed element: " + oldElement);
    }
}
