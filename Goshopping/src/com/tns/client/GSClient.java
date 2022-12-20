package com.tns.client;
import com.tns.application.GSNormalACC;
import com.tns.application.GSPrimeACC;
import com.tns.application.GSShopFactory;

public class GSClient {
	public static void main(String[] args) {
		GSShopFactory factory=new GSShopFactory();
		GSNormalACC gsn=(GSNormalACC)factory.getNewNormalAccount(1212, "Vasudeva", 600.00f);
		gsn.bookProduct(gsn.getCharges());
		GSPrimeACC gsp=(GSPrimeACC) factory.getNewPrimeAccount(12122, "Ravindra", 500.00f, true);
		gsp.bookProduct(gsp.getCharges());
	}


}

