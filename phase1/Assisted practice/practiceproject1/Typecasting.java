package practiceproject1;

public class Typecasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a:"+a);
		int b=a;
		System.out.println("value of b:"+b);
		float c=a;
		System.out.println("value of c:"+c);
		long d=a;
		System.out.println("value of d:"+d);
		double e=a;
		System.out.println("value of e:"+e);
		//implicit type conversion is performed without programmer's intervention
		
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		double x=45.5;
		int y=(int)x;
		System.out.println("value of x:"+x);
		System.out.println("value of y:"+y);
		//explicit type conversion is specified explicitly by programer.
		

	}

}

