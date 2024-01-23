public class Calculator {
    static double Calculate(String... args) {
        double result = -1;
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            switch (args[1]){
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if(b == 0)
                        throw new ArithmeticException("");
                    result = a / b;
                    break;
                default:
                    System.out.println("Operation Error!");
                    break;
            }
        }catch (NumberFormatException ex) {
            System.out.println("Error! Not number");
        }
        catch (ArithmeticException ex) {
            System.out.println("Error! Division by zero");
        }
        return result;
    }
}
