package cracking.the.coding.interview.substring.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BruteForceTest {

    private BruteForce bruteForce;

    @BeforeEach
    void setUp() {

        this.bruteForce = new BruteForce();

    }

    @Test
    void search_stringContainsSubstring_indexFound() {

        /* interaction. */
        int actual = bruteForce.search("abacadabrac", "abra");

        /* assertions. */
        assertEquals(6, actual, "Actual and expected values of the index found should be the same!");

    }

    @Test
    void search_stringDoesNotContainSubstring_indexNotFound() {

        /* interaction. */
        int actual = bruteForce.search("abacadabrac", "zzz");

        /* assertions. */
        assertEquals(-1, actual, "Actual and expected values of the index found should be the same!");

    }

}
