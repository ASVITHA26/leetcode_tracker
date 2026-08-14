// Last updated: 14/08/2026, 12:02:50
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        Map<Integer, Integer> counter = new HashMap<>();
4        counter.put(0, 1);
5
6        for (int n : nums) {
7            Map<Integer, Integer> temp = new HashMap<>();
8
9            for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
10                int total = entry.getKey();
11                int count = entry.getValue();
12
13                temp.put(total + n, temp.getOrDefault(total + n, 0) + count);
14                temp.put(total - n, temp.getOrDefault(total - n, 0) + count);
15            }
16            counter = temp;
17        }
18
19        return counter.getOrDefault(target, 0);        
20    }
21}