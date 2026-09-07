package Math;

import java.util.Arrays;

public class DecToBinary {
    static void main() {
        int a = 10;
        int bin = 0;
        int i =0;
        int[] arr = new int[10];
        while(a!=0){
            int temp = a%2;
            //append  -> reverse
            arr[i] = temp;
            i=i+1;
        }

        }

}
