package object;

public class cricketer {
	String name="Dhoni";
	int age=40;
	String color="red";
	String role="Batsman";
	String nationality="Indian";
	void Display() {
		System.out.println("I love cricket");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		cricketer c=new cricketer();
		c.Display();
		System.out.println("main method ended ");

	}

}
