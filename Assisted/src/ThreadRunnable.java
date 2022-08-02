
class ThreadRunnable implements Runnable{  
public void run()
{  
	System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
	ThreadRunnable m1=new ThreadRunnable();
	Thread t1 =new Thread(m1); 
	t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
	t1.start();  
 }  
}  