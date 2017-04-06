import java.util.Arrays;

/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class InsertionSort {
    public static void main(String args[]) {
        int[] num = {70,4,80,30,50,2};

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(num));

        insertionSort(num);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(num));

    }


    public static void insertionSort(int[] array) {
        // insertion sort starts from second element
        for (int i = 1; i < array.length; i++) {
            int numberToInsert = array[i];
            int compareIndex = i;
            while (compareIndex > 0 && array[compareIndex - 1] > numberToInsert) {
                array[compareIndex] = array[compareIndex - 1];
                // shifting element
                compareIndex--;
                // moving backwards, towards index 0 }
                // compareIndex now denotes proper place for number to be sorted
                array[compareIndex] = numberToInsert;
                System.out.println("\t" + Arrays.toString(array));
            }
        }
    }
}
