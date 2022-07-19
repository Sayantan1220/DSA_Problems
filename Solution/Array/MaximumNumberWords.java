/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.
https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
*/

package Solution.Array;

public class MaximumNumberWords {

    public static int mostWordsFound(String[] sentences) {

        int currMax = 0;
        int totalMax = 0;
        for (String sentence : sentences) {
            currMax = sentence.split(" ").length;
            totalMax = Math.max(currMax, totalMax);
        }
        return totalMax;
    }

    public static void main(String args[]) {
        String[] accounts = {"please wait", "continue to fight", "continue to win"};
        int res = mostWordsFound(accounts);
        System.out.print(res);
    }
}
