package iostreams;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
public class FileDisplay{
  public  void fileDisplay() {
    //Creating a File object for directory
    File directoryPath = new File("c:\\MPH\\");
    //Creating filter for directories files
    FileFilter fileFilter = new FileFilter(){
         public boolean accept(File dir) {          
            if (dir.isFile()) {
               return true;
            } else {
               return false;	
            }
         }
      };        
      File[] list = directoryPath.listFiles(fileFilter);
      System.out.println("List of the files in the specified directory:");  
      for(File fileName : list) {
         System.out.println(fileName);
      }  
   }
}







































//public class FileDisplay 
//{
//	 String maindirpath = "c:\\MPH\\";
//     File maindir = new File(maindirpath);
//
// if (maindir.exists() && maindir.isDirectory()) {
//      
//      
//     File arr[] = maindir.listFiles();
//
//     System.out.println(
//         "**********************************************");
//     System.out.println(
//         "Files from main directory : " + maindir);
//     System.out.println(
//         "**********************************************");
//
//     
//     RecursivePrint(arr, 0, 0);
//    static void RecursivePrint(File[] arr, int index, int level)
//    {
//        
//        if (index == arr.length)
//            return;
// 
//       
//        for (int i = 0; i < level; i++)
//            System.out.print("\t");
// 
//        // for files
//        if (arr[index].isFile())
//            System.out.println(arr[index].getName());
// 
//        
//        else if (arr[index].isDirectory()) {
//            System.out.println("[" + arr[index].getName()
//                               + "]");
// 
//            
//            RecursivePrint(arr[index].listFiles(), 0,
//                           level + 1);
//        }
// 
//        
//        RecursivePrint(arr, ++index, level);
//    }
// 
//  
//        }
//    
// }
