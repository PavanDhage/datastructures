public class FactoringInteger {
     static void main(String[] args)
    { // Print the prime factors of N.
        long N = 3757208;
        long n = N;
        long i;
        for (i = 2; i <= n/i; i++)
        { // Test whether i is a factor.
            while (n % i == 0)
            { // Cast out and print i factors,
                n /= i;
                System.out.print(i + " ");
            } // Any factors of n are greater than i.
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}
