package main;

import java.util.Arrays;

public class MainThree {

	public static void main(String[] args) {
	
		Cliente AA001 = new Cliente("AA001", "Marianna", "Albrici", "marianna.albrici@gmail.com", "01.01.2023");
		
		Articolo occhiali = new Articolo(0001, "Occhiali da vista con protezione luce blu", 100, 278.99);
		
		Object[] elencoArticoli = { occhiali, occhiali };
		double totaleCarrello = occhiali.prezzo * elencoArticoli.length;
		
		Carrello carrello = new Carrello("AA001", elencoArticoli, totaleCarrello);
		
		System.out.println(toString(AA001));
		System.out.println(toString(occhiali));
		System.out.println(toString(carrello));
	
	}

	private static String toString(Articolo occhiali) {
		return occhiali.codice + " " + occhiali.numeroPezzi + " " + occhiali.descrizione + " " + "$" + occhiali.prezzo;
	}

	private static String toString(Cliente AA001) {
		return AA001.nome + " " + AA001.cognome + " " + "Data di iscrizione: " + AA001.dataIscrizione;
	}
	
	private static String toString(Carrello carrello) {
		return carrello.cliente + " " + Arrays.toString(carrello.elencoArticoli) + " " + "$"  +carrello.totaleCarrello;
	}
}
