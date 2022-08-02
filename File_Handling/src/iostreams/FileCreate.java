package iostreams;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
	public static void fileCreate() throws IOException {
	String path="c:\\Mph\\";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the filename");
	String filename=sc.next();
	String finalpath=path+filename;
	File f=new File(finalpath);
	
	//create a new file
	boolean b=f.createNewFile();

	if(b!=true) {
		System.out.println("file not created");
	}
	else {
		System.out.println("file created");
	}
	}
	
//	public void FileCreate() {
//		// TODO Auto-generated method stub
//		
//	}

}

