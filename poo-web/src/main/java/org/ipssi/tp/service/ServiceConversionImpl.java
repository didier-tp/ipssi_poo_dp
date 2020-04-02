package org.ipssi.tp.service;

//1 seule instance partagée de cette classe "ServiceConversionImpl" suffit
//traitement (calculs , ...) en mode "stateless"
//si plusieurs instances inutiles : gachis de mémoire et mauvaises perf (garbage collector)
public class ServiceConversionImpl implements ServiceConversion {
//email formateur : didier@d-defrance.fr (si vous voulez m'envoyer lien slack ou autres)
	
	//code classique du "design pattern SINGLETON" sans s'appuyer sur spring:
	private static ServiceConversionImpl uniqueInstance = null;
	
	public  static ServiceConversionImpl getInstance()	{ 
		if (uniqueInstance == null) {
	         uniqueInstance = new ServiceConversionImpl();
	     }
	return uniqueInstance; // instance nouvellement ou anciennement créée .
	}
	
	private ServiceConversionImpl() {
	}

	@Override
	public double convertir(double montant, String codeSource, String codeCible) {
		return montant * 1.5;
	}

	@Override
	public double recupererTauxChange(String codeDevise) {
		return 0;
	}

}
