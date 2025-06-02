package io.toucandev.tuples;

/**
 * Represent a tuple with 4 values
 */
public interface IQuartet<R, S, T, U> extends ITriplet<R, S, T> {

    /**
     *
     * @return the fourth element of the tuple.
     */
    U get3();
}
