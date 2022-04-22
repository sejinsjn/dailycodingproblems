package p001;

public class Solution {

    private final int[] numbers;
    private final int result;

    public Solution(int[] numbers, int result) {
        this.numbers = numbers;
        this.result = result;
    }

    public void searchAllSummand(){
        for (int a : numbers)
            for(int b : numbers)
                if((a+b) == result)
                    System.out.println(a + " + " + b + " = " + result);
    }

    public static void main(String[] args) {
        int[] num = {10,15,2,7,5,9,4,16,1,17,18};
        Solution sol = new Solution(num, 30);
        sol.searchAllSummand();
    }
}
