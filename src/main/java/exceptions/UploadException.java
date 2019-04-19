package exceptions;

/**
 * Exception thrown if there is error with uploading file/directory.
 */
public class UploadException extends Exception{
    public UploadException() {
        super("Error while uploading file/directory!");
    }
}
