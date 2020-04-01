package org.ipssi.p1;

//classe abstraite (partiellement programmée)
public abstract class ChoseAvecCouleur {
	
	private String couleur = "black";
	
	public abstract void afficherAvecCouleur();//sera codé dans sous classe(s)

	public ChoseAvecCouleur() {
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}
