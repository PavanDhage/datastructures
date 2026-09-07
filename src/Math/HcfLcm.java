package Math;

import java.sql.SQLOutput;

public class HcfLcm {

    static void main() {
        int a=60, b = 20;

        // find hcf of the two numbers

        System.out.println("how to get the hcf of two numbers");

        // factors of two numbers and compare
        //

        do {
            if(a%b == 0)
                break;
            b=a%b;
        }
        while(b!=0);
        System.out.println("first method: " +b);

        a = 60;
        b=20;
        int temp;
        while(b!=0){
            temp = b;
            b= a%b;
            a=temp;
        }
        System.out.println("second method: " + a);
    }

}
