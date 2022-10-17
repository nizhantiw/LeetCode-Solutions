class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j] && nums[i] < nums[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

/*
TC: O(n^3) -- Time Limit Exceeded
SC: O(1)
*/