package io.toucandev.tuples;

public class Tuple<R, S, T, U, V, W> implements ITuple<R, S, T, U, V, W> {
    private final R r;
    private final S s;
    private final T t;
    private final U u;
    private final V v;
    private final W w;

    private Tuple(R r, S s, T t, U u, V v, W w) {
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
    }

    //##################################################################################################################
    // Pair
    //##################################################################################################################
    /**
     * Instance a pair tuple.
     *
     * @param r first value
     * @param s second value
     * @return Tuple
     * @param <R> inferred type for the first value
     * @param <S> inferred type for the second value
     */
    public static <R, S> IPair<R, S> pair(R r, S s) {
        return new Tuple<>(r, s, null, null, null, null);
    }

    /**
     * @see io.toucandev.tuples.Tuple#pair(Object, Object)
     */
    public static <R, S> IPair<R, S> pair(IPair<R, S> pair) {
        return new Tuple<>(pair.get0(), pair.get1(), null, null, null, null);
    }

    //##################################################################################################################
    // Triplet
    //##################################################################################################################
    /**
     * Instance a triplet tuple.
     *
     * @param r first value
     * @param s second value
     * @param t third value
     * @return Tuple
     * @param <R> inferred type for the first value
     * @param <S> inferred type for the second value
     * @param <T> inferred type for the third value
     */
    public static <R, S, T> ITriplet<R, S, T> triplet(R r, S s, T t) {
        return new Tuple<>(r, s, t, null, null, null);
    }

    /**
     * @see io.toucandev.tuples.Tuple#triplet(Object, Object, Object)
     */
    public static <R, S, T> ITriplet<R, S, T> triplet(ITriplet<R, S, T> triplet) {
        return new Tuple<>(triplet.get0(), triplet.get1(), triplet.get2(), null, null, null);
    }

    /**
     * @see io.toucandev.tuples.Tuple#triplet(Object, Object, Object)
     */
    public static <R, S, T> ITriplet<R, S, T> triplet(IPair<R, S> pair, T t) {
        return triplet(pair.get0(), pair.get1(), t);
    }

    /**
     * @see io.toucandev.tuples.Tuple#triplet(Object, Object, Object)
     */
    public static <R, S, T> ITriplet<R, S, T> triplet(R r, IPair<S, T> pair) {
        return triplet(r, pair.get0(), pair.get1());
    }

    //##################################################################################################################
    // Quartet
    //##################################################################################################################
    /**
     * Instance a quartet tuple.
     *
     * @param r first value
     * @param s second value
     * @param t third value
     * @param u fourth value
     * @return Tuple
     * @param <R> inferred type for the first value
     * @param <S> inferred type for the second value
     * @param <T> inferred type for the third value
     * @param <U> inferred type for the fourth value
     */
    public static <R, S, T, U> IQuartet<R, S, T, U> quartet(R r, S s, T t, U u) {
        return new Tuple<>(r, s, t, u, null, null);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quartet(Object, Object, Object, Object)
     */
    public static <R, S, T, U> IQuartet<R, S, T, U> quartet(IQuartet<R, S, T, U> quartet) {
        return new Tuple<>(quartet.get0(), quartet.get1(), quartet.get2(), quartet.get3(), null, null);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quartet(Object, Object, Object, Object)
     */
    public static <R, S, T, U> IQuartet<R, S, T, U> quartet(IPair<R, S> pair, T t, U u) {
        return quartet(pair.get0(), pair.get1(), t, u);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quartet(Object, Object, Object, Object)
     */
    public static <R, S, T, U> IQuartet<R, S, T, U> quartet(R r, IPair<S, T> pair, U u) {
        return quartet(r, pair.get0(), pair.get1(), u);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quartet(Object, Object, Object, Object)
     */
    public static <R, S, T, U> IQuartet<R, S, T, U> quartet(R r, S s, IPair<T, U> pair) {
        return quartet(r, s, pair.get0(), pair.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#quartet(Object, Object, Object, Object)
     */
    public static <R, S, T, U> IQuartet<R, S, T, U> quartet(IPair<R, S> pair1, IPair<T, U> pair2) {
        return quartet(pair1.get0(), pair1.get1(), pair2.get0(), pair2.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#quartet(Object, Object, Object, Object)
     */
    public static <R, S, T, U> IQuartet<R, S, T, U> quartet(ITriplet<R, S, T> triplet, U u) {
        return quartet(triplet.get0(), triplet.get1(), triplet.get2(), u);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quartet(Object, Object, Object, Object)
     */
    public static <R, S, T, U> IQuartet<R, S, T, U> quartet(R r, ITriplet<S, T, U> triplet) {
        return quartet(r, triplet.get0(), triplet.get1(), triplet.get2());
    }

    //##################################################################################################################
    // Quintet
    //##################################################################################################################
    /**
     * Instance a quintet tuple.
     *
     * @param r first value
     * @param s second value
     * @param t third value
     * @param u fourth value
     * @param v fifth value
     * @return Tuple
     * @param <R> inferred type for the first value
     * @param <S> inferred type for the second value
     * @param <T> inferred type for the third value
     * @param <U> inferred type for the fourth value
     * @param <V> inferred type for the fifth value
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(R r, S s, T t, U u, V v) {
        return new Tuple<>(r, s, t, u, v, null);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(IQuintet<R, S, T, U, V> quintet) {
        return new Tuple<>(quintet.get0(), quintet.get1(), quintet.get2(), quintet.get3(), quintet.get4(), null);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(IPair<R, S> pair, T t, U u, V v) {
        return quintet(pair.get0(), pair.get1(), t, u, v);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(R r, IPair<S, T> pair, U u, V v) {
        return quintet(r, pair.get0(), pair.get1(), u, v);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(R r, S s, IPair<T, U> pair, V v) {
        return quintet(r, s, pair.get0(), pair.get1(), v);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(R r, S s, T t, IPair<U, V> pair) {
        return quintet(r, s, t, pair.get0(), pair.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(IPair<R, S> pair1, IPair<T, U> pair2, V v) {
        return quintet(pair1.get0(), pair1.get1(), pair2.get0(), pair2.get1(), v);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(IPair<R, S> pair1, T t, IPair<U, V> pair2) {
        return quintet(pair1.get0(), pair1.get1(), t, pair2.get0(), pair2.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(R r, IPair<S, T> pair1, IPair<U, V> pair2) {
        return quintet(r, pair1.get0(), pair1.get1(), pair2.get0(), pair2.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(ITriplet<R, S, T> triplet, U u, V v) {
        return quintet(triplet.get0(), triplet.get1(), triplet.get2(), u, v);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(R r, ITriplet<S, T, U> triplet, V v) {
        return quintet(r, triplet.get0(), triplet.get1(), triplet.get2(), v);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(R r, S s, ITriplet<T, U, V> triplet) {
        return quintet(r, s, triplet.get0(), triplet.get1(), triplet.get2());
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(IQuartet<R, S, T, U> quartet, V v) {
        return quintet(quartet.get0(), quartet.get1(), quartet.get2(), quartet.get3(), v);
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(R r, IQuartet<S, T, U, V> quartet) {
        return quintet(r, quartet.get0(), quartet.get1(), quartet.get2(), quartet.get3());
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(ITriplet<R, S, T> triplet, IPair<U, V> pair) {
        return quintet(triplet.get0(), triplet.get1(), triplet.get2(), pair.get0(), pair.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#quintet(Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V> IQuintet<R, S, T, U, V> quintet(IPair<R, S> pair, ITriplet<T, U, V> triplet) {
        return quintet(pair.get0(), pair.get1(), triplet.get0(), triplet.get1(), triplet.get2());
    }

    //##################################################################################################################
    // Sextet
    //##################################################################################################################
    /**
     * Instance a sextet tuple.
     *
     * @param r first value
     * @param s second value
     * @param t third value
     * @param u fourth value
     * @param v fifth value
     * @param w sixth value
     * @return Tuple
     * @param <R> inferred type for the first value
     * @param <S> inferred type for the second value
     * @param <T> inferred type for the third value
     * @param <U> inferred type for the fourth value
     * @param <V> inferred type for the fifth value
     * @param <W> inferred type for the sixth value
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, S s, T t, U u, V v, W w) {
        return new Tuple<>(r, s, t, u, v, w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IPair<R, S> pair, T t, U u, V v, W w) {
        return sextet(pair.get0(), pair.get1(), t, u, v, w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, IPair<S, T> pair, U u, V v, W w) {
        return sextet(r, pair.get0(), pair.get1(), u, v, w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, S s, IPair<T, U> pair, V v, W w) {
        return sextet(r, s, pair.get0(), pair.get1(), v, w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, S s, T t, IPair<U, V> pair, W w) {
        return sextet(r, s, t, pair.get0(), pair.get1(), w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, S s, T t, U u, IPair<V, W> pair) {
        return sextet(r, s, t, u, pair.get0(), pair.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IPair<R, S> pair1, IPair<T, U> pair2, V v, W w) {
        return sextet(pair1.get0(), pair1.get1(), pair2.get0(), pair2.get1(), v, w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IPair<R, S> pair1, T t, IPair<U, V> pair2, W w) {
        return sextet(pair1.get0(), pair1.get1(), t, pair2.get0(), pair2.get1(), w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IPair<R, S> pair1, T t, U u, IPair<V, W> pair2) {
        return sextet(pair1.get0(), pair1.get1(), t, u, pair2.get0(), pair2.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, IPair<S, T> pair1, IPair<U, V> pair2, W w) {
        return sextet(r, pair1.get0(), pair1.get1(), pair2.get0(), pair2.get1(), w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, IPair<S, T> pair1, U u, IPair<V, W> pair2) {
        return sextet(r, pair1.get0(), pair1.get1(), u, pair2.get0(), pair2.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, S s, IPair<T, U> pair1, IPair<V, W> pair2) {
        return sextet(r, s, pair1.get0(), pair1.get1(), pair2.get0(), pair2.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IPair<R, S> pair1, IPair<T, U> pair2, IPair<V, W> pair3) {
        return sextet(pair1.get0(), pair1.get1(), pair2.get0(), pair2.get1(), pair3.get0(), pair3.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(ITriplet<R, S, T> triplet, U u, V v, W w) {
        return sextet(triplet.get0(), triplet.get1(), triplet.get2(), u, v, w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, ITriplet<S, T, U> triplet, V v, W w) {
        return sextet(r, triplet.get0(), triplet.get1(), triplet.get2(), v, w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, S s, ITriplet<T, U, V> triplet, W w) {
        return sextet(r, s, triplet.get0(), triplet.get1(), triplet.get2(), w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, S s, T t, ITriplet<U, V, W> triplet) {
        return sextet(r, s, t, triplet.get0(), triplet.get1(), triplet.get2());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(ITriplet<R, S, T> triplet1, ITriplet<U, V, W> triplet2) {
        return sextet(triplet1.get0(), triplet1.get1(), triplet1.get2(), triplet2.get0(), triplet2.get1(), triplet2.get2());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IQuartet<R, S, T, U> quartet, V v, W w) {
        return sextet(quartet.get0(), quartet.get1(), quartet.get2(), quartet.get3(), v, w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, IQuartet<S, T, U, V> quartet, W w) {
        return sextet(r, quartet.get0(), quartet.get1(), quartet.get2(), quartet.get3(), w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, S s, IQuartet<T, U, V, W> quartet) {
        return sextet(r, s, quartet.get0(), quartet.get1(), quartet.get2(), quartet.get3());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(ITriplet<R, S, T> triplet, IPair<U, V> pair, W w) {
        return sextet(triplet.get0(), triplet.get1(), triplet.get2(), pair.get0(), pair.get1(), w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(ITriplet<R, S, T> triplet, U u, IPair<V, W> pair) {
        return sextet(triplet.get0(), triplet.get1(), triplet.get2(), u, pair.get0(), pair.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IPair<R, S> pair, T t, ITriplet<U, V, W> triplet) {
        return sextet(pair.get0(), pair.get1(), t, triplet.get0(), triplet.get1(), triplet.get2());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IPair<R, S> pair, ITriplet<T, U, V> triplet, W w) {
        return sextet(pair.get0(), pair.get1(), triplet.get0(), triplet.get1(), triplet.get2(), w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, ITriplet<S, T, U> triplet, IPair<V, W> pair) {
        return sextet(r, triplet.get0(), triplet.get1(), triplet.get2(), pair.get0(), pair.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, IPair<S, T> pair, ITriplet<U, V, W> triplet) {
        return sextet(r, pair.get0(), pair.get1(), triplet.get0(), triplet.get1(), triplet.get2());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IQuartet<R, S, T, U> quartet, IPair<V, W> pair) {
        return sextet(quartet.get0(), quartet.get1(), quartet.get2(), quartet.get3(), pair.get0(), pair.get1());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IPair<R, S> pair, IQuartet<T, U, V, W> quartet) {
        return sextet(pair.get0(), pair.get1(), quartet.get0(), quartet.get1(), quartet.get2(), quartet.get3());
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(IQuintet<R, S, T, U, V> quintet, W w) {
        return sextet(quintet.get0(), quintet.get1(), quintet.get2(), quintet.get3(), quintet.get4(), w);
    }

    /**
     * @see io.toucandev.tuples.Tuple#sextet(Object, Object, Object, Object, Object, Object)
     */
    public static <R, S, T, U, V, W> ISextet<R, S, T, U, V, W> sextet(R r, IQuintet<S, T, U, V, W> quintet) {
        return sextet(r, quintet.get0(), quintet.get1(), quintet.get2(), quintet.get3(), quintet.get4());
    }

    @Override
    public R get0() {
        return this.r;
    }

    @Override
    public S get1() {
        return this.s;
    }

    @Override
    public T get2() {
        return this.t;
    }

    @Override
    public U get3() {
        return this.u;
    }

    @Override
    public V get4() {
        return this.v;
    }

    @Override
    public W get5() {
        return this.w;
    }
}
