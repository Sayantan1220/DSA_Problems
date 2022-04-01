/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
https://leetcode.com/problems/reverse-string/
*/

package Solution.String;

public class ReverseString {
    public static char[] reverseString(char[] s) {
        char temp;
        int start = 0;
        int end = s.length-1;
        while(start<=end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;        
        }
        return s;
    }    

    public static void main(String args[]) {
        char[] s = {'h','a','n','n','a','h'};
        char[] res = reverseString(s);
        System.out.println(res);
    }   
}
