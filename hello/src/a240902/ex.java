package a240902;

class FirstClass{
	
	int a = 10;
	
	public void PrintA() {
		System.out.println("객체 안 a값은 : "+a);
	}
}

public class ex {
	public static void main(String[] args) {
		
		FirstClass c = new FirstClass();
		c.PrintA();
		
		FirstClass d = new FirstClass();
		d.a = 20;
		d.PrintA();
		
		c.PrintA();
	}
}
