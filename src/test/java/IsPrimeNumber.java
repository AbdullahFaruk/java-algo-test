/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class IsPrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(11));
        System.out.println(isPrimeNumber(22));
        System.out.println(isPrimeNumber(37));
        System.out.println(isPrimeNumber(7));

        System.out.println("\n");
        System.out.println(isPrimeNumber2(3));
        System.out.println(isPrimeNumber2(43));
        System.out.println(isPrimeNumber2(23));
        System.out.println(isPrimeNumber2(88));

        // Here 120 is an upper limit
        //crunchifyGeneratePrimeNumbers(120);

    }


    public static boolean isPrimeNumber(int number) {
        System.out.println("Prime check started for number: " + number);

        // Loop starts from 2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Another way to check if Number is Prime
    public static boolean isPrimeNumber2(int number) {

        System.out.println("Prime check started for number: " + number);

        boolean crunchifyPrime = true;
        int limit = (int) Math.sqrt(number);

        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                crunchifyPrime = false;
                break;
            }
        }

        return crunchifyPrime;
    }

}
