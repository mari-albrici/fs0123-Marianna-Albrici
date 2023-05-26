package catalogoBibliografico;

public class Rivista extends PubblicazioniCartacee{
	
	private periodicità periodicità;;
	
	public Rivista(long ISBN, String titolo, int annoPubblicazione, int pagine, periodicità periodicità) {
		super(ISBN, titolo, annoPubblicazione, pagine);
		this.periodicità = periodicità;
	}

	public void getInfoRivista() {
		System.out.println(titolo + ", pubblicato nel " + annoPubblicazione + " " + periodicità + ", ha un totale di" + pagine + " pagine (il suo codice ISBN è: " + ISBN + ").");
	}
	
	public periodicità getPeriodicità() {
		return periodicità;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Periodicità " + periodicità ;
    }
}
