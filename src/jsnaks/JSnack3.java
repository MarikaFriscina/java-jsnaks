package jsnaks;

import java.util.Random;

public class JSnack3 {

	public static void main(String[] args) {
		/*Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
		lista di cognomi, genera una falsa lista di 3 invitati.*/
		
		String[] nomi={"Lucia", "Paolo", "Daniele"};
		String[] cognomi={"Rossi", "Bianchi", "Verdoni"};
		String[] invitati= new String[3];
		
		Random r= new Random();
		for(int i=0;i<nomi.length;i++) {
			
			int n =r.nextInt(nomi.length);				
			int c=r.nextInt(cognomi.length);
			invitati[i]=(nomi[n]+ " "+ cognomi[c]);
			System.out.println(invitati[i]);
		}
		
		

		
	}

}
