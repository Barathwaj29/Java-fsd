package practiceproject4;

class Std{
	int id;
	String name;

	Std(int id,String name)
	{
	this.id=id;
	this.name=name;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Parameterizedconstructor {
public static void main(String[] args) {

	Std std1=new Std(2,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();
		}
}

