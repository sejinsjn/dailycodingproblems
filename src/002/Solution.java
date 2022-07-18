package p002;

import java.util.*;

public class Solution {

    private final int[] numbers;

    public Solution(int[] numbers) {
        this.numbers = numbers;
    }

    public void solution(){
        int num = 1;
        int[] nums = new int[numbers.length];
        for(int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length; i++)
                if (j != i) num *= numbers[i];
            nums[j] = num;
            num = 1;
        }
        System.out.println("Solution: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1};
        Solution sol = new Solution(numbers);
        sol.solution();
    }
}
