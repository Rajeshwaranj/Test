package iostreams;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDelete {
	public static void fileDelete() {
	
	String path="c:\\MPH\\";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the filename");
	String filename=sc.next();
	String finalpath=path+filename;
	File f=new File(finalpath);
	//delete operation
	f.delete();
	System.out.println("file gets deleted");
	}

}
