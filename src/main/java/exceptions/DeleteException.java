package exceptions;

/**
 * Exception thrown if there is error with deleting file/directory.
 */
public class DeleteFileException extends Exception {

    public DeleteFileException() {
        super("Error while deleting file/directory!");
    }
}
