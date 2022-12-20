package com.tns.application;
import com.tns.framework.NormalACC;
import com.tns.framework.PrimeACC;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
	PrimeACC acc1;
	NormalACC acc2;
		@Override
		public PrimeACC getNewPrimeAccount(int AccNo, String accNm, Float charges, Boolean isPrime) 
		{
			acc1=new GSPrimeACC(AccNo,accNm,charges,isPrime);
			return acc1;
		}

		@Override
		public NormalACC getNewNormalAccount(int AccNo, String accNm, Float charges)
		{
			acc2=new GSNormalACC(AccNo,accNm,charges);
			return acc2;
		
	    }

}
