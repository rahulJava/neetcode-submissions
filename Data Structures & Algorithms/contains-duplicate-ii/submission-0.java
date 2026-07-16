class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map to store the value and its most recent index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Check if we have seen this number before
            if (map.containsKey(nums[i])) {
                // Check if the distance satisfies the condition
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the map with the current index
            map.put(nums[i], i);
        }
        
        return false;
    }
}