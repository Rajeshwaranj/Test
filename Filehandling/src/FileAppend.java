import java.io.*;

public class FileAppend {
  public static void main(String[] args) {
    //file name with path
    String strFilePath = "newfile.txt";

    try {
      //file output stream to open and write data
      FileOutputStream fos = new FileOutputStream(strFilePath, true);

      //string to be appended
      String strContent = "appended testing";

      //appending text/string
      fos.write(strContent.getBytes());

      //closing the file
      fos.close();
      System.out.println("Content Successfully Append into File...");
    } catch (FileNotFoundException ex) {
      System.out.println("FileNotFoundException : " + ex.toString());
    } catch (IOException ioe) {
      System.out.println("IOException : " + ioe.toString());
    } catch (Exception e) {
      System.out.println("Exception: " + e.toString());
    }
  }
}
