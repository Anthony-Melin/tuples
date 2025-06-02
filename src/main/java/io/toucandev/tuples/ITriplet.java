package io.toucandev.tuples;

/**
 * Represent a tuple with 3 values
 */
public interface ITriplet<R, S, T> extends IPair<R, S> {

    /**
     *
     * @return the third element of the tuple.
     */
    T get2();
}
