/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("Number: 15");
        System.out.println(fizzBuzz(15));

        System.out.println("Number: 156");
        System.out.println(fizzBuzz(156));

        System.out.println("Number: 230");
        System.out.println(fizzBuzz(230));
    }


    /**
     * Java Method to solve FizzBuzz problem, which states that program
     * should print fizz if number is multiple of 3,
     * print buzz if number is multiple
     * of 5, and print fizzbuzz if number is multiple of both 3 and 5
     * @param number
     * @return
     */
    public static String fizzBuzz(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    /**
     * An improved version of earlier solution, much cleaner than previous
     * version because we have tested for divisible by 3 and 5 first.
     * It avoid duplication also.
     */

    public static String fizzBuzz2(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }


}
