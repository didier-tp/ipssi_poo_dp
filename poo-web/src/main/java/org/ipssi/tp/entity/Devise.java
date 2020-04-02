package org.ipssi.tp.entity;

public class Devise {
	
	private String code; //"EUR" , "USD" , "GBP" , "JPY"
	private String nom; //"euro" , "dollar" , "livre" , "yen"
	private Double eChange; //nb ... pour 1 euro

	public Devise() {
	}
	
	
	public Devise(String code, String nom, Double eChange) {
		super();
		this.code = code;
		this.nom = nom;
		this.eChange = eChange;
	}



	@Override
	public String toString() {
		return "Devise [code=" + code + ", nom=" + nom + ", eChange=" + eChange + "]";
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double geteChange() {
		return eChange;
	}

	public void seteChange(Double eChange) {
		this.eChange = eChange;
	}
	
	

}
