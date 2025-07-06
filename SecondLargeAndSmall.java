public class SecondLargeAndSmall {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1, 4, 6, 9, 2};

        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                firstMin = arr[i];
            }
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMin && arr[i] < secondMin) {
                secondMin = arr[i];
            }
            if (arr[i] < firstMax && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("First Minimum: " + firstMin);
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Second Minimum: Not found");
        } else {
            System.out.println("Second Minimum: " + secondMin);
        }

        System.out.println("First Maximum: " + firstMax);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second Maximum: Not found");
        } else {
            System.out.println("Second Maximum: " + secondMax);
        }
    }
}
