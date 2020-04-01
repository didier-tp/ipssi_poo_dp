package org.ipssi.p1;

public class LivretA {
	public static final double TAUX_PAR_DEFAUT = 0.005;
	private Integer numero;
	private Double solde;
	private static Double tauxInteret = TAUX_PAR_DEFAUT;
	
	
	@Override
	public String toString() {
		return "LivretA [numero=" + numero + ", solde=" + solde + "] " + tauxInteret;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	public static Double getTauxInteret() {
		return tauxInteret;
	}
	public static void setTauxInteret(Double tauxInteret) {
		LivretA.tauxInteret = tauxInteret;
	}
	
	

}
