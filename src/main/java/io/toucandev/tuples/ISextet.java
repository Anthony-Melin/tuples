package io.toucandev.tuples;
/**
 * Represent a tuple with 6 values
 *
 * @author dell
 */
public interface ISextet<R, S, T, U, V, W> extends IQuintet<R, S, T, U, V> {

    /**
     * <p>get5.</p>
     *
     * @return the sixth element of the tuple.
     */
    W get5();
}
