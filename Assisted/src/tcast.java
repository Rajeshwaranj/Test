
public class tcast {
  public static void main(String[] args) {
	  
	System.out.println("Implicit type casting:");
    int a = 15;
    long b = a;     //implicit casting 
    double c = b;   // implicit casting 
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    System.out.println("Explicit type casting:");
    double d = 15.03;  
    int i = (int)d;        // Explicit casting 
    System.out.println(d);  
    System.out.println(i);
    
    
  }
}