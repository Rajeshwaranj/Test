
//single lvl

class Kmph{
	int speed = 150;
}
class CB300 extends Kmph{
	int speed=150;
	void FullSpeed() {
		System.out.println(speed+5 +"Kmph");
	}
}	

public class inheritence{
	public static void main (String[] args) {
		
		CB300 cb=new CB300();
		System.out.println("Top speed of CB300 is");
		cb.FullSpeed();
		
	}
    }


