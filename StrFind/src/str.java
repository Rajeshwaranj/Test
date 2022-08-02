
public class str {  
    public static void main(String[] args) {  
        String[] strArray = { "rajesh", "yash", "aarif","mritesh" };  
        
        boolean x = false; 
        
        int index= 0; 
        
        String s = "rajesh";  // to be searched  
        
        for (int i = 0; i < strArray.length; i++) {  
            if(s.equals(strArray[i])) {  
                index = i; x = true; break;  
            }  
        }  
        if(x)  
            System.out.println(s +" String is found at index :"+index);  
        else  
            System.out.println(s +" String is not found in the array");  
    }  
}  