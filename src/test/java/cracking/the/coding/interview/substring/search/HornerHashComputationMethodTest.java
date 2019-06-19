package cracking.the.coding.interview.substring.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HornerHashComputationMethodTest {

    private HornerHashComputationMethod hornerHashComputationMethod;
    private String fiveCharacterLengthString;
    private String sixteenCharacterLengthString;

    @BeforeEach
    void setUp() {

        this.hornerHashComputationMethod = new HornerHashComputationMethod(256, 997);
        this.fiveCharacterLengthString = "26535";
        this.sixteenCharacterLengthString = "3141592653589793";

    }

    @Test
    void computeHash_fiveCharacterLengthString_hashCodeCalculated() {

        /* interaction. */
        long actual = this.hornerHashComputationMethod.computeHash(this.fiveCharacterLengthString);

        /* assertions. */
        assertEquals(204, actual, "The expected and actual values of the calculated hash code should be the same!");

    }

    @Test
    void computeHash_sixteenCharacterLengthStringAndFiveCharacterLengthPattern_hashCodeCalculated() {

        /* interaction. */
        long actual = this.hornerHashComputationMethod.computeHash(this.sixteenCharacterLengthString, 5);

        /* assertions. */
        assertEquals(430, actual, "The expected and actual values of the calculated hash code should be the same!");

    }

}
