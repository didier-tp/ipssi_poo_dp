package org.ipssi.tp.dto;

public class ResConv {

	private double montant;
	private String source;
	private String cible;
	private double montantConverti;
	
	
	@Override
	public String toString() {
		return "ResConv [montant=" + montant + ", source=" + source + ", cible=" + cible + ", montantConverti="
				+ montantConverti + "]";
	}
	public ResConv() {
		super();
	}
	public ResConv(double montant, String source, String cible, double montantConverti) {
		super();
		this.montant = montant;
		this.source = source;
		this.cible = cible;
		this.montantConverti = montantConverti;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCible() {
		return cible;
	}
	public void setCible(String cible) {
		this.cible = cible;
	}
	public double getMontantConverti() {
		return montantConverti;
	}
	public void setMontantConverti(double montantConverti) {
		this.montantConverti = montantConverti;
	}

	
	
}
