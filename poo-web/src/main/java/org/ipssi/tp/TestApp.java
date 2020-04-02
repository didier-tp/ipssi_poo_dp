package org.ipssi.tp;

import java.util.List;

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
		
		DeviseDAO deviseDao = DeviseDaoMemory.getInstance();
		Devise deviseEuro =deviseDao.getDeviseByCode("USD");
		System.out.println(deviseEuro);
		deviseDao.createDevise(new Devise("c1","M1",1.123));
		List<Devise> listeDev= deviseDao.getAllDevises();
		for(Devise d : listeDev) {
			System.out.println("devise="+d);
		}
	}

}
