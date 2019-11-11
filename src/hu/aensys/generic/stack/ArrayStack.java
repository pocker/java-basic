package hu.aensys.generic.stack;

import java.util.Objects;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class ArrayStack<T> implements Stack<T> {

    public static final int DEFAULT_CAPACITY = 10;

    private final T[] container;

    private int pointer = 0;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(final int capacity) {
        this.container = (T[]) new Object[capacity];
    }


    @Override
    public void push(T value) {
        if (this.capacity() == this.size()) {
            return;
        }

        container[pointer++] = value;
    }

    @Override
    public T pop() {

        if (this.isEmpty()) {
            return null;
        }

        return container[--pointer];
    }

    @Override
    public boolean contains(T value) {

        for (int i = 0; i <= pointer; i++) {
            if (Objects.equals(container[i], value)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public int capacity() {
        return container.length;
    }

    @Override
    public void clear() {
        this.pointer = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.pointer == 0;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = this.pointer - 1; i >= 0; i--) {
            builder.append(container[i]);
            if (i > 0) {
                builder.append(", ");
            }
        }

        builder.append("]");

        return builder.toString();
    }
}
