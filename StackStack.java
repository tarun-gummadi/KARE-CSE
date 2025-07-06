
import java.util.*;

public class StackStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> list = new Stack<String>();
        list.add("Peter");
        list.add("Parker");
        list.add("is");
        list.add("Driving");
        list.add("Home");
        list.add("at night");
        list.remove("at night");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// java program to update arrayList element by the given element
// for trimming the capacity of an arrayList
