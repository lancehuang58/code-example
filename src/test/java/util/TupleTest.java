package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TupleTest {

    @Test
    void test() {
        Tuple<String, Integer> tuple = new Tuple<>("hi", 47);
        assertEquals(tuple.t(), "hi");
        assertEquals(tuple.u(), 47);
    }

}