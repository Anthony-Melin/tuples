package io.toucandev.tuples;

/**
 * Represent a tuple with 4 values
 *
 * @author dell
 */
public interface IQuartet<R, S, T, U> extends ITriplet<R, S, T> {

    /**
     * <p>get3.</p>
     *
     * @return the fourth element of the tuple.
     */
    U get3();
}
