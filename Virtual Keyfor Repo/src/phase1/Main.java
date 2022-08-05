package phase1;
import java.lang.module.ModuleDescriptor.Exports;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) throws Exception {
       
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheAppliaction \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    
    //Menu optionSelection() Start
    private static void optionsSelection() throws Exception {
        String[] arr = {"1. I wish to Add file",
                "2. I wish to Delete a file",
                "3. I wish to Search for a particular file",
                "4. I wish to Read a particular file",
                "5. I wish to Display a list of all available files",
                "6. I wish display  files in sorted manner",
                "7. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6,7};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
           
      //Menu ptionSelection() end
        }
        filecreate cr = new filecreate();
        filedelete del = new filedelete();
        fileread rd = new fileread();
        filedisplay dis = new filedisplay();
        filesearch srh = new filesearch();
        filesort srt = new filesort();
        
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                    	 cr.fileCreate();
                    	 System.out.println("\n**************************************\n");
                        optionsSelection();
                        break;
                    case 2:
                    	del.fileDelete();
                    	 System.out.println("\n**************************************\n");
                        optionsSelection();
                        break;
                    case 3:
                    	srh.fileSearch();
                    	 System.out.println("\n**************************************\n");
                        optionsSelection();
                        break;
                    case 4:
                    	rd.fileRead();
                        optionsSelection();
                        System.out.println("\n**************************************\n");
                        break;
                    case 5:
                    	 dis.fileDisplay();
                    	 System.out.println("\n**************************************\n");
                        optionsSelection();
                        break;
                    case 6:
                        srt.fileSort();
                   	     System.out.println("\n**************************************\n");
                         optionsSelection();
                        break;
                    case 7:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }

}