package pro.sky.java.course2.skyprospring;

public class Exceptions extends Exception{
    public Exceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Exceptions() {
    }

    public Exceptions(String message) {
        super(message);
    }

    public Exceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public Exceptions(Throwable cause) {
        super(cause);
    }
}
