class Solution {
    public int singleNumber(int[] nums) {
        

		int max =0 ;

		for (int i = 0; i < nums.length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < nums.length; j++) {

				if (i != j && nums[i] == nums[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
               max = nums[i];
				System.out.println(nums[i]);
				break;
			}
		}
    return max;
    }
}