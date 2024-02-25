import java.util.UUID;

class Calculator {

    Calculator(){
    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }
    int divide(int a, int b){
        if (b == 0) throw new ArithmeticException("/ by zero");
        return a / b;
    }
    

    // Efficient Fibonacci Number Finder
    int fibonacciNumberFinder(int n){
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int fib1 = 1, fib2 = 1;
        int fibonacci = 0;
        for (int i = 2; i < n; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }

    // Integer to Binary Converter
    String intToBinaryNumber(int number){
        return Integer.toBinaryString(number);
    }

    // Unique String ID Creator
    String createUniqueID(String n){
        // Using UUID to ensure uniqueness
        return n + "-" + UUID.randomUUID().toString();
    }

}


