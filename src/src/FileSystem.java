import java.io.File;
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
}
