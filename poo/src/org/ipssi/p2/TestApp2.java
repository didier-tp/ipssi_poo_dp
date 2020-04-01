package org.ipssi.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestApp2 {


	public static void main(String[] args) {
		//m1();
		m2();
	}
	public static void m2() {
		List<Integer> listeInt = new ArrayList<>();
		listeInt.add(6); listeInt.add(3); listeInt.add(7); listeInt.add(2);
		System.out.println(listeInt);
		Collections.sort(listeInt);
		System.out.println(listeInt);
	}
	
	public static void m1() {
		MyStack<String> pileChaines = new MyStack<>();
		pileChaines.push("ch1");pileChaines.push("ch2");pileChaines.push("ch3");
		System.out.println(pileChaines.pop());
		System.out.println(pileChaines.pop());
		System.out.println(pileChaines.pop());
		
		MyStack<Assiette> pileAssiettes = new MyStack<>();
		for(int i=1;i<=3;i++) {
		    pileAssiettes.push(new Assiette("blanche",i));
		}
		Assiette a = null;
		do {
			a = pileAssiettes.pop();
		    System.out.println(a);
		}while(a!=null);
		
	}

}
