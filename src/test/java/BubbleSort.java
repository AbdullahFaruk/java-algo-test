import java.util.Arrays;

/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] num = {70,4,80,30,50,2};

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(num));

        System.out.println("After sort:");
        bubbleSort(num);
        System.out.println(Arrays.toString(num));

    }



    /* * This method sort the integer array using bubble sort algorithm */
    public static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    //swap(numbers, j, j - 1);
                    int temp = numbers[j];
                    numbers[j] = numbers[j -1];
                    numbers[j -1] = temp;
                }
                System.out.println("\t" + Arrays.toString(numbers));
            }
            System.out.println(Arrays.toString(numbers));
        }
        return numbers;
    }

    /* * Utility method to swap two numbers in array */
    public static void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}
