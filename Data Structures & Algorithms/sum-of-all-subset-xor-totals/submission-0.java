class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int xorSoFar) {
        if (index == nums.length) {
            return xorSoFar;
        }

        // Exclude current element + include current element
        return dfs(nums, index + 1, xorSoFar)
             + dfs(nums, index + 1, xorSoFar ^ nums[index]);
    }
}