package be.coworking.exceptions;

@SuppressWarnings("serial")
public class NotFoundException extends RuntimeException {

	public NotFoundException(int id) {
		super("Item with id " + id + " not found!");
	}

}
