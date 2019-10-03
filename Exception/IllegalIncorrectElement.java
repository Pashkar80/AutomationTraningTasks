package Exception;

/**
 * Created by user on 19.05.2019.
 */
public class IllegalIncorrectElement extends ExceptionsWorkWithFile {
    public IllegalIncorrectElement() {
    }

    public IllegalIncorrectElement(String message) {
        super(message);
    }

    public IllegalIncorrectElement(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalIncorrectElement(Throwable cause) {
        super(cause);
    }
}
