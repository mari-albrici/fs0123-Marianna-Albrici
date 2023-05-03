package main;

import java.util.Arrays;

public class Carrello {
	
	Object[] elencoArticoli;
	double totaleCarrello;
	String cliente;
	
	public Carrello(String cliente, Object[] elencoArticoli, double totaleCarrello) {
		this.cliente = cliente;
		this.elencoArticoli = elencoArticoli;
		this.totaleCarrello = totaleCarrello;
	}
	
	public static String toString(Carrello carrello) {
		return carrello.cliente + " " + Arrays.toString(carrello.elencoArticoli) + " " + "$"  +carrello.totaleCarrello;
	}
	
}
