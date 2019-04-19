package exceptions;

/**
 * Exception thrown if there is error with listing directories.
 */
public class ListDirectoryException extends Exception{
    public ListDirectoryException() {
        super("Error while listing directories!");
    }
}
