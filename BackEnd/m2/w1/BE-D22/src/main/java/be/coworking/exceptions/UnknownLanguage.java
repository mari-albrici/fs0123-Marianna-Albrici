package be.coworking.exceptions;

@SuppressWarnings("serial")
public class UnknownLanguage extends RuntimeException {

	public UnknownLanguage(String lang) {
		super(lang + " is not a supported language / non è supportata! Try '/it' or '/en' ");
	}
}
