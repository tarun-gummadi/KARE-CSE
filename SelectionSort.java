
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4};
        Selectionsort(arr);
        System.out.println("The sorted array is : ");
        PrintArr(arr);
    }

    public static void Selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int b = arr[min];
            arr[min] = arr[i];
            arr[i] = b;
        }
    }

    public static void PrintArr(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();
    }
}
