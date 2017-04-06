import java.util.Arrays;

/**
 * Created by aalfaruk on 4/4/2017.
 */
public class SortCount {

    public static void main(String[] args){

        int someValues = 9;
        int[] count = new int[someValues];

        int[] a = new int[]{9,2,4,8,9,4,3,2,8,1,2,7,2,5};
        // Go through each element of this array:
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // Add 1 to the corresponding position in the count array.
            int position = a[i] - 1;
            count[position]++;
        }

        int[] sorted = new int[n];
        int h = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                // Sum 1 to i to get the original number
                sorted[h++] = i + 1;
            }
        }

        System.out.println(Arrays.toString(sorted));

    }
}
