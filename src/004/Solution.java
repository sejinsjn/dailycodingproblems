package p004;

import java.util.*;

public class Solution {

    public static int solution(int [] integer){
        Arrays.sort(integer);
        int a = 0;
        for(int b : integer){
            if(b > 0) {
                if(a == 0) a = b;
                else
                    if (b - a == 1) a = b;
                    else if (b - a > 1) return a + 1;
            }
        }
        return a + 1;
    }

    public static void main(String[] args) {
        int[] integer = {1,2,9,7,8};
        System.out.println("Result: " + solution(integer));
    }
}
