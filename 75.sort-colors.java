/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length -1-i ; j++){
                if(nums[j] > nums [j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

}
// @lc code=end

