package org.ipssi.p2;

public class TestApp2 {


	public static void main(String[] args) {
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
