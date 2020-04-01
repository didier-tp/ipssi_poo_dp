package org.ipssi.p1;

public class TestApp {

	public static void main(String[] args) {
		Personne p1 = null;
		p1 = new Personne();
		p1.setNom("toto");
		System.out.println(p1.getNom());
		
		Personne p2 = new Personne("Defrance","didier",1.82);
		p2.grandir(0.05);
		System.out.println(p2.toString());
		System.out.println(p2);
	}

}
