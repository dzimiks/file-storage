package exceptions;
/**
 * Exception thrown if there is error with creating directory.
 */

public class CreateDirectoryException extends Exception{

    public CreateDirectoryException() {
        super("Error while creating directory!");
    }
}
