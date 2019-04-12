package exceptions;

public class CreateFileException extends Exception {

    public CreateFileException(String message) {
        super("Error while creating file!");
    }
}
