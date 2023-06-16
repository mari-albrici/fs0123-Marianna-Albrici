package be.coworking.exceptions;

public class UnknownLanguage extends RuntimeException {

    public UnknownLanguage(String lang) {
        super(lang + " is not a supported language! | " + lang + " non è una lingua supportata!");
    }
}