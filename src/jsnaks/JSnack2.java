package jsnaks;

import java.util.Scanner;

public class JSnack2 {

	public static void main(String[] args) {
		/*Chiedi all'utente di inserire un numero, se è pari stampa il numero,
		se è dispari stampa il numero successivo*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dimmi un numero: ");
		int num= scan.nextInt();
		
		if(num%2== 0) {
			System.out.println(num);
		}else {
			System.out.println(num+1);
		}
		
		scan.close();
		
	}

}
