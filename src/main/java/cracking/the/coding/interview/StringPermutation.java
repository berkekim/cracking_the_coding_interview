package cracking.the.coding.interview;

public class StringPermutation {

    public static void main(String[] args) {

        StringPermutation stringPermutation = new StringPermutation();
        stringPermutation.permutation("abc", "");

    }

    public void permutation(String str, String prefix) {

        System.out.printf( "permutation(%s, %s)\n", str, prefix);

        if(str.length()==0)
            System.out.println("Prefix: " + prefix);
        else
            for(int i=0; i<str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1);
                permutation(rem, prefix + str.charAt(i));
            }

    }

}
