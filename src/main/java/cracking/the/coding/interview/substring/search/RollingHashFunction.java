package cracking.the.coding.interview.substring.search;

public class RollingHashFunction {

    private HornerHashComputationMethod hornerHashComputationMethod;

    private long computationConstant;

    private long patternHashValue;

    private long previousTextHashValue;

    public RollingHashFunction(HornerHashComputationMethod hornerHashComputationMethod, long computationConstant, long patternHashValue, long previousTextHashValue) {

        this.hornerHashComputationMethod = hornerHashComputationMethod;
        this.computationConstant = computationConstant;
        this.patternHashValue = patternHashValue;
        this.previousTextHashValue = previousTextHashValue;

    }

    public int search(String text, String pattern) {

        long textHashValue = this.previousTextHashValue, rightOperand;

        for (int i = pattern.length(); i < text.length(); i++) {

            rightOperand = (text.charAt(i - pattern.length()) * this.computationConstant) % this.hornerHashComputationMethod.getModulus();

            textHashValue = (textHashValue - rightOperand) * this.hornerHashComputationMethod.getRadix();

            /* (a % b + b) % b */
            textHashValue = (((textHashValue + text.charAt(i)) % this.hornerHashComputationMethod.getModulus()) + this.hornerHashComputationMethod.getModulus()) % this.hornerHashComputationMethod.getModulus();

            // Las Vegas Version
            if (this.patternHashValue == textHashValue)
                return i - pattern.length() + 1;

        }

        return text.length();

    }

}
