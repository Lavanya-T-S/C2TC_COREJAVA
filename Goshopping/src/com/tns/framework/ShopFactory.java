package com.tns.framework;

public abstract class ShopFactory {
	public abstract PrimeACC getNewPrimeAccount(int AccNo, String accNm, Float charges, Boolean isPrime) ;
	public abstract NormalACC getNewNormalAccount(int AccNo, String accNm, Float charges);


}



