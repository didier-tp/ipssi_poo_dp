package org.ipssi.tp;

import java.util.List;

import java.util.Base64;

import org.ipssi.tp.dao.DeviseDAO;
import org.ipssi.tp.dao.DeviseDaoJdbc;
import org.ipssi.tp.dao.DeviseDaoMemory;
import org.ipssi.tp.entity.Devise;
import org.ipssi.tp.service.ServiceConversion;
import org.ipssi.tp.service.ServiceConversionImpl;

public class TestApp {

	static void test_base64(){
	//Authorization: Basic dXNlcm5hbWVYOnBhc3N3b3JkWQ== 
	String texte_en_clair = "usernameX:passwordY";
	byte[] encodedBytes = Base64.getEncoder().encode(texte_en_clair.getBytes());
	                
	String texte_encode = new String(encodedBytes);
	System.out.println("texte_encodé: " + texte_encode);
	
	byte[] decodedBytes = Base64.getDecoder().decode(texte_encode.getBytes());
	System.out.println("texte_decodé " + new String(decodedBytes));
	
	}
	public static void main(String[] args) {
		test_base64();
		//ServiceConversion serviceConv = new ServiceConversionImpl();
		//récupération de l'instance du service partagé via singleton
		ServiceConversion serviceConv = ServiceConversionImpl.getInstance();
		double resConv =serviceConv.convertir(200, "EUR", "USD");
		System.out.println("resConv="+resConv);
		System.out.println("change du Yen="+serviceConv.recupererTauxChange("JPY"));
		/*
		DeviseDAO deviseDao = DeviseDaoMemory.getInstance();
		Devise deviseEuro =deviseDao.getDeviseByCode("USD");
		System.out.println(deviseEuro);
		deviseDao.createDevise(new Devise("c1","M1",1.123));
		List<Devise> listeDev= deviseDao.getAllDevises();
		for(Devise d : listeDev) {
			System.out.println("devise="+d);
		}
		DeviseDAO deviseDaoJdbc = new DeviseDaoJdbc();
		List<Devise> listeDev2= deviseDaoJdbc.getAllDevises();
		for(Devise d : listeDev2) {
			System.out.println("devise(via jdbc)="+d);
		}
		Devise deviseEuroViaJdbc =deviseDaoJdbc.getDeviseByCode("USD");
		System.out.println(deviseEuroViaJdbc);
		*/
	}

}
