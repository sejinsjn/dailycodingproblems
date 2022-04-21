package problem001;

public class Main {

    public static void main(String[] args) {
        int[] num = {10,15,2,7,5,9,4,16,1,17,18};
        Numbers numbers = new Numbers(num, 20);
        numbers.searchAllSummand();
    }
}
