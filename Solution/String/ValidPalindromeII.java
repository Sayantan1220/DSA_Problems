/*Given a string s, return true if the s can be palindrome after deleting at most one character from it.
https://leetcode.com/problems/valid-palindrome-ii/
*/

package Solution.String;

public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r){
            if (s.charAt(l) != s.charAt(r)){
                return isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1);
            }
            l++;
            r--;
        }      
        return true;
    }
    
    public static boolean isPalindrome(String s, int l, int r){
        while (l < r){
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }   

    public static void main(String args[]) {
        String s = "abca";
        boolean res = validPalindrome(s);
        System.out.println(res);
    }
}
