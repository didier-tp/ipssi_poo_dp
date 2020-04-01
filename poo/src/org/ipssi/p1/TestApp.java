package org.ipssi.p1;

public class TestApp {

	public static void main(String[] args) {
		Personne p1 = null;
		p1 = new Personne();
		p1.setNom("toto");
		System.out.println(p1.getNom());

	}

}
