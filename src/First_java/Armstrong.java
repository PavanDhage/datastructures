package First_java;

import java.util.Scanner;

public class Armstrong {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i =a;i<=b;i++){
            int n=i;
            int sum=0;
            while(n>0) {
                int x = n % 10;
                n = n / 10;
                sum = sum + (x * x * x);
            }
            if(sum == i){
                System.out.println("Armstrong number: "+ i);
            }
//            else
//                System.out.println("not armstrong number");
        }
    }
}
