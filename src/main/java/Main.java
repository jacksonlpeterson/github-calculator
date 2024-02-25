import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int result = 0;
            String output = "";

            switch (command) {
                case "add":
                    result = myCalculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    System.out.println(result);
                    break;
                case "subtract":
                    result = myCalculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    System.out.println(result);
                    break;
                case "multiply":
                    result = myCalculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    System.out.println(result);
                    break;
                case "divide":
                    result = myCalculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    System.out.println(result);
                    break;
                case "fibonacci":
                    result = myCalculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
                    System.out.println(result);
                    break;
                case "binary":
                    output = myCalculator.intToBinaryNumber(Integer.parseInt(parts[1]));
                    System.out.println(output);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
