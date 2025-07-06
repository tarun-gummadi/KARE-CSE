
import java.util.*;

public class Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Peter");
        list.add("Parker");
        list.add("is");
        list.add("Driving");
        list.add("Home");
        list.add("at night");
        list.remove("at night");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
