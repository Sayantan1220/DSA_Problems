/*
You are given an array of strings words and a string pref.
Return the number of strings in words that contain pref as a prefix.
A prefix of a string s is any leading contiguous substring of s.
https://leetcode.com/problems/counting-words-with-a-given-prefix/
*/

package Solution.Array;

public class CountingWordsWithGivenPrefix {
    public static int prefixCount(String[] words, String pref) {

        int count = 0;
        int size = pref.length();
        String sub;
        for (String word : words){
            if (word.length() >= size){
                sub = word.substring(0, size);
                if (sub.equalsIgnoreCase(pref)){
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int result = prefixCount(words, pref);
        System.out.println(result);
    }
}
