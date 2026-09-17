package array;

public class DuplicateNumber {
    static void main() {
        //Constraints:
        //2 <= n <= 3 * 104
        //nums.length == n + 1
        //1 <= nums[i] <= n
        //All the integers in nums appear only once except for precisely one integer which appears two or more times.
        //
        //Follow up:
        //How can we prove that at least one duplicate number must exist in nums?
        //Can you solve the problem without modifying the array nums?
        //Can you solve the problem using only constant, O(1) extra space?
        //Can you solve the problem with runtime complexity less than O(n2)?
        //*/
        int[] nums = {1,2,3,3,4,5}; //OP = 3

        // BRUTE FORCE

        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && i!=j){
                    System.out.println(nums[i]);
                }
            }
        }
    }
}
