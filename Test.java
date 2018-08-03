package test;

public class Test {

	private String name;
	private String email

	public Employee(String name, String email) {
	    System.out.println("Constructing an Employee");
	    this.name = name;
	    this.email = email;
	}

	public void mailCheck() {
	    System.out.println("Mailing a check to " + this.name + " " + this.address);

	public String toString() {
    	return name + " " + address + " " + number;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int c = a + b;
		System.out.println("The sum is " + c);
		//this is update1
		a = 20;
		b = 100;
		System.out.println("The sum is " + a+b);
		//this is update2
		int d = a + a + b;
		System.out.println("how are you doing");
	}

}
