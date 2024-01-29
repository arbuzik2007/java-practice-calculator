import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //"a <operation> b",
        String fileName = "input.txt";
        String[] input;
        input = FileSystem.ReadFile(fileName);
        if(input == null)
        {
            //console input variant
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine().split(" ");
        }
        ArrayList<String> results = new ArrayList<>();
        for(var item: input)
            results.add(item + " = " + Calculator.Calculate(item.split(" ")));
        FileSystem.WriteFile(results.toArray(new String[0]),"output.txt");
    }
}