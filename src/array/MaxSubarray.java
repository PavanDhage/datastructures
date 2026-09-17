package array;

import javax.management.MBeanAttributeInfo;

public class MaxSubarray {
    //Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    //
    //Example 1:
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: [4,-1,2,1] has the largest sum = 6.

    //
//    Constraints:
//            1 <= nums.length <= 3 * 104
//            -105 <= nums[i] <= 105
//
//    Follow up: If you have figured out the O(n) solution, try coding another solution using the divide
//    and conquer approach, which is more subtle.

    static void main() {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {5,4,-1,7,8};
        int max =Integer.MIN_VALUE;

        //Brute force:
//        for(int i =0 ;i<nums.length;i++){
//            int sum =0;
//            for(int j=i;j<nums.length;j++){
//                sum = sum +nums[j];
//                if(sum > max)
//                    max = sum;
//            }
//        }
//        System.out.println(max);
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum +nums[i];
            max = Math.max(max,sum);
            if(sum<0){
                sum =0;
            }
        }
        System.out.println(max);
    }
}
