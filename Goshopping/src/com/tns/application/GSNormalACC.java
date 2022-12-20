package com.tns.application;
import com.tns.framework.NormalACC;

public class GSNormalACC extends NormalACC {
	public GSNormalACC(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("dear Normal user,Your charges are"+charges+"with delivary charges is :"+getDelivaryCharges());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
