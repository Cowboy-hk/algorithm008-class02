class Solution {
    public void moveZeroes(int[] nums) {
        int zero_num = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                zero_num ++;
            } else {
                if (zero_num > 0) {
                    nums[i - zero_num] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}
