package org.ipssi.tp.service;

public interface ServiceConversion {
	double convertir(double montant,String codeSource , String codeCible);
	double recupererTauxChange(String codeDevise);
	//...
}
