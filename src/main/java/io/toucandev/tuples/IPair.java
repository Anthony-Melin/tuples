package io.toucandev.tuples;

/**
 * Represent a tuple with 2 values
 *
 * @author dell
 */
public interface IPair<R, S> {

    /**
     * <p>get0.</p>
     *
     * @return the first element of the tuple.
     */
    R get0();

    /**
     * <p>get1.</p>
     *
     * @return the second element of the tuple.
     */
    S get1();
}
