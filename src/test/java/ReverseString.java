/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class ReverseString {
    public static void main(String[] args) {

        System.out.println("String : " + "ReverseString");
        System.out.println("Reverse : " + reverseString("ReverseString"));

        System.out.println("String : " + "ReverseString");
        System.out.println("Reverse : " + reverseString2("ReverseString"));

        System.out.println("String : " + "780");
        System.out.println("Reverse : " + reverseString2("780"));


    }

    public static String reverseString(String inputString){

        char[] chars = inputString.toCharArray();
        int left,right;

        left = 0;
        right = chars.length -1;

        for(left = 0; left < right; left++,right--){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        return  new String(chars);
    }

    public static String reverseString2(String inputString) {
        StringBuilder builder = new StringBuilder(inputString);
        return builder.reverse().toString();
    }
}
