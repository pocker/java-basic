package hu.aensys.generic.stack;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public interface Stack<T> {

    void push(T value);

    T pop();

    boolean contains(T value);

    int size();

    public int capacity();

    public void clear();

    boolean isEmpty();


}
