package cracking.the.coding.interview.substring.search;

import java.util.Objects;

/**
 * represents the {@code Horner's method} which provides
 * a linear-time method to evaluate degree-M polynomial.
 */
public class HornerHashComputationMethod {

    private static final int DEFAULT_RADIX = 256;

    private int radix;

    /**
     * represents a large prime number. Avoid overflow.
     */
    private long modulus;

    public HornerHashComputationMethod(long modulus) {

        this(DEFAULT_RADIX, modulus);

    }

    public HornerHashComputationMethod(int radix, long modulus) {

        this.radix = radix;
        this.modulus = modulus;

    }

    /**
     * computes hash code for the specified text.
     *
     * @param text represents the specified String.
     * @return a {@code long} numeric value.
     * @see #computeHash(String, int)
     */
    public long computeHash(String text) {

        return computeHash(text, text.length());

    }

    /**
     * computes hash code for the specified text
     * and the given {@code pattern} or {@code substring}'s
     * length.
     *
     * @param text          represents the specified String.
     * @param patternLength represents the substring length.
     * @return a {@code long} numeric value.
     */
    public long computeHash(String text, int patternLength) {

        long hashCode = 0L;

        Objects.requireNonNull(text, "Text cannot be null!");

        for (int i = 0; i < patternLength; i++)
            hashCode = (hashCode * this.radix + text.charAt(i)) % this.modulus;

        return hashCode;

    }

    public int getRadix() {

        return radix;

    }

    public long getModulus() {

        return modulus;

    }

}
