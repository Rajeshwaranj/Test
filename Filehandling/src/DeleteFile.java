import java.io.File;
 
public class DeleteFile {
 
    public static void main(String[] args) {
        //absolute file name with path
        File file = new File("newfile.txt");
        if(file.delete()){
            System.out.println("File deleted");
        }else System.out.println("File doesn't exists");
    }
}