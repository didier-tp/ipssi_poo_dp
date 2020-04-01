package org.ipssi.p1;

public class Commercial extends Employe{
	private Integer ventes=0;
	private Double tauxCommission=0.01;
	
	@Override
	public Integer getSalaire() {
		//Integer baseSalaire = super.getSalaire();
		//Integer baseSalaire = this.getSalaireFixe();
		Integer baseSalaire = this.salaireFixe; //ok si protected dans classe Employe
		return (int) Math.floor(baseSalaire + ventes * tauxCommission);
	}
	
	public Commercial() {
		super();
	}
	public Commercial(String nom, String prenom, Double taille) {
		super(nom, prenom, taille);
	}
	
	@Override
	public String toString() {
		return "Commercial [ventes=" + ventes + ", tauxCommission=" + tauxCommission + "]"
				+ super.toString();
	}
	public Integer getVentes() {
		return ventes;
	}
	public void setVentes(Integer ventes) {
		this.ventes = ventes;
	}
	public Double getTauxCommission() {
		return tauxCommission;
	}
	public void setTauxCommission(Double tauxCommission) {
		this.tauxCommission = tauxCommission;
	}
	
	
}
