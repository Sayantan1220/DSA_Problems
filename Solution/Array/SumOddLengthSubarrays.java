package Solution.Array;

public class SumOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int odd=0;
        int  even=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            even += arr[i] * ((i/2) +1);
            odd += arr[i]*((i+1)/2);
            if(i%2==0){
                res+=even;
            }
            else{
                res+=odd;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1,4,2,5,3 };
        int result = sumOddLengthSubarrays(arr);
        System.out.println(result);
    }
}
