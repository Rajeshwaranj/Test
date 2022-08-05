package phase1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileread
{
  public static void fileRead() throws FileNotFoundException
  {
    // pass the path to the file as a parameter
	System.out.print("--> Enter the file name to be read");
	Scanner fn = new Scanner(System.in);
    String namef = fn.nextLine();
    File filename = new File("c:\\MPH\\");
    File filename1= new File(filename + "\\" +namef);
    Scanner sc = new Scanner(filename1);
    System.out.println("------------------------------------------------------");
  try
  {
	if (sc.hasNextLine())
	
		 System.out.println("|"+sc.nextLine()+"|");
  }
	catch(Exception e)
	{
		System.out.println("No such file found");
	}
	
  System.out.println("------------------------------------------------------");
      
  }
   	
}