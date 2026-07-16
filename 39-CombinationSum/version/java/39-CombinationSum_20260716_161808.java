// Last updated: 16/07/2026, 16:18:08
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        makeCombination(candidates, target, 0, new ArrayList<>(), 0, res);
5        return res;        
6    }
7    private void makeCombination(int[] candidates, int target, int idx, List<Integer> comb, int total, List<List<Integer>> res) {
8        if (total == target) {
9            res.add(new ArrayList<>(comb));
10            return;
11        }
12        if (total > target || idx >= candidates.length) {
13            return;
14        }
15        comb.add(candidates[idx]);
16        makeCombination(candidates, target, idx, comb, total + candidates[idx], res);
17        comb.remove(comb.size() - 1);
18        makeCombination(candidates, target, idx + 1, comb, total, res);
19    }    
20}