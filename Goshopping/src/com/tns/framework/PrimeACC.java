package com.tns.framework;
public abstract class PrimeACC extends ShopACC {
	private boolean isPrime;
	private static final float delivaryCharges=0;
	
	public PrimeACC(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	public float getDelivaryCharges()
	{
		return delivaryCharges;
	}
	public void bookProduct(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime() + ", accNo=" + accNo + ", accNm=" + accNo + ", charges=" + charges
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}


}
