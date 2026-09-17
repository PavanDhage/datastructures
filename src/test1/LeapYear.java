package test1;

import java.util.Scanner;

public class LeapYear {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year %4 == 0){
            System.out.println("leap year");
        }
        else
            System.out.println("not leap year");
    }
}
