import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class DuplicateCharacters {

    public static void main(String a[]){
        DuplicateCharacters obj = new DuplicateCharacters();
        System.out.println("String: BeginnersBook.com");
        System.out.println("-------------------------");
        obj.countDupChars("BeginnersBook.com");

        System.out.println("\nString: ChaitanyaSingh");
        System.out.println("-------------------------");
        obj.countDupChars("ChaitanyaSingh");

        System.out.println("\nString: #@$@!#$%!!%@");
        System.out.println("-------------------------");
        obj.countDupChars("#@$@!#$%!!%@");
    }

    public void countDupChars(String str){

        //Create a HashMap
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        //Convert the String to char array
        char[] chars = str.toCharArray();

    /* logic: char are inserted as keys and their count
     * as values. If map contains the char already then
     * increase the value by 1
     */
        for(Character ch:chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }

        //Obtaining set of keys
        Set<Character> keys = map.keySet();

    /* Display count of chars if it is
     * greater than 1. All duplicate chars would be
     * having value greater than 1.
     */
        for(Character ch:keys){
            if(map.get(ch) > 1){
                System.out.println("Char "+ch+" "+map.get(ch));
            }
        }
    }


}
