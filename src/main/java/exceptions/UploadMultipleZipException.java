package exceptions;

/**
 * Exception thrown if there is error with uploading multiple zipped files/directories.
 */
public class UploadMultipleZipException extends Exception {
    public UploadMultipleZipException() {
        super("Error while uploading multiple zipped files/directories!");
    }
}
