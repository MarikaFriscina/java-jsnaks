package jsnaks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {
		/*Il software deve chiedere per 5 volte all’utente di inserire un numero.
		Il programma stampa la somma di tutti i numeri inseriti.
		Esegui questo programma in due versioni, con il for e con il while.*/
		
		Scanner scan= new Scanner(System.in);
		
		int num=0;
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Dimmmi un numero: ");
			num += scan.nextInt();
		}
		
		System.out.println("La somma dei numeri selezionati è: "+ num);
		
		scan.close();
	}

}
