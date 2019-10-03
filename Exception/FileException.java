package Exception;

/**
 * Created by user on 18.05.2019.
 */
public class FileException extends ExceptionsWorkWithFile {

    public FileException() {
    }

    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileException(Throwable cause) {
        super(cause);
    }
}
