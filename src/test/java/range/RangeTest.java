package range;

import org.junit.jupiter.api.Test;

class RangeTest {

    @Test
    void range() {
        for (int i : Range.range(10)) {
            System.out.print(i + " ");
        }
    }
}