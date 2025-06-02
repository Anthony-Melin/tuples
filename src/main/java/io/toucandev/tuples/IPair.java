package io.toucandev.tuples;

/**
 * Represent a tuple with 2 values
 */
public interface IPair<R, S> {

    /**
     *
     * @return the first element of the tuple.
     */
    R get0();

    /**
     *
     * @return the second element of the tuple.
     */
    S get1();
}
