package Solution.String;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        int[] arr = new int[256];
        if (s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
           arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++){
            if (arr[t.charAt(i) - 'a']-- == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = isAnagram("rat", "car");
        System.out.println(res);
    }
}
