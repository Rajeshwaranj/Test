package iostreams; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
 
public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        
        FileCreate cr =  new FileCreate();
		FileDelete del = new FileDelete();
		FileDisplay dis= new FileDisplay();
		FileSearch sea = new FileSearch();
		FileWrite wrt =  new FileWrite();

        int choice;
        do{
            System.out.println("File Handling operations Main Menu\n");
            System.out.print("1.) File Addition. \n");
            System.out.print("2.) File Deletion.\n");
            System.out.print("3.) File Searching.\n");
            System.out.print("4.) File Display.\n");
            System.out.print("5.) File Writing \n");
            System.out.print("6.) Exit Operation\n");
            
            System.out.print("***********************************");
            
            System.out.print("\nEnter Your Menu Choice of operation: \n ");
           
            System.out.println("***********************************");
            
            choice = input.nextInt();


        }

        while(choice >7);

        switch(choice){

        case 1:
        	 cr.fileCreate();
            
            break;

        case 2: 
           del.fileDelete();
            break;

        case 3:
            sea.fileSearch();
            break;

        case 4: 
             dis.fileDisplay();
            break;
          
        case 5: 
            wrt.fileWrite();
           break;

        case 6: 
            System.out.println("Exiting Program...");
            System.exit(0);
             break;
        }



        // Bad Menu Option Direct
    if (choice > 6 || choice < 1){
        System.out.println("This is not a valid Menu Option! Please Select Another.");
        do{
            choice = input.nextInt();
        }
        while(choice < 7 );
    }
    // End bad menu option  


    }}

























































































































//package iostreams;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class main
//{
//	public static void main (String[] args) throws IOException
//	{
//		Scanner in=new Scanner(System.in);
//		int opt=in.nextInt();
//		FileCreate cr = new FileCreate();
//		FileDelete del = new FileDelete();
//		FileDisplay dis= new FileDisplay();
//		FileSearch sea = new FileSearch();
//		
//        label: while(true) {
//        	System.out.println("Enter your desired operation");
//        	System.out.println("1.create \n 2.delete \n 3.display \n 4.search ");
//        }
//		
//		if(opt==1) 
//		{
//			cr.fileCreate();
//	     }
//		else if(opt==2) 
//		{
//			cr.fileCreate();
//	     }
//		else if(opt==3) 
//		{
//			dis.fileDisplay();
//	     }
//		else if(opt==4) 
//		{
//			sea.fileSearch();
//	     }
//		}
//	}
