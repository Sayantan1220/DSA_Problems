package Solution.String;
import java.util.*;



public class SmallestStringWithNumeric {
    public String getSmallestString(int n, int k) {
        char res[] = new char[n];
        Arrays.fill(res, 'a');
        k -= n;
        
        while(k > 0){
            res[--n] += Math.min(25, k);
            k -= Math.min(25, k);
        }
        return String.valueOf(res);
    }
    
}
