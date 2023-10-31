package generics;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetsTest {

    static Set<String> a = Set.of("A", "B", "C");
    static Set<String> b = Set.of("D", "B", "C");

    @Test
    void test_union() {
        Set<String> set = Sets.union(a, b);
        assertThat(set).containsExactlyInAnyOrder("A", "B", "C", "D");
    }

    @Test
    void test_intersection() {
        Set<String> set = Sets.intersection(a, b);
        assertThat(set).containsExactlyInAnyOrder("C", "B");
    }

    @Test
    void test_difference() {
        Set<String> set = Sets.difference(a, b);
        assertThat(set).containsExactlyInAnyOrder("A");
    }

    @Test
    void test_complement() {
        Set<String> set = Sets.complement(a, b);
        assertThat(set).containsExactlyInAnyOrder("A", "D");
    }
}