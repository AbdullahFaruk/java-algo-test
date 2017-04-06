/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class AlgorithmTest {

    public static void main(String[] args) {

    //swaping between two number without introducing third variable.

        int x = 5;
        int y = 6;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swaping" + "X=" + x);
        System.out.println("After Swaping" + "Y=" + y);
    }


}
