package p005;

public class Solution {

    public static Pair cons(int a, int b){
        return new Pair(a, b);
    }

    public static int car(Pair pair){
        return pair.getA();
    }

    public static int cdr(Pair pair){
        return pair.getB();
    }

    public static void main(String[] args) {
        System.out.println("First element: " + car(cons(3,4)));
        System.out.println("Last element: " + cdr(cons(3,4)));
    }
}
