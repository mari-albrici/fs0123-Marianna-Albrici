package catalogoBibliografico;

public abstract class PubblicazioniCartacee {

	protected long ISBN;
	protected String titolo;
	protected int annoPubblicazione;
	protected int pagine;
	
	
	protected PubblicazioniCartacee(long ISBN, String titolo, int annoPubblicazione, int pagine) {
		this.ISBN = ISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.pagine = pagine;
	}
	
	protected String getTitolo() {
		return titolo;
	}
	
	protected int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	
	protected int getPagine() {
		return pagine;
	}
	
	protected long getISBN() {
		return ISBN;
	}
	
	@Override
    public String toString() {
        return "ISBN: " + ISBN + ", Titolo: " + titolo + ", Anno di pubblicazione: " + annoPubblicazione + ", Pagine: " + pagine;
    }
	
}
