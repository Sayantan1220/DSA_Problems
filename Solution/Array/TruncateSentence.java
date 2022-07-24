package Solution.Array;

public class TruncateSentence {

    public static String truncateSentence(String s, int k) {
        StringBuilder res = new StringBuilder();
        String[] subString = s.split(" ");
        for (int i = 0; i < k; i++){
            if (i == k-1){
                res.append(subString[i]);
            }
            else{
                res.append(subString[i]).append(" ");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String result = truncateSentence(s, k);
        System.out.println(result);
    }
}
