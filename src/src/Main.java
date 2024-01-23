import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //"a <операция> b",
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        double res = Calculator.Calculate(input);
        System.out.print(res != -1 ? res : "");
    }
}