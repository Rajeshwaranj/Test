

class Bike{
	int speed=200;
	void display() {
		System.out.println("this is a bike");
	}
}
class R15 extends Bike{
	int speed=300;
	void speedOfR15() {
		System.out.println(speed+120);
	}
}
class YamahanewR15 extends R15{
	void speedofnewR15() {
		System.out.println(speed+200);
	}
}


public class mulinherit {
public static void main(String[] args) {
	YamahanewR15 r15=new YamahanewR15();
	r15.speedofnewR15();
	r15.display();

}
}
