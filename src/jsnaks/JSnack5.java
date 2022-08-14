package jsnaks;

import java.util.Scanner;

public class JSnack5 {

	public static void main(String[] args) {
		/*La distanza di Hamming tra due stringhe di uguale lunghezza è il numero
		di posizioni nelle quali i caratteri corrispondenti sono diversi.
		Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dimmi una parola:");
		String p1= scan.nextLine();
		System.out.println("Dimmi un'altra parola:");
		String p2= scan.nextLine();
		
		
		//controllare se la lunghezza delle parole è uguale
		//se la lunghezza è uguale creare due array di char e dargli p1.tochararray per trasformae le lezzere di p1 in componenti di array di caratteri singoli 
		//fare lo stesso con p2
		//creo un int distanzahamming e la setto a 0
		//per ogni carattere di p1array controllo se p1array[i] è uguale a p2array[i]		
		//se non  uguale allora disth fa +1

		if(p1.length()==p2.length()) {
			char[] parola1= p1.toCharArray();
			char[] parola2= p2.toCharArray();
			
			int distH=0;
			
			for (int i=0; i<parola1.length; i++) {
				if(parola1[i]!=parola2[i]) {
					distH++;					
				}
			}
			System.out.println("La distanza di Hamming tra le due parole è:" + distH);
		}else {
			System.out.println("Hai scelto parole di lunghezza diversa.");
		}
		
		
		scan.close();
	}

}
