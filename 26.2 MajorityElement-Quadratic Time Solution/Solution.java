class Solution {
    public int majorityElement(int[] nums) {
        int n = (int) nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }            
            if (n <= count) {
                return nums[i];
            }
        }
        return -1;
    }
}

/*
TC: O(n^2)
SC: O(1)
*/