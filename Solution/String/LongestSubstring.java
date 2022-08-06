/*
Given a string s, find the length of the longest substring without repeating characters.
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/

package Solution.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> hash = new HashSet<>();
        int posS = 0;
        int ans = 0;
        int n = s.length();
        for(int i=0; i < n; i++){
            if(i > 0)
                hash.remove(s.charAt(i - 1));
            while(posS < n && !hash.contains(s.charAt(posS))){
                hash.add(s.charAt(posS));
                posS++;
                ans = Math.max(ans, posS - i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
