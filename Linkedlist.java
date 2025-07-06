
import java.util.*;

public class Linkedlist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
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
