package Solution.Math;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {

        HashSet<Integer> hashSet = new HashSet<>();
        int sum, rem;
        while (hashSet.add(n)){
            sum = 0;
            while (n > 0){
                rem = n % 10;
                sum += rem * rem;
                n = n / 10;
            }
            if (sum == 1){
                return true;
            }
            else
                n = sum;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
        boolean res = isHappy(n);
        System.out.println(res);
    }
}
