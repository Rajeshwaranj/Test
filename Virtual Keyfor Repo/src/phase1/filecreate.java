package phase1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class filecreate {
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
		System.out.println("New File Added");
	}
	else {
		System.out.println("file created");
	}
	}
	

}
