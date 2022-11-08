package extend;

public abstract  class Bank {
	abstract int rateOfInterest();
}
class SBI extends Bank{
	int rateOfInterest() {
		return 7;
	}
}
	class HDFC extends Bank{
		int rateOfInterest() {
			return 8;
		}
	}
	class Deemo{
	public static void main(String[] args) {
		SBI s=new SBI();
		HDFC h=new HDFC();
		h.rateOfInterest();
		System.out.println("The Rate of interest in SBI" +s.rateOfInterest());
		System.out.println("The Rate of interest in HDFC" +h.rateOfInterest());
	}

}
