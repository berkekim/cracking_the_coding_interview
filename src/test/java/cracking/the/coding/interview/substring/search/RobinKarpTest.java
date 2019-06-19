package cracking.the.coding.interview.substring.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobinKarpTest {

    private RobinKarp robinKarp;
    private String stringContainsSubstring = "3141592653589793";
    private String stringDoesNotContainSubstring = "a1n2c3";
    private String pattern = "26535";

    @BeforeEach
    void setUp() {

        this.robinKarp = new RobinKarp(new HornerHashComputationMethod(256, 997), this.pattern);
        robinKarp.initialize();

    }

    @Test
    void search_stringContainsSubstring_indexFound() {

        /* interactions. */
        int actual = this.robinKarp.search(this.stringContainsSubstring);

        /* assertions. */
        assertEquals(6, actual, "The expected and actual values of the index found should be the same!");

    }

    @Test
    void search_stringDoesNotContainSubstring_indexNotFound() {

        /* interactions. */
        int actual = this.robinKarp.search(this.stringDoesNotContainSubstring);

        /* assertions. */
        assertEquals(this.stringDoesNotContainSubstring.length(), actual, "The expected and actual values of the index found should be the same!");

    }

}
