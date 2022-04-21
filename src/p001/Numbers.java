package p001;

public class Numbers {

    private final int[] numbers;
    private final int result;

    public Numbers(int[] numbers, int result) {
        this.numbers = numbers;
        this.result = result;
    }

    public void searchAllSummand(){
        for (int a : numbers)
            for(int b : numbers)
                if((a+b) == result)
                    System.out.println(a + " + " + b + " = " + result);
    }
}
