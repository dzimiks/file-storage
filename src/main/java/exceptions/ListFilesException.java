package exceptions;

/**
 * Exception thrown if there is error with listing files.
 */
public class ListFilesException extends Exception{
    public ListFilesException() {
        super("Error while listing files!");
    }
}
