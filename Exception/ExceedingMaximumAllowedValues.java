package Exception;

/**
 * Created by user on 19.05.2019.
 */
public class ExceedingMaximumAllowedValues extends ExceptionsWorkWithFile {
    public ExceedingMaximumAllowedValues() {
    }

    public ExceedingMaximumAllowedValues(String message) {
        super(message);
    }

    public ExceedingMaximumAllowedValues(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceedingMaximumAllowedValues(Throwable cause) {
        super(cause);
    }
}
