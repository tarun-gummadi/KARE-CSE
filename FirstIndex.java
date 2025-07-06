public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 2, 3, 6};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                break;
            }
        }

        if (index != -1) {
            System.out.println("First repeated number is found at index: " + index);
        } else {
            System.out.println("No repeated numbers found.");
        }
    }
}
