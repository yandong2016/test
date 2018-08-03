package test;

public class Test {

	private String name;
	    private String address;
	    private int number;

	    public Employee(String name, String address, int number) {
	      System.out.println("Constructing an Employee");
	      this.name = name;
	      this.address = address;
	      this.number = number;
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
		System.out.println("you know nothing");
	}

}
