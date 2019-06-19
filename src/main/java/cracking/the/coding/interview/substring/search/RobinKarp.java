package cracking.the.coding.interview.substring.search;

public class RobinKarp {

    private HornerHashComputationMethod hornerHashComputationMethod;

    private String pattern;

    private long patternHashValue;

    /**
     * represents the constant-valued outcome of the formula:
     * <pre>
     *     R^(M-1) mod Q
     * </pre>
     * where {@code R} is the radix, {@code M} is the length
     * of the target substring and {@code Q} is the modulus.
     */
    private long computationConstant;

    private boolean initialized;

    public RobinKarp(HornerHashComputationMethod hornerHashComputationMethod, String pattern) {

        this.hornerHashComputationMethod = hornerHashComputationMethod;
        this.pattern = pattern;
        //this.radix = this.hornerHashComputationMethod.getRadix();
        //this.modulus = this.hornerHashComputationMethod.getModulus();

    }

    public void initialize() {

        System.out.println("Pre-computation of required parameters is being made...");

        this.patternHashValue = this.hornerHashComputationMethod.computeHash(this.pattern);
        System.out.println("Pattern hash code: " + this.patternHashValue);

        this.computationConstant = computeConstant(this.hornerHashComputationMethod, this.pattern.length());
        System.out.println("Computation constant: " + this.computationConstant);

        this.initialized = true;

    }

    private long computeConstant(HornerHashComputationMethod hornerHashComputationMethod, int patternLength) {

        long computationConstant = 1L;

        for (int i = 0; i < patternLength - 1; i++)
            computationConstant = (hornerHashComputationMethod.getRadix() * computationConstant) % hornerHashComputationMethod.getModulus();

        return computationConstant;

    }

    /**
     * searches the specified text for the given substring (or pattern) with the following procedure:
     * <p>
     * <ol>
     * <li>Use 'Horner's Rule' for the first M entries where M stands for the substring length.</li>
     * <li>Use 'rolling hash' and modulo operation (to avoid overflow) for the remaining entries.</li>
     * </ol>
     * </p>
     * Rolling hash function has been optimized as the below formula demonstrates:
     * <pre>
     *     x<sub>i+1</sub> = (x<sub>i</sub> - t<sub>i</sub>R<sup>M-1</sup>)R + t<sub>i+M</sub>
     * </pre>
     * where x<sub>i</sub> is previously computed hash value, t<sub>i</sub> is the old character ASCII code,
     * R<sup>M-1</sup> is the computation constant, R is the radix, t<sub>i+M</sub> is the new character
     * ASCII code and M is the length of the substring.
     *
     * @param text represents the text to be searched for.
     * @return the index found.
     */
    public int search(String text) {

        long textHashValue = 0L;

        checkEntranceCondition();

        textHashValue = this.hornerHashComputationMethod.computeHash(text, this.pattern.length());

        if (this.patternHashValue == textHashValue)
            return 0;
        else {

            return new RollingHashFunction(this.hornerHashComputationMethod, this.computationConstant, this.patternHashValue, textHashValue)
                    .search(text, this.pattern);

        }

    }

    private void checkEntranceCondition() {

        if (!this.initialized)
            throw new IllegalStateException("Cannot search the text for the specified pattern without initializing the Robin-Karp search probe!");

    }

}
