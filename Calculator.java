public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java Calculator <a> <op> <b>");
            System.exit(1);
        }
        double a, b;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
            System.exit(1);
            return;
        }
        double result;
        switch (args[1]) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/":
                if (b == 0) {
                    System.err.println("Division by zero");
                    System.exit(1);
                }
                result = a / b;
                break;
            default:
                System.err.println("Invalid operator");
                System.exit(1);
                return;
        }
        if (result == Math.floor(result)) {
            System.out.println((long) result);
        } else {
            System.out.println(result);
        }
    }
}
