

class Car{
	   public Car()
	   {
		System.out.println("Class Car");
	   }
	   public void EngineType()
	   {
		System.out.println("Engine Type:4B11T 2.0L (1998cc) turbocharged ");
	   }
	}
	class LancerEVO extends Car{
	   public LancerEVO()
	   {
		System.out.println("Class LancerEVO X");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Mitsubishi");
	   }
	   public void speed()
	   {
		System.out.println("Max: 399Kmph");
	   }
	}
	public class multilvlinheritence extends LancerEVO  {

	    public void brand()
	   {
		System.out.println("EVO X 4G63");
	   }
	   public void speed()
	   {
		System.out.println("Max: 399Kmph");
	   }
	   public static void main(String args[])
	   {
		   multilvlinheritence obj=new multilvlinheritence();
		 obj.EngineType();
		 obj.brand();
		 obj.speed();
	   }
	}