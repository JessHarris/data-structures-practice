import java.util.Arrays;

public class ArrayStuff {

    public static void main(String[] args) {
        System.out.println("The missing number in the array is " + findMissingNumber(new int[]{1, 3}, 3));
        System.out.println("Array with removed duplicates " + Arrays.toString(removeDups(new int[]{1, 2, 2, 3})));
        findLargestAndSmallestNumInArray(new int[]{1, 2, 3});
        reverseArray(new int[]{1, 2, 3});
    }

    public static int findMissingNumber(int[] array, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }

        return expectedSum - actualSum;
    }

    public static int[] removeDups(int[] arrayWithDups) {
        Arrays.sort(arrayWithDups);
        int[] result = new int[arrayWithDups.length];
        int previous = arrayWithDups[0];
        result[0] = previous;
        for (int i = 1; i < arrayWithDups.length; i++) {
            int current = arrayWithDups[i];
            if (current != previous) {
                result[i] = current;
            }
            previous = current;
        }

        return result;
    }


    public static void findLargestAndSmallestNumInArray(int[] array) {
        int smallest = array[0];
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Smallest number is " + smallest);
        System.out.println("Largest number is " + largest);

    }

    public static void reverseArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, x = array.length - 1; i < array.length; i++, x--) {
            result[i] = array[x];
        }

        System.out.println("Reversed Array " + Arrays.toString(result));
    }
}
