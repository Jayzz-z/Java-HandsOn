package Day2;



class FirstClass{
	public void First() {
		System.out.println("This is parent Class");
	}
}

class SecondClass extends FirstClass{
	public void Second() {
		System.out.println("This is child class");
	}
}
public class Qus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass obj1 = new FirstClass();
		SecondClass obj2 = new SecondClass();
		
		obj1.First();
		obj2.Second();
		obj2.First();
		
	}
}
