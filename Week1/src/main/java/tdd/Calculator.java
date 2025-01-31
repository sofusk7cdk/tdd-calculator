package tdd;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int substract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        return a/b;
    }


    public int add(String numbers) {
        int sum = 0;
        String[] arr = numbers.split(",");
        for(String i : arr) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }

    public int add(int[] numbers) {
        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
