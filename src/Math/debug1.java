package Math;

public class debug1 {
    static void main() {
        int n = 1234567890;
        int m =0;
        while(n!=0){
            m = (m*10) + (n%10);
            n=n/10;
        }
        System.out.println(m);
        System.out.println(n);
    }

    // it reverses the number , also omitts the 0 in the beginning how to keep the zero also
}
