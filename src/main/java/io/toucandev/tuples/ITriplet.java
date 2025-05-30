package io.toucandev.tuples;

public interface ITriplet<R, S, T> extends IPair<R, S> {
    T get2();
}
