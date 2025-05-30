package org.toucandev.tuples;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TupleTest {

    private static final Long r = 0L;
    private static final Long s = 1L;
    private static final Long t = 2L;
    private static final Long u = 3L;
    private static final Long v = 4L;
    private static final Long w = 5L;

    static class PairArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.argumentSet("from_values", Tuple.pair(r, s)),
                    Arguments.argumentSet("from_pa", Tuple.pair(Tuple.pair(r, s)))
            );
        }
    }

    static class TripletArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.argumentSet("from_values", Tuple.triplet(r, s, t)),
                    Arguments.argumentSet("from_tr", Tuple.triplet(Tuple.triplet(r, s, t))),

                    Arguments.argumentSet("from_pa_va", Tuple.triplet(Tuple.pair(r, s), t)),
                    Arguments.argumentSet("from_va_pa", Tuple.triplet(r, Tuple.pair(s, t)))
            );
        }
    }

    static class QuartetArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.argumentSet("from_values", Tuple.quartet(r, s, t, u)),
                    Arguments.argumentSet("from_qa", Tuple.quartet(Tuple.quartet(r, s, t, u))),

                    Arguments.argumentSet("from_pa_va_va", Tuple.quartet(Tuple.pair(r, s), t, u)),
                    Arguments.argumentSet("from_va_pa_va", Tuple.quartet(r, Tuple.pair(s, t), u)),
                    Arguments.argumentSet("from_va_va_pa", Tuple.quartet(r, s, Tuple.pair(t, u))),
                    Arguments.argumentSet("from_pa_pa", Tuple.quartet(Tuple.pair(r, s), Tuple.pair(t, u))),

                    Arguments.argumentSet("from_tr_va", Tuple.quartet(Tuple.triplet(r, s, t), u)),
                    Arguments.argumentSet("from_va_tr", Tuple.quartet(r, Tuple.triplet(s, t, u)))
            );
        }
    }

    static class QuintetArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.argumentSet("from_values", Tuple.quintet(r, s, t, u, v)),
                    Arguments.argumentSet("from_qi", Tuple.quintet(Tuple.quintet(r, s, t, u, v))),

                    Arguments.argumentSet("from_pa_va_va_va", Tuple.quintet(Tuple.pair(r, s), t, u, v)),
                    Arguments.argumentSet("from_va_pa_va_va", Tuple.quintet(r, Tuple.pair(s, t), u, v)),
                    Arguments.argumentSet("from_va_pa_va_va", Tuple.quintet(r, s, Tuple.pair(t, u), v)),
                    Arguments.argumentSet("from_va_va_pa_va", Tuple.quintet(r, s, t, Tuple.pair(u, v))),

                    Arguments.argumentSet("from_pa_pa_va", Tuple.quintet(Tuple.pair(r, s), Tuple.pair(t, u), v)),
                    Arguments.argumentSet("from_pa_va_pa", Tuple.quintet(Tuple.pair(r, s), t, Tuple.pair(u, v))),
                    Arguments.argumentSet("from_va_pa_pa", Tuple.quintet(r, Tuple.pair(s, t), Tuple.pair(u, v))),

                    Arguments.argumentSet("from_tr_va_va", Tuple.quintet(Tuple.triplet(r, s, t), u, v)),
                    Arguments.argumentSet("from_va_tr_va", Tuple.quintet(r, Tuple.triplet(s, t, u), v)),
                    Arguments.argumentSet("from_va_va_tr", Tuple.quintet(r, s, Tuple.triplet(t, u , v))),

                    Arguments.argumentSet("from_qa_va", Tuple.quintet(Tuple.quartet(r, s, t, u), v)),
                    Arguments.argumentSet("from_va_qa", Tuple.quintet(r, Tuple.quartet(s, t, u, v))),

                    Arguments.argumentSet("from_tr_pa", Tuple.quintet(Tuple.triplet(r, s, t), Tuple.pair(u, v))),
                    Arguments.argumentSet("from_pa_tr", Tuple.quintet(Tuple.pair(r, s), Tuple.triplet(t, u , v)))
            );
        }
    }

    static class SextetArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.argumentSet("from_values", Tuple.sextet(r, s, t, u, v, w)),

                    Arguments.argumentSet("from_pa_va_va_va_va", Tuple.sextet(Tuple.pair(r, s), t, u, v, w)),
                    Arguments.argumentSet("from_va_pa_va_va_va", Tuple.sextet(r, Tuple.pair(s, t), u, v, w)),
                    Arguments.argumentSet("from_va_va_pa_va_va", Tuple.sextet(r, s, Tuple.pair(t, u), v, w)),
                    Arguments.argumentSet("from_va_va_va_pa_va", Tuple.sextet(r, s, t, Tuple.pair(u, v), w)),
                    Arguments.argumentSet("from_va_va_va_va_pa", Tuple.sextet(r, s, t, u, Tuple.pair(v, w))),
                    
                    Arguments.argumentSet("from_pa_pa_va_va", Tuple.sextet(Tuple.pair(r, s), Tuple.pair(t, u), v, w)),
                    Arguments.argumentSet("from_pa_va_pa_va", Tuple.sextet(Tuple.pair(r, s), t, Tuple.pair(u, v), w)),
                    Arguments.argumentSet("from_pa_va_va_pa", Tuple.sextet(Tuple.pair(r, s), t, u, Tuple.pair(v, w))),
                    Arguments.argumentSet("from_va_pa_pa_va", Tuple.sextet(r, Tuple.pair(s, t), Tuple.pair(u, v), w)),
                    Arguments.argumentSet("from_va_pa_va_pa", Tuple.sextet(r, Tuple.pair(s, t), u, Tuple.pair(v, w))),
                    Arguments.argumentSet("from_va_va_pa_pa", Tuple.sextet(r, s, Tuple.pair(t, u), Tuple.pair(v, w))),
                    Arguments.argumentSet("from_pa_pa_pa", Tuple.sextet(Tuple.pair(r, s), Tuple.pair(t, u), Tuple.pair(v, w))),

                    Arguments.argumentSet("from_tr_va_va_va", Tuple.sextet(Tuple.triplet(r, s, t), u, v, w)),
                    Arguments.argumentSet("from_va_tr_va_va", Tuple.sextet(r, Tuple.triplet(s, t, u), v, w)),
                    Arguments.argumentSet("from_va_va_tr_va", Tuple.sextet(r, s, Tuple.triplet(t, u , v), w)),
                    Arguments.argumentSet("from_va_va_va_tr", Tuple.sextet(r, s, t, Tuple.triplet(u , v, w))),
                    Arguments.argumentSet("from_tr_tr", Tuple.sextet(Tuple.triplet(r, s, t), Tuple.triplet(u , v, w))),

                    Arguments.argumentSet("from_qa_va_va", Tuple.sextet(Tuple.quartet(r, s, t, u), v, w)),
                    Arguments.argumentSet("from_va_qa_va", Tuple.sextet(r, Tuple.quartet(s, t, u, v), w)),
                    Arguments.argumentSet("from_va_va_qa", Tuple.sextet(r, s, Tuple.quartet(t, u, v, w))),

                    Arguments.argumentSet("from_qi_va", Tuple.sextet(Tuple.quintet(r, s, t, u, v), w)),
                    Arguments.argumentSet("from_va_qa", Tuple.sextet(r, Tuple.quintet(s, t, u, v, w))),

                    Arguments.argumentSet("from_tr_pa_va", Tuple.sextet(Tuple.triplet(r, s, t), Tuple.pair(u, v), w)),
                    Arguments.argumentSet("from_pa_tr_va", Tuple.sextet(Tuple.pair(r, s), Tuple.triplet(t, u , v), w)),
                    Arguments.argumentSet("from_tr_va_pa", Tuple.sextet(Tuple.triplet(r, s, t), u, Tuple.pair(v, w))),
                    Arguments.argumentSet("from_pa_va_tr", Tuple.sextet(Tuple.pair(r, s), t, Tuple.triplet(u, v, w))),
                    Arguments.argumentSet("from_va_tr_pa", Tuple.sextet(r, Tuple.triplet(s, t, u), Tuple.pair(v, w))),
                    Arguments.argumentSet("from_va_pa_tr", Tuple.sextet(r, Tuple.pair(s, t), Tuple.triplet(u, v, w))),

                    Arguments.argumentSet("from_sx_pa", Tuple.sextet(Tuple.quartet(r, s, t, u), Tuple.pair(v, w))),
                    Arguments.argumentSet("from_pa_sx", Tuple.sextet(Tuple.pair(r, s), Tuple.quartet(t, u, v, w)))
            );
        }
    }

    @ParameterizedTest
    @ArgumentsSource(PairArgumentsProvider.class)
    void test_pair() {
        IPair<Long, Long> tuple = Tuple.pair(r, s);
        assertEquals(r, tuple.get0());
        assertEquals(s, tuple.get1());
    }

    @ParameterizedTest
    @ArgumentsSource(TripletArgumentsProvider.class)
    void test_triplet(ITriplet<Long, Long, Long> tuple) {
        assertEquals(r, tuple.get0());
        assertEquals(s, tuple.get1());
        assertEquals(t, tuple.get2());
    }

    @ParameterizedTest
    @ArgumentsSource(QuartetArgumentsProvider.class)
    void test_quartet(IQuartet<Long, Long, Long, Long> tuple) {
        assertEquals(r, tuple.get0());
        assertEquals(s, tuple.get1());
        assertEquals(t, tuple.get2());
        assertEquals(u, tuple.get3());
    }

    @ParameterizedTest
    @ArgumentsSource(QuintetArgumentsProvider.class)
    void test_quintet(IQuintet<Long, Long, Long, Long, Long> tuple) {
        assertEquals(r, tuple.get0());
        assertEquals(s, tuple.get1());
        assertEquals(t, tuple.get2());
        assertEquals(u, tuple.get3());
        assertEquals(v, tuple.get4());
    }

    @ParameterizedTest
    @ArgumentsSource(SextetArgumentsProvider.class)
    void test_sextet(ISextet<Long, Long, Long, Long, Long, Long> tuple) {
        assertEquals(r, tuple.get0());
        assertEquals(s, tuple.get1());
        assertEquals(t, tuple.get2());
        assertEquals(u, tuple.get3());
        assertEquals(v, tuple.get4());
        assertEquals(w, tuple.get5());
    }
}
