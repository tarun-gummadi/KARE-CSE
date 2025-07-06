
public class IndexBond {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
            System.out.println(a[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out Of Bounds");
        }
    }
}
