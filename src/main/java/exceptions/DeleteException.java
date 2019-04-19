package exceptions;

/**
 * Exception thrown if there is error with deleting file/directory.
 */
public class DeleteException extends Exception {

    public DeleteException() {
        super("Error while deleting file/directory!");
    }
}
