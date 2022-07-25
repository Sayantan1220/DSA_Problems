package Solution.Array;

public class CountingWordsWithGivenPrefix {
    public static int prefixCount(String[] words, String pref) {

        int count = 0;
        int size = pref.length();
        String sub = null;
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
