package Exception;

/**
 * Created by user on 25.05.2019.
 */
public class StreamException extends ExceptionsWorkWithFile {
    public StreamException() {
    }

    public StreamException(String message) {
        super(message);
    }

    public StreamException(String message, Throwable cause) {
        super(message, cause);
    }

    public StreamException(Throwable cause) {
        super(cause);
    }
}
