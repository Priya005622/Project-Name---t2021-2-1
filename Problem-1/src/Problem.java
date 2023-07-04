public class Problem {
    private double a;
    private double b;
    public Problem(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double performOperation(String operation) {
        double result = 0.0;
        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not possible");
                }
                break;
            default:
                System.out.println("Error: Invalid operation performed");
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        double a = 20.0;
        double b = 5.0;

        String operation = "add";
        String operation1 = "subtract";
        String operation2 = "multiply";
        String operation3 = "divide";

        Problem calculator = new Problem(a, b);
        double result = calculator.performOperation(operation);
        double result1 = calculator.performOperation(operation1);
        double result2 = calculator.performOperation(operation2);
        double result3 = calculator.performOperation(operation3);
        System.out.println("Result on addition: " + result);
        System.out.println("Result on subtraction: " + result1);
        System.out.println("Result on multiplication: " + result2);
        System.out.println("Result on division: " + result3);
    }
}
