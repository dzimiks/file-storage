package exceptions;

/**
 * Exception thrown if there is error with moving file/directory.
 */
public class MoveException extends Exception{
    public MoveException() {
        super("Error while moving file/directory!");
    }
}
