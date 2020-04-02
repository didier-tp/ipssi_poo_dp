package org.ipssi.tp.service;

import org.ipssi.tp.dao.DeviseDAO;
import org.ipssi.tp.dao.DeviseDaoFactory;
import org.ipssi.tp.dao.DeviseDaoMemory;
import org.ipssi.tp.entity.Devise;

//1 seule instance partagée de cette classe "ServiceConversionImpl" suffit
//traitement (calculs , ...) en mode "stateless"
//si plusieurs instances inutiles : gachis de mémoire et mauvaises perf (garbage collector)
public class ServiceConversionImpl implements ServiceConversion {
//email formateur : didier@d-defrance.fr (si vous voulez m'envoyer lien slack ou autres)
	
	//code classique du "design pattern SINGLETON" sans s'appuyer sur spring:
	private static ServiceConversionImpl uniqueInstance = null;
	
	//private DeviseDAO deviseDao = DeviseDaoMemory.getInstance();//V1
	
	//via la favrique qui créer et retourner le dao en version Memory ou jdbc
	private DeviseDAO deviseDao = DeviseDaoFactory.createDeviseDao();
	
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
		Devise deviseSource = this.deviseDao.getDeviseByCode(codeSource);
		Devise deviseCible = this.deviseDao.getDeviseByCode(codeCible);
		return montant * deviseCible.geteChange() / deviseSource.geteChange();
	}

	@Override
	public double recupererTauxChange(String codeDevise) {
		Devise d = this.deviseDao.getDeviseByCode(codeDevise);
		return d.geteChange();
	}

}
