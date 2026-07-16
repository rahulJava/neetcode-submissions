class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          List<List<Integer>> result = new ArrayList<>();
        // Sort to handle duplicates and enable pruning
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same recursion level
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            
            tempList.add(candidates[i]);
            // Recurse with i + 1 because each element can be used only once
            backtrack(result, tempList, candidates, remain - candidates[i], i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    

}
