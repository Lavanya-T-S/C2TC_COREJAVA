package keyword;

public class student1 {
	int rollno;
	String name;
	static String college = "ITS";
	student1(int r ,String n){
		rollno = r;
		name=n;
	}
	static void change() {
		college= "BBDIT";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
		public static void main(String[] args) {
			Student s1= new Student(111,"karan");
			Student s2= new Student(222,"aryan");
			change();
			s1.display();
			s2.display();
			
	}
}
