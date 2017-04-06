import java.util.Scanner;

/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class ReverseNumber {
    public static void main(String[] args) {

        int num=0;
        int reversenum =0;

        System.out.println("Input your number and press enter: ");
        //This statement will capture the user input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = in.nextInt();

        System.out.println("Number: " + num);

        reversenum = reverseNumber(num);

        System.out.println("ReverseNumber: " + reversenum);

    }

    public static int reverseNumber(int number){
        int reversenum = 0;

        while( number != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + number % 10;
            System.out.println("\t" + reversenum);
            number = number/10;
        }

        return reversenum;
    }
}
