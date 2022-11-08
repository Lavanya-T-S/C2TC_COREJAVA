package extend;

public abstract class Bikes {
	Bikes()
	{
		System.out.println("bikes is created");
		
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Honda extends Bikes{
	void run() {
		System.out.println("running safely");
	}
}
	class Ddemo{
	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		h.changeGear();

	}

}
