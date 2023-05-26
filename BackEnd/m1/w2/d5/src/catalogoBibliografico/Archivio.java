package catalogoBibliografico;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;


public class Archivio {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Archivio.class);


	public static void main(String[] args) {
		
		//********** CREAZIONE LIBRI **********
		
		Libro libro1 = new Libro(9788806242626l, "Il Vangelo secondo la Scienza", 2019, 248, "Piergiorgio Odifreddi", "Scienza");
		Libro libro2 = new Libro(9788899684693l, "Il genio non esiste (e a volte è un idiota)", 2020, 300, "Barbascura X", "Scienza");
		Libro libro3 = new Libro(9788806239831l, "Le otto montagne", 2018, 200, "Paolo Cognetti", "Fiction");
		Libro libro4 = new Libro(9788804764878l, "Fa bene o fa male? Manuale di autodifesa alimentare", 2023, 328, "Dario Bressanini", "Scienza");
		Libro libro5 = new Libro(9791280229670l, "Donne che pensano troppo", 2023, 318, "Susan Nolen-Hoeksema", "Psicologia");
		
		//********** CREAZIONE RIVISTE **********
		
		Rivista rivista1 = new Rivista(9781292110073l, "Focus", 1992, 150, periodicità.MENSILE);
		Rivista rivista2 = new Rivista(9781292110080l, "Vogue", 1892, 250, periodicità.MENSILE);
		Rivista rivista3 = new Rivista(9781447998396l, "TIME", 1923, 100, periodicità.SETTIMANALE);
		Rivista rivista4 = new Rivista(9781292110110l, "Journal of Molecular Biology", 1959, 250, periodicità.SEMESTRALE);
		Rivista rivista5 = new Rivista(9781447998617l, "Journal of Applied Physics ", 1931, 900, periodicità.SEMESTRALE);
		
		
		//********** AGGIUNTA ELEMENTO A ARCHIVIO **********
		
		addPubblicazione(libro1);
		addPubblicazione(libro2);
		addPubblicazione(libro3);
		addPubblicazione(libro4);
		addPubblicazione(libro5);
		
		addPubblicazione(rivista1);
		addPubblicazione(rivista2);
		addPubblicazione(rivista3);
		addPubblicazione(rivista4);
		addPubblicazione(rivista5);
		
		
		//********** SCRITTURA SU DISCO **********
		
		try {
			saveToDisk();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//********** LETTURA DA DISCO **********
		
		try {
			readFromDisk(file, archivio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//********** LETTURA DA DISCO **********
		
		try {
			clearSavedDisk();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//********* ELIMINAZIONE ELEMENTO DA ARCHIVIO TRAMITE ISBN **********
		
//		deleteDaISBN(9788806242626l);
		
		//********** RICERCA PER AUTORE *********
		
		searchDaAutore("Barbascura X");
		
		//********** RICERCA PER ANNO *********
		
		searchDaAnno(2023);
		
		//********** RICERCA PER ISBN **********
		
		searchDaISBN(9781447998396l);
	}

	
	public static List<PubblicazioniCartacee> archivio = new ArrayList<PubblicazioniCartacee>();

	
	public static void addPubblicazione(PubblicazioniCartacee nomePubblicazione) {
		archivio.add(nomePubblicazione);
	}

	public static void deleteDaISBN(long ISBNPubblicazione) {
		archivio.removeIf(pubblicazione -> pubblicazione.getISBN() == ISBNPubblicazione);
	}
	
	public static List<PubblicazioniCartacee> searchDaISBN(long ISBNPubblicazione) {
		List<PubblicazioniCartacee> searched = archivio.stream()
														.filter(pubblicazione -> (pubblicazione).getISBN() == ISBNPubblicazione)
														.collect(Collectors.toList());
		logger.info("RICERCA PER " + ISBNPubblicazione + ": {}", searched.toString());
		return null;
	}
	
	public static List<PubblicazioniCartacee> searchDaAnno(int annoPubblicazione) {
		List<PubblicazioniCartacee> searched = archivio.stream()
														.filter(pubblicazione -> pubblicazione.getAnnoPubblicazione() == annoPubblicazione)
														.collect(Collectors.toList());
		logger.info("RICERCA PER " + annoPubblicazione + ": {}", searched.toString());
		return null;
	}
	
	
	public static List<Libro> searchDaAutore(String autore) {
	    List<Libro> searched = archivio.stream()
	                                    .filter(pubblicazione -> pubblicazione instanceof Libro && ((Libro) pubblicazione).getAutore().equals(autore))
	                                    .map(pubblicazione -> (Libro) pubblicazione)
	                                    .collect(Collectors.toList());
	    logger.info("RICERCA PER " + autore + ": {}", searched.toString());
	    return null;
	}
	
	private static File file = new File("archivio.txt");
	
	public static void saveToDisk() throws IOException{
		String space = "";
		
		for(PubblicazioniCartacee pubblicazione : archivio) {
			if(space.length() !=0) {
				space += ("#" + System.lineSeparator());
			}
			if(pubblicazione instanceof Libro) {
				space += pubblicazione.toString();
			} else if(pubblicazione instanceof Rivista) {
				space += pubblicazione.toString();
			}
		}
		
		FileUtils.writeStringToFile(file, space, "UTF-8");
		logger.info("FILE SCRITTO CORRETTAMENTE");
	}
	
	public static void clearSavedDisk() throws IOException {
		FileUtils.writeStringToFile(file, "", "UTF-8"); 
	}

	public static void readFromDisk(File file, List<PubblicazioniCartacee> archivio) throws IOException {
	    String data = FileUtils.readFileToString(file, "UTF-8");
	    String[] pubblicazioni = data.split("#");

	    for (String pubblicazione : pubblicazioni) {
	        String[] fields = pubblicazione.split(",");
	        if (Arrays.asList(fields).contains("autore")) {
	            long isbn = Integer.parseInt(fields[0]);
	            String titolo = fields[1];
	            int annoPubblicazione = Integer.parseInt(fields[2]);
	            int pagine = Integer.parseInt(fields[3]);
	            String autore = fields[4];
	            String genere = fields[5];
	            Libro pubblicazioneDaCreare = new Libro(isbn, titolo, annoPubblicazione, pagine, autore, genere);
	            archivio.add(pubblicazioneDaCreare);
	        } else if (Arrays.asList(fields).contains("periodicità")) {
	        	 long isbn = Integer.parseInt(fields[0]);
		         String titolo = fields[1];
		         int annoPubblicazione = Integer.parseInt(fields[2]);
		         int pagine = Integer.parseInt(fields[3]);
		         periodicità periodicità = catalogoBibliografico.periodicità.valueOf(fields[4]);
		         Rivista pubblicazioneDaCreare = new Rivista(isbn, titolo, annoPubblicazione, pagine, periodicità);
		         archivio.add(pubblicazioneDaCreare);
	        }
	    }
	    
	    logger.info("FILE LETTO CORRETTAMENTE {}", archivio.toString());
	}
	
}
