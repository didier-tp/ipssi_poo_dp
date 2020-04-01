package org.ipssi.p1;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
	
	public static void m1() {
		Personne p1 = null;
		p1 = new Personne();
		p1.setNom("toto");
		System.out.println(p1.getNom());
		
		Personne p2 = new Personne("Defrance","didier",1.82);
		p2.grandir(0.05);
		System.out.println(p2.toString());
		System.out.println(p2);
		
		Employe e1 = new Employe();
		e1.setSalaireFixe(2000);
		System.out.println("salaire de e1=" + e1.getSalaireFixe());
		
		Employe e2 = new Employe("Defrance","didier",1.82,2000);
		e2.setNom("NouveauNom");
		System.out.println(e2.toString());
	}
	
	public static void m2() {
	   Personne p =null; //référence sur une personne quelconque
	   Personne p1= new Personne("Aire", "Axelle" , 1.68);
	   Employe e1=new Employe("Bon","jean",1.76,2000);
	   Commercial c1 = new Commercial("Therieur","alain",1.65);
	   c1.setSalaireFixe(2000); c1.setVentes(3000);
	   p=p1;
	   System.out.println(p.toString());
	   p=e1;
	   System.out.println(p.toString());//polymorphisme sur .toString()
	   
	   Employe refEmp = null;
	   refEmp = e1;
	   System.out.println(refEmp.getSalaire());
	   refEmp = c1;
	   System.out.println(refEmp.getSalaire());//polymorphisme sur .getSalaire()
	   
	   List<Employe> listeEmp = new ArrayList<Employe>();//liste ou collection vide au depart
	   listeEmp.add(e1);
	   listeEmp.add(c1);
	   for(Employe e : listeEmp) {
		   System.out.println("**" + e.getSalaire()); //polymorphisme en boucle
	   }
	}

	public static void main(String[] args) {
		
		//m1();
		m2();
	}

}
