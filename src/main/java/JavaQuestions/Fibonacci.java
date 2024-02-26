package JavaQuestions;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));

    }



    public static long fibonacci(int n){
        long [] memo = new long[n + 1];
        return fibonacciHelper(n , memo);
    }

    public static long fibonacciHelper(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }
            if (memo[n] != 0) {
                return memo[n];
            }
            long fib = fibonacciHelper(n - 1, memo) + fibonacciHelper(n - 2, memo);
            memo[n] = fib;
            return fib;


        }

}
