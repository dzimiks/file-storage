package exceptions;

/**
 * Exception thrown if there is error with uploading multiple files/directories.
 */
public class UploadMultipleException extends Exception {
    public UploadMultipleException() {
        super("Error while uploading multiple files/directories!");
    }
}
