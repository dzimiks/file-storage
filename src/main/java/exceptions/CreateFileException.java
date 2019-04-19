package exceptions;

/**
 * Exception thrown if there is error with creating file.
 */
public class CreateFileException extends Exception {

	public CreateFileException() {
		super("Error while creating file!");
	}
}
