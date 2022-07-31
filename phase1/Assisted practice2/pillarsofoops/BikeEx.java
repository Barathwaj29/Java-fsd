package pillarsofoops;
class Bike{
	int speed=200;
}
class R15 extends Bike{
	int speed=300;
	void speedOfR15() {
		System.out.println(speed+120);
	}
}


public class BikeEx {
public static void main(String[] args) {
	R15 r15=new R15();
	r15.speedOfR15();
}
}
