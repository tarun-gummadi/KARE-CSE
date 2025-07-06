public class SecondLargeSmall {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1, 6, 7, 9, 1};
        int firstMin = arr[0];
        int firstMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                firstMin = arr[i];
            }
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }
        int secondMin = firstMax;
        int secondMax = firstMin;
        boolean foundSecondMin = false;
        boolean foundSecondMax = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMin && arr[i] < secondMin) {
                secondMin = arr[i];
                foundSecondMin = true;
            }
            if (arr[i] < firstMax && arr[i] > secondMax) {
                secondMax = arr[i];
                foundSecondMax = true;
            }
        }
        if (foundSecondMin) {
            System.out.println("Second Minimum: " + secondMin);
        } else {
            System.out.println("Second Minimum not found.");
        }

        if (foundSecondMax) {
            System.out.println("Second Maximum: " + secondMax);
        } else {
            System.out.println("Second Maximum not found.");
        }
    }
}
