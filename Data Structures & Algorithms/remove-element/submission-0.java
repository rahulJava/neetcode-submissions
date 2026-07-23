class Solution {
    public int removeElement(int[] nums, int val) {
         int k = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If current element is not the target value, keep it
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        // k is the count of elements not equal to val
        return k;
    }
}