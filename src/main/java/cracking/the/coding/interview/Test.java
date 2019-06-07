package cracking.the.coding.interview;

public class Test {

    public static void main(String[] args) {

        System.out.println("f(4): " + f(4));

    }

    static int f(int n) {

        if(n<=1)
            return 1;

        return f(n-1) + f(n-1);

    }

}
