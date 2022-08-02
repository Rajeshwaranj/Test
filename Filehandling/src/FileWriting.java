
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
 
public class FileWriting {
    public static void main(String arg[]) {
    	String path="c:\\MPH\\";
    	File directoryPath = new File("c:\\MPH\\");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Write something onto the file");
    	String content = sc.nextLine();
        String fileContent = content;
 
        try {
        	Scanner file =new Scanner(System.in);
        	System.out.println("Enter the file to perform write operation");
        	String Filename = sc.nextLine();
            Path path = Paths.get(Filename);
            Files.write(path, fileContent.getBytes());
            System.out.println("Write Job done;)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




















//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
// 
//public class FileWriting {
//    public static void main(String arg[]) {
// 
//        String fileContent = "Hello ";
// 
//        try {
//            Path path = Paths.get("newfile.txt");
//            Files.write(path, fileContent.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}