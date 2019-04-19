package exceptions;

/**
 * Exception thrown if there is error with uploading file.
 */
public class UploadFileException extends Exception{
    public UploadFileException() {
        super("Error while uploading file!");
    }
}
