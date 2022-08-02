package iostreams;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSearch
{
	public void fileSearch() {
	
	String path="c:\\MPH\\";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the filename to search");
	String filename=sc.next();
	File f=new File(path);
	//display operation
	int flag=0;
	File filenames[]=f.listFiles();
	for(File ff:filenames) {
		if(ff.getName().equals(filename)) {
			flag=1;
			break;
		}
		else {
			flag=0;
		}
	
	}
	
	
	if(flag==1) {
		System.out.println("file is found");
	}
	else {
		System.out.println("file is not found");
	}
	}
}
