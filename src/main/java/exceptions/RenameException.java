package exceptions;

/**
 * Exception thrown if there is error with renaming file/directory.
 */
public class RenameException extends Exception {

    public RenameException() {
        super("Error while deleting file/directory!");
    }
}
