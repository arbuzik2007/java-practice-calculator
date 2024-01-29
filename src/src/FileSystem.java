import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSystem {
    static String[] ReadFile(String fileName){
        ArrayList<String> res = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                res.add(sc.nextLine());
            }
            return res.toArray(new String[0]);
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    static void WriteFile(String result, String outputDir){

        try(FileOutputStream fos=new FileOutputStream(outputDir);
            PrintStream printStream = new PrintStream(fos))
        {
            printStream.println(result);
            System.out.println("Запись в файл произведена");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void WriteFile(String[] results, String outputDir){

        try(FileOutputStream fos=new FileOutputStream(outputDir);
            PrintStream printStream = new PrintStream(fos))
        {
            printStream.println(String.join("\n", results));
            System.out.println("Запись в файл произведена");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
