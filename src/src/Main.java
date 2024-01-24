import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //"a <операция> b",
        String fileName = "input.txt";
        String[] input;
        input = FileSystem.ReadFile(fileName);
        if(input == null)
        {
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine().split(" ");
        }
        double res = Calculator.Calculate(input);
        System.out.print(res != -1 ? res : "");
        if(res != -1)
            FileSystem.WriteFile(Double.toString(res),"output.txt");
    }
}