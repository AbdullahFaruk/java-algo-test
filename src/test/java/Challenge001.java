/**
 * Created by aalfaruk on 4/4/2017.
 */
public class Challenge001 {

        public static void main (String [] args){

            String str1 = "abc";
            String str2 = "def";
            int stringLength = str1.length()>str2.length()? str1.length():str2.length();
            for(int i = 0; i<stringLength; i++){
                if(i<str1.length())
                    System.out.print(str1.charAt(i));
                if(i<str2.length())
                    System.out.print(str2.charAt(i));
            }
        }

}
