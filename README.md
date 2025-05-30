# Tuples

Library of tuples for Java.

## Provided types of tuples

- Pair
- Triplet
- Quartet
- Quintet
- Sextet

## Examples of usage

```java
import org.toucandev.tuples.Tuple;

class MainApplication {
    void mainMethod() {
        // Use Tuple static methods
        IPair<Long, String> pair = Tuple.pair(0, "1");
        ITriplet<Long, String, Double> triplet = Tuple.triplet(0, "1", 2.0);

        // Create a shallow copy
        IPair<Long, String> shallowCopyPair = Tuple.pair(pair);

        // Compose tuple from another tuple(s)
        ITriplet<Long, String, String> triplet2 = Tuple.pair(pair, "2");
        ISextet<Long, String, Integer, Long, String, Double> sextet = Tuple.sextet(pair, 1, triplet);
    }
}
```
