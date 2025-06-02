package io.toucandev.tuples;

/**
 * Represent a tuple with 5 values
 *
 * @author dell
 */
public interface IQuintet<R, S, T, U, V> extends IQuartet<R, S, T, U> {

    /**
     * <p>get4.</p>
     *
     * @return the fifth element of the tuple.
     */
    V get4();
}
