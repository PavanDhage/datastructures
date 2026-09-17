package First_java;

import java.util.Scanner;

public class OddEven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
}
