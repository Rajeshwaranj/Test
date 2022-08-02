
public class constructor {
  int    Birth;
  String Name;

  public constructor(int DOB, String name) {
     Birth = DOB;
     Name  = name;
  }

  public static void main(String[] args) {
	  constructor myInfo = new constructor(2000, "J.Rajeshwaran");
    System.out.println("Hi! im " + myInfo.Name + " born in " + myInfo.Birth);
  }
}