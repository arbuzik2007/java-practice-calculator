import java.io.*;
import java.util.Scanner;

public class FileSystem {
    static String[] ReadFile(String fileName){
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            if (sc.hasNextLine()) {
                return sc.nextLine().split(" ");
            }
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
}
