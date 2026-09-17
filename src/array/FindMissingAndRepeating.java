package array;

import java.util.Arrays;

public class FindMissingAndRepeating {

    // ip {1, 3, 3}
    //op 3 2 {repeating no , missing no}
    static void main() {
        int[] arr = {1,3,3};
        int[] ans = new int[2];

        int sum =0;
        for(int i =0 ;i<arr.length;i++){
            sum = sum+ arr[i];
            if(arr[i] != i+1) {
                ans[1] = i+1;
            }
        }
        int n = arr.length;
        int x = (n*(n+1))/2;
        int m = sum-ans[1];
        int c = x-m;
        ans[0] = ans[1]+c;
        System.out.println(Arrays.toString(ans));
    }
}
