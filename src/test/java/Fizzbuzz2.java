/**
 * Created by aalfaruk on 4/4/2017.
 */
public class Fizzbuzz2 {

    /**
     if (theNumber is divisible by 3) then
    print "Fizz"
            else if (theNumber is divisible by 5) then
    print "Buzz"
            else theNumber is not divisible by 3 or 5
    print theNumber
    end if

     Number from 1 to 100
    */

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String test = "";
            test += (i % 3) == 0 ? "fizz" : "";
            test += (i % 5) == 0 ? "buzz" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
    }
}