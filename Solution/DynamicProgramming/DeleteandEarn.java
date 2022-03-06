package Solution.DynamicProgramming;

public class DeleteandEarn {
     public static int deleteAndEarn(int[] nums) {
         int n = 10001;
        int[] values = new int[n];
         for (int num : nums)
             values[num] += num;
    
          int take = 0, skip = 0;
            for (int i = 0; i < n; i++) {
                int takei = skip + values[i];
                int skipi = Math.max(skip, take);
                take = takei;
                skip = skipi;
            }
            return Math.max(take, skip);
        }
     public static void main(String args[]) {
        int[] res = {3,4,2};
        int result = deleteAndEarn(res);
        System.out.println(result);
    }
}
