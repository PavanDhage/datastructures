package array;

import java.util.ArrayList;
import java.util.Arrays;

public class GoodPairs {
    static void main() {
        int[] nums = {1,2,3,1,1,3};
//        int[] nums = {1,1,1,1};

//        int[] nums = new int[4];
//        nums = null;
//        char c = ;
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.add(5);
//        nums.add(6);
//        nums.add(7);
//        Integer[] i = new Integer[nums.size()];
//        i = nums.toArray(i);
//       int[] x = i.intValue();
//        System.out.println(i);
//        System.out.println(Arrays.toString(i));
        int pair=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    pair++;
                }
            }
        }
        System.out.println(pair);
    }
}
