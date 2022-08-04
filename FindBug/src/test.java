import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    	
	ArrayList<Integer> arrlist = new ArrayList<Integer>();
    ArrayList<Integer> expenses = new ArrayList<Integer>();
    expenses.add(1000);
    expenses.add(2300);
    expenses.add(45000);
    expenses.add(32000);
    expenses.add(110);
    expenses.addAll(arrlist);
    System.out.println(arrlist);
    System.out.println(expenses);
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value to add your Expense: \n");
    int value = sc.nextInt();
    expenses.add(value);
    System.out.println("Your value is updated\n");
    expenses.addAll(arrlist);
 
    System.out.println(arrlist);
    System.out.println(expenses);
	
	
}}
