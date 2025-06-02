package io.toucandev.tuples;

/**
 * Generic interface for any kind of tuple
 *
 * @author dell
 */
public interface ITuple<R, S, T, U, V, W> extends IPair<R, S>, ITriplet<R, S, T>, IQuartet<R, S, T, U>, IQuintet<R, S, T, U, V>, ISextet<R, S, T, U, V, W> {
}
