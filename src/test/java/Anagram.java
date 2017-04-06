import java.util.HashMap;

/**
 * Created by Iftekhar Ivaan on 5/22/2016.
 */
public class Anagram {

    public static void main(String[] args) {

        String s1 = "cinema";
        String s2 = "iceman";

        System.out.println("Word : " + s1 + " and " + s2 + " is anagram: ");
        System.out.println(isAnagram(s1,s2));

        //System.out.println("Word : " + s1 + " and " + s2.toUpperCase() + " is anagram: ");
        //System.out.println(isAnagram(s1,s2.toUpperCase()));

    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            arr[c1-'a']++;
        }

        for(int i=0; i<s.length(); i++){
            char c2 = t.charAt(i);
            if(arr[c2-'a'] == 0){
                return false;
            }else{
                arr[c2-'a']--;
            }
        }

        for(int i=0; i<26; i++){
            if(arr[i]%2==1){
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramEx(String s, String t) {
        if(s.length()!=t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            if(map.containsKey(c1)){
                map.put(c1, map.get(c1)+1);
            }else{
                map.put(c1,1);
            }
        }

        for(int i=0; i<s.length(); i++){
            char c2 = t.charAt(i);
            if(map.containsKey(c2)){
                if(map.get(c2)==1){
                    map.remove(c2);
                }else{
                    map.put(c2, map.get(c2)-1);
                }
            }else{
                return false;
            }
        }

        if(map.size()>0)
            return false;

        return true;
    }
}
