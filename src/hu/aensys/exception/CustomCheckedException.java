package hu.aensys.exception;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class CustomCheckedException extends Exception {

    public CustomCheckedException() {
    }

    public CustomCheckedException(String s) {
        super(s);
    }

    public CustomCheckedException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public CustomCheckedException(Throwable throwable) {
        super(throwable);
    }
}
