// Last updated: 18/08/2026, 11:20:18
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List < List < Integer >> ans = new ArrayList < > ();
4        Arrays.sort(candidates);
5        findCombinations(0, candidates, target, ans, new ArrayList < > ());
6        return ans;
7    }
8    static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
9        if (target == 0) {
10            ans.add(new ArrayList < > (ds));
11            return;
12        }
13        for (int i = ind; i < arr.length; i++) {
14            if (i > ind && arr[i] == arr[i - 1]) continue;
15            if (arr[i] > target) break;
16
17            ds.add(arr[i]);
18            findCombinations(i + 1, arr, target - arr[i], ans, ds);
19            ds.remove(ds.size() - 1);
20        }
21    }
22}