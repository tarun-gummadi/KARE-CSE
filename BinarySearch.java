
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;

        int m = binarySearch(arr, target);

        if (m == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + m);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length;

        while (l <= r) {
            int mid = (r + l) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
