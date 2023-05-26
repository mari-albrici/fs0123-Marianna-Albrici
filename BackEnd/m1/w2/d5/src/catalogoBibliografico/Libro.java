package catalogoBibliografico;

public class Libro extends PubblicazioniCartacee{
	
	private String autore;
	private String genere;

	public Libro(long ISBN, String titolo, int annoPubblicazione, int pagine, String autore, String genere) {
		super(ISBN, titolo, annoPubblicazione, pagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	public void getInfoLibro() {
		System.out.println(titolo + " di " + autore + ", genere " + genere + ", pubblicato nel " + annoPubblicazione + ", ha un totale di " + pagine + " pagine (il suo codice ISBN è: " + ISBN + ").");
	}
	
	public String getAutore() {
		return autore;
	}
	
	public String getGenere() {
		return genere;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Autore: " + autore + ", Genere: " + genere;
    }
}
