package cracking.the.coding.interview.substring.search;

public class BruteForce {

    public int search(String text, String pattern) {

        int textLength = text.length(), patternLength = pattern.length();

        for (int i = 0; i <= textLength - patternLength; i++) {

            int j;

            for (j = 0; j < patternLength; j++) {

                if (text.charAt(i + j) != pattern.charAt(j))
                    break;

            }

            if (j == patternLength)
                return i;

        }

        return -1;

    }

}
