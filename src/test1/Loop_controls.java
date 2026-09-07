package test1;

public class Loop_controls {

    public static String coinFlip() {
        String flipres = "";
        if (Math.random() < 0.5)
            flipres = "heads";
        else
            flipres = "tails";
        return flipres;
    }

    public static void printnthHello(int n) {
        String[] arr = {"st", "nd", "rd"};
        int i;
        for (i = 0; i < n; i++) {
            int j = i % 10;
            if (j < 3)
                System.out.println(i + 1 + arr[j] + "Hello");
            else
                System.out.println(i + 1 + "th" + "Hello");
        }
    }

    public static int powOfTwo(int n) {
        int val = 1;
        int i = 0;
        while (val * 2 < n) {
            val = val * 2;
            i++;
        }
        return val;
    }


    //This program takes aninteger Hasthe command-line argument and uses nested for loops to
    //print an N-by-N table with an asterisk in row i andcolumn j if either i divides j or j divides
    //i. The loop control variables i andj control the computation.
    public static void DivisorPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j % i == 0) || (i % j == 0)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }

    public static double sqroot(int c){
        double epsilon = 1e-15;
        double t =c;

        while(Math.abs(t-c/t)> epsilon*t){
            // replace t by average of t and c/t
            t = (t+c/t)/2;
        }
        return t;
    }

    public static void main(String[] args){
        System.out.println(434);
        String res = coinFlip();
        System.out.println("coin flip res :" + res);

        int n =10;

        printnthHello(n);

        System.out.println();

        int r=4589;
        System.out.println("largest pow of 2 before n: " + powOfTwo(r));

        DivisorPattern(12);

        System.out.println("sqrt of number : " + sqroot(2));


    }
}
