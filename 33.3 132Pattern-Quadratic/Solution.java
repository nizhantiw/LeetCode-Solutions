class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > min && nums[i] > nums[j] && min < nums[j])
                    return true;
            }
            min = Math.min(min, nums[i]);
        }
        return false;
    }
}

/*
TC: O(n^2) -- Time Limit Exceeded
SC: O(1)
*/