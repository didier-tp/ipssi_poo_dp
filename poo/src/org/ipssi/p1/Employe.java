package org.ipssi.p1;

public class Employe extends Personne {
	
	protected Integer salaireFixe;
	
	public Integer getSalaire() {
		return this.salaireFixe;
	}
	
	@Override
	public String toString() {
		return "Employe heritant de " + super.toString()
		       + " avec salairefixe=" + this.salaireFixe;
	}

	public Employe() {
		super();//réappel un constructeur de la super classe
	}

	public Employe(String nom, String prenom, Double taille) {
		super(nom, prenom, taille);
	}
	
	public Employe(String nom, String prenom, Double taille,Integer salaireFixe) {
		super(nom, prenom, taille);
		this.salaireFixe = salaireFixe;
	}

	public Employe(Integer salaireFixe) {
		super();
		this.salaireFixe = salaireFixe;
	}

	public Integer getSalaireFixe() {
		return salaireFixe;
	}

	public void setSalaireFixe(Integer salaireFixe) {
		this.salaireFixe = salaireFixe;
	}
	
	
}
