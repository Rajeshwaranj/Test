import java.io.File;
import java.util.Scanner;
 
public class FileReading {
 
    public static void main(String[] args) throws Exception {
        
        // pass the path of file
        File file = new File("newfile.txt");
        Scanner sc = new Scanner(file);
 
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}