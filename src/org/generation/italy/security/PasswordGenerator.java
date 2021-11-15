package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		//voci
		int dataGiorno = 12;
		int dataMese = 05;
		int dataAnno = 1994;
		String nome = "Pinco";
		String cognome = "Pallo";
		String colore = "magenta";
		//totale numeri
		int totale = dataGiorno + dataMese + dataAnno;
		System.out.print("password: ");
		System.out.println(nome + "-" + cognome + "-"  + colore + "-"  + totale );
	}

}
