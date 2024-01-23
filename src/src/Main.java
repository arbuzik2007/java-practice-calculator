public class Main {
    public static void main(String[] args) {
        //"a <операция> b",
        String fileName = "input.txt";
        String[] input;
        input = FileSystem.ReadFile(fileName);
        assert input != null;
        double res = Calculator.Calculate(input);
        System.out.print(res != -1 ? res : "");
    }
}