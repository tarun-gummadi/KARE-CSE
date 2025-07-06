
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        Bubblesort(arr);
        System.out.println("The sorted array is : ");
        PrintArr(arr);

    }

    public static void Bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int b = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = b;
                }
            }

        }
    }

    public static void PrintArr(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();
    }
}
