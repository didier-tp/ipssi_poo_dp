package org.ipssi.p1;

//classe concrète
public class Personne /*extends Object */ implements Affichable {
	private String nom;
	private String prenom;
	private Double taille; // ex: 1.80 pour 1m80 ou null
	
	
	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, Double taille) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.taille = taille;
	}
	
	
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", taille=" + taille + "]";
	}
	
	public void grandir(double delta) {
		this.taille = this.taille + delta;
		//taille = taille + delta;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Double getTaille() {
		return taille;
	}
	public void setTaille(Double taille) throws MyException{
		if(taille <0)
			//throw new IllegalArgumentException("taille negative invalide");
			throw new MyException("taille negative invalide");
		this.taille = taille;
	}

	@Override
	public void afficher() {
		System.out.println("Personne , details ="+this.toString());
	}

	@Override
	public void afficherV2(String prefixe) {
		System.out.println( prefixe + " details ="+this.toString());
	}

	
	
}
