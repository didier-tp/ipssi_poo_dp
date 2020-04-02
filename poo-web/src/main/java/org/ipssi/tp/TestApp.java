package org.ipssi.tp;

import org.ipssi.tp.dao.DeviseDAO;
import org.ipssi.tp.dao.DeviseDaoMemory;
import org.ipssi.tp.entity.Devise;
import org.ipssi.tp.service.ServiceConversion;
import org.ipssi.tp.service.ServiceConversionImpl;

public class TestApp {



	public static void main(String[] args) {
		//ServiceConversion serviceConv = new ServiceConversionImpl();
		//récupération de l'instance du service partagé via singleton
		ServiceConversion serviceConv = ServiceConversionImpl.getInstance();
		double resConv =serviceConv.convertir(200, "EUR", "USD");
		System.out.println("resConv="+resConv);
		
		DeviseDAO deviseDao = new DeviseDaoMemory();
		Devise deviseEuro =deviseDao.getDeviseByCode("EUR");
		System.out.println(deviseEuro);
	}

}
