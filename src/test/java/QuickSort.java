import java.util.Arrays;

/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] x = { 9, 11, 4, 7, 3, 8, 10,1,60 };
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);

        System.out.println(Arrays.toString(x));

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        System.out.println("low:" + low + " high:" + high);

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        System.out.println("Point:" + middle + " Pivot:" + pivot);
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }
            //System.out.println(Arrays.toString(arr));
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println(Arrays.toString(arr));
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);
        //System.out.println(Arrays.toString(arr));

        if (high > i)
            quickSort(arr, i, high);
        //System.out.println(Arrays.toString(arr));
    }

}
