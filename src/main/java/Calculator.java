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

    int divide(int a , int b){
        // Ensure division by zero is handled
        if (b == 0) throw new ArithmeticException("Division by zero.");
        return a / b;
    }

    int fibonacciNumberFinder(int n){
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int fib = 1, prevFib = 1;
            for (int i = 3; i <= n; i++) {
                int temp = fib;
                fib += prevFib;
                prevFib = temp;
            }
            return fib;
        }
    }

    String intToBinaryNumber(int number){
        return Integer.toBinaryString(number);
    }

    String createUniqueID(String n){
        return n + UUID.randomUUID().toString();
    }


}

