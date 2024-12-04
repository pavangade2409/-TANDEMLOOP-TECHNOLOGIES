import java.util.Scanner;

class Calculator {

    
    public double add(double a, double b) {
        return a + b;
    }

   
    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        
        double result;
        try {
            switch (operation.toLowerCase()) {
                case "add":
                    result = calculator.add(a, b);
                    System.out.println("Result: " + result);
                    break;
                case "subtract":
                    result = calculator.subtract(a, b);
                    System.out.println("Result: " + result);
                    break;
                case "multiply":
                    result = calculator.multiply(a, b);
                    System.out.println("Result: " + result);
                    break;
                case "divide":
                    result = calculator.divide(a, b);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation. Please choose add, subtract, multiply, or divide.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
