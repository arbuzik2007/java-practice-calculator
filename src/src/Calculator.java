public class Calculator {
    static String Calculate(String[] args) {
        double result;
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
                    return ("Operation Error!");
            }
        }catch (NumberFormatException ex) {
            return ("Error! Not number");
        }
        catch (ArithmeticException ex) {
            return ("Error! Division by zero");
        }
        return Double.toString(result);
    }
}
