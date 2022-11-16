package constructor;

public class Employee {
	int id;
	String name;
	float Salary;
	Employee(){
		System.out.println("user defined no-argumnet  "+ "constructor executed ");
	}
	void display () {
		System.out.println(id + " "+ name+ " "+ Salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.id=1;
		e1.name="lavanya";
		e1.Salary=70;
		Employee e2 = new Employee();
		e2.id= 2;
		e2.name= "kusu";
		e2.Salary=5000;
		
		e1.display();
		e2.display();
		
		

	}

}
