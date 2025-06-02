package io.toucandev.tuples;

/**
 * Represent a tuple with 3 values
 *
 * @author dell
 */
public interface ITriplet<R, S, T> extends IPair<R, S> {

    /**
     * <p>get2.</p>
     *
     * @return the third element of the tuple.
     */
    T get2();
}
