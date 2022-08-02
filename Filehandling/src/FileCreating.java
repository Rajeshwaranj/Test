import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class FileCreating {
 


	public static void main(String[] args) {
        String content = "Rajeshwaran";
        System.out.println("File Created");

        try {
            Files.write(Paths.get("newFile.txt"), content.getBytes());
        
        } catch (IOException e) 
        {
            e.printStackTrace();
        }

    }
        
}
