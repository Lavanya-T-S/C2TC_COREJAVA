package constructor;

public class Employeee {
	int id;
	String name;
	float Salary;
	Employeee(int id ,String name ,float salary){
		System.out.println("user defined no-argumnet  "+ "constructor executed ");
	}
	void display () {
		System.out.println(id + " "+ name+ " "+ Salary);
	}
}
 public  class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee e1 = new Employeee(101,"ajeeth",60000);
		Employeee e2 = new Employeee(102,"ajay",50000);
		Employeee e3 = new Employeee(101,"rakshi",70000);
		e1.display();
		e2.display();
		e3.display();
		
		

	}

}
