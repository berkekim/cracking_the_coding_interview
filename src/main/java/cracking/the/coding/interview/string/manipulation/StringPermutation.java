package cracking.the.coding.interview.string.manipulation;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    private List<String> permutations;

    public StringPermutation() {

        this.permutations = new ArrayList<>();

    }

    public void permutation(String str, String prefix) {

        //System.out.printf( "permutation(%s, %s)\n", str, prefix);

        if (str.length() == 0) {

            // System.out.println("Prefix: " + prefix);
            this.permutations.add(prefix);

        } else
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }

    }

    public List<String> getPermutations() {

        return permutations;

    }

}
