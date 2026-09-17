package Math;

import java.util.Arrays;

public class DecToBinary {
    static void main() {
        int a = 16;
        double i=1;
        int j=0;
        double temp= a;
        while(2*i<=a){
            i=2*i;
            j++;
        }
        int x = 0;
        int[] arr = new int[j+1];
        while(temp > 0){
            if(temp >= i){
                arr[x++] = 1;
                temp = temp - i;
        }
            else if(temp<i) {
                arr[x++] = 0;
            }
        i = i/2;
        }
       StringBuffer strbfr = new StringBuffer(30);
        System.out.println(strbfr.capacity());
        System.out.println(strbfr);
        for(int f:arr)
            strbfr.append(Integer.toString(f));
//        strbfr.reverse();
        System.out.println(strbfr);

        String str = "erwgf";
        String s = str.replace("er","rest");
        System.out.println(s);

    }

}
