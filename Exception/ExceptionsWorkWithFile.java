package Exception;

/**
 * Created by user on 12.04.2019.
 */
public class ExceptionsWorkWithFile extends Exception {

    public ExceptionsWorkWithFile() {

    }

    public ExceptionsWorkWithFile(String message) {
        super(message);
    }

    public ExceptionsWorkWithFile(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionsWorkWithFile(Throwable cause) {
        super(cause);
    }
}
