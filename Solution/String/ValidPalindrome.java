/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
https://leetcode.com/problems/valid-palindrome/
*/

package Solution.String;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder fs=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((int)ch >=97 && (int)ch <=122 || (int)ch >=48 && (int)ch <=57)
            {
                fs.append(ch);
            }
            else if((int)ch >=65 && (int)ch <=90)
            {
                fs.append((char)((int)ch +32));
            }
        }
        System.out.println(fs);
        if(fs.length()==0)
            return true;
        int start=0,end=fs.length()-1;
        while(start<=end)
        {
            Character ch1=fs.charAt(start);
            Character ch2=fs.charAt(end);
            if(!ch1.equals(ch2))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
}
