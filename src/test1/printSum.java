package test1;

import java.util.Scanner;

public class printSum {

    static void sumtillX(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum =0;
        while(!s.equalsIgnoreCase("x")){
            sum = sum + Integer.parseInt(s);
            s = sc.next();
        }
        System.out.println(sum);
    }
    static void main() {
//        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nums till 0");
        int x = sc.nextInt();
        int sum =0;
        while(x!=0){
            sum = sum +x;
            x=sc.nextInt();
        }
        System.out.println(sum);

        System.out.println("till x");sumtillX();
    }
}
