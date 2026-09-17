package array;

import java.util.Arrays;

public class RunningSum {
    static void main() {
        int[] nums = {1,1,1,1,1};  //[1,2,3,4,5] op
        int n = nums.length;
        int[] arr = new int[n];
        for(int i= 0;i<n;i++){
            int sum=0;
            for(int j =0;j<=i;j++){
                sum = sum+nums[j];
            }
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
