package hu.aensys.exception.wrap;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class BusinessException extends Exception {

    public BusinessException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public BusinessException(Throwable throwable) {
        super(throwable);
    }
}
