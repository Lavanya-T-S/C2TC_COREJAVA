package com.tns.framework;
public abstract class NormalACC extends ShopACC {
	private final float deliveryCharge=50;
	public NormalACC(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
			}
	public float getDelivaryCharges()
	{
		return deliveryCharge;
	}
	public void bookProduct(float  deliveryCharge)
	{
		
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


}




