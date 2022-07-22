package Solution.Array;

public class VariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (String operation : operations){
            if (operation.startsWith("++") || operation.endsWith("++")){
                x += 1;
            }
            else{
                x -= 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String arr[] = { "--X","X++","X++" };
        int result = finalValueAfterOperations(arr);
        System.out.println(result);
    }
}
