package exceptions;

/**
 * Exception thrown if there is error with downloading file/directory.
 */
public class DownloadException extends Exception {
    public DownloadException() {
        super("Error while downloading file/directory!");
    }
}
