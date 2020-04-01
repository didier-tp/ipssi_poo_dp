package org.ipssi.p1;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
	
	public static void m1() {
		Personne p1 = null;
		p1 = new Personne();
		p1.setNom("toto");
		System.out.println(p1.getNom());
		
		try {
			p1.setTaille(150.0);
			System.out.println("taille 1="+p1.getTaille());
			p1.setTaille(-50.0);
			
		} catch (MyException e) {
			e.printStackTrace();
		}finally {
			System.out.println("taille 2="+p1.getTaille());
		}
		
		System.out.println("p1="+p1.toString());
		
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
	
	public static void m3() {
		LivretA l1 = new LivretA();
		l1.setNumero(1);l1.setSolde(200.0);
		System.out.println(l1);
		
		LivretA l2 = new LivretA();
		l2.setNumero(2);l2.setSolde(300.0);
		System.out.println(l1);
		
		LivretA.setTauxInteret(0.001);
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println("taux par defaut pour livretA="+LivretA.TAUX_PAR_DEFAUT);
		
		System.out.println(Math.abs(-5));
		
	}
	
	public static void m4() {
		Affichable choseAffichable = null;
		
		Personne p1 = new Personne("Aire", "Axelle" , 1.68);
		
		LivretA l1 = new LivretA();
		l1.setNumero(1);l1.setSolde(200.0);
		
		choseAffichable = p1;
		choseAffichable.afficher();
		
		choseAffichable = l1;
		choseAffichable.afficher();
		
		//ChoseAvecCouleur c = new ChoseAvecCouleur(); //new direct sur classe abstraite
		ChoseAvecCouleur c = new LivretA();
		c.setCouleur("red");
		c.afficherAvecCouleur();
	}
	

	public static void main(String[] args) {
		/*TestApp testApp1 = new TestApp(); 
		testApp1.m3(); // si m3() n'est pas static
		*/
		//m3();
		//m1();
		//m2();
		m4();
	}

}
