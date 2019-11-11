package hu.aensys.exception;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class CustomUncheckedException extends RuntimeException {

    public CustomUncheckedException() {
    }

    public CustomUncheckedException(String s) {
        super(s);
    }

    public CustomUncheckedException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public CustomUncheckedException(Throwable throwable) {
        super(throwable);
    }


}
