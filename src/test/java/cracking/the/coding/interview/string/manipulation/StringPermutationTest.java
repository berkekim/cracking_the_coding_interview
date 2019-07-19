package cracking.the.coding.interview.string.manipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringPermutationTest {

    private StringPermutation stringPermutation;

    @BeforeEach
    void setUp() {

        this.stringPermutation = new StringPermutation();

    }

    @Test
    void permutation_validStringAndPrefix_permutationsObtained() {

        /* interactions. */
        this.stringPermutation.permutation("abc", "");

        /* assertions. */
        assertAll("Should return all six permutations for the string 'abc'.",
                () -> assertEquals("abc", this.stringPermutation.getPermutations().get(0), "Expected and actual values are not the same!"),
                () -> assertEquals("acb", this.stringPermutation.getPermutations().get(1), "Expected and actual values are not the same!"),
                () -> assertEquals("bac", this.stringPermutation.getPermutations().get(2), "Expected and actual values are not the same!"),
                () -> assertEquals("bca", this.stringPermutation.getPermutations().get(3), "Expected and actual values are not the same!"),
                () -> assertEquals("cab", this.stringPermutation.getPermutations().get(4), "Expected and actual values are not the same!"),
                () -> assertEquals("cba", this.stringPermutation.getPermutations().get(5), "Expected and actual values are not the same!")
        );

    }

}
