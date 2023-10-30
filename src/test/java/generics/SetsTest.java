package generics;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class SetsTest {

    @Test
    void test_union() {
        Set<String> a = new HashSet<>();
        a.add("A");
        Set<String> b = new HashSet<>();
        b.add("B");
        Set<String> set = Sets.union(a, b);
        assertThat(set).containsExactlyInAnyOrder("A", "B");
    }

    @Test
    void test_intersection() {
        Set<String> a = Set.of("A", "B", "C");
        Set<String> b = Set.of("D", "B", "C");
        Set<String> set = Sets.intersection(a, b);
        assertThat(set).containsExactlyInAnyOrder("C", "B");
    }
}