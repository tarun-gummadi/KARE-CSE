
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 8, 6, 3, 1, 2};
        insertionSort(arr);
        System.out.print("Sorted Array : ");
        Array(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > a) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = a;
        }
    }

    public static void Array(int[] arr) {
        for (int num : arr) {
            System.out.print(num);
        }
        System.out.println();
    }
}
