package exerciseThree;

import exceptions.BancaException;

public class ContoOnline extends ContoCorrente {

	double maxPrelievo;
	ContoOnline(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) throws BancaException {
		if (x <= maxPrelievo) {
			super.preleva(x);
		} else if(x > maxPrelievo) {
			throw new BancaException("No funds available");
		}
	}
}
