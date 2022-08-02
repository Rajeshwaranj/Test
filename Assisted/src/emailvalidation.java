//Array implementation and email validation

import java.util.regex.*;    
import java.util.*;    
public class emailvalidation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  //array list implement
        emails.add("rajesh@gmail.com");  
        emails.add("yash@gmail.com");  
        emails.add("mrithesh@gmail.com");  
        emails.add("xyz");  
        emails.add("aarif@gmail.com"); 
        emails.add("ABC");
        emails.add("ravi@gmail.com");  
       
        //validation using regex pattern finder
        
        String regex = "(.+)@(.+)";  
         
        Pattern pattern = Pattern.compile(regex);  
        
        for(String email : emails){  
            
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +":"+ matcher.matches());  
        }  
    }  
}  