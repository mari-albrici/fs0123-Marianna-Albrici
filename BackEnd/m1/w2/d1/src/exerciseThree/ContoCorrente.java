package exerciseThree;

import exceptions.BancaException;

public class ContoCorrente {
	
	String titolare;
	int nMovimenti;
	final int maxMovimenti = 50;
	double saldo;

	ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		nMovimenti = 0;
	}

	void preleva(double x) throws BancaException {
		if (nMovimenti < maxMovimenti) {
			saldo = saldo - x;
			if(saldo < 0) {
				throw new BancaException("No funds available");
			}
		} else {
			saldo = saldo - x - 0.50;
			nMovimenti++;
		}
	}

	double restituisciSaldo() {
		return saldo;
	}
}
