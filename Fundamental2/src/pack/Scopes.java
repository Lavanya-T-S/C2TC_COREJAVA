package pack;

public class Scopes {

	public static void main(String[] args) {
		int outer=3000;
		{
			int inner=4000;
			System.out.println("outer");
			System.out.println("inner");
	
		}
	}

}
