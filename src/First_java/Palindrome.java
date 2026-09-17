package First_java;

import java.util.Scanner;

public class Palindrome
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int i=0;

        while(n>0){
            int x = n%10;
            n = n/10;
            i=i*10 + x;
        }
        if(i==num){
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}
