// Last updated: 11/08/2026, 15:57:31
1class Solution {
2    public int[] smallestRange(List<List<Integer>> nums) {
3        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
4        int curMax = Integer.MIN_VALUE;
5        for (int i = 0; i < nums.size(); i++) {
6            minHeap.offer(new int[]{nums.get(i).get(0), i, 0});
7            curMax = Math.max(curMax, nums.get(i).get(0));
8        }
9        int[] smallRange = new int[]{0, Integer.MAX_VALUE};
10
11        while (true) {
12            int[] curr = minHeap.poll();
13            int curMin = curr[0], listIdx = curr[1], elemIdx = curr[2];
14
15            if (curMax - curMin < smallRange[1] - smallRange[0]) {
16                smallRange[0] = curMin;
17                smallRange[1] = curMax;
18            }
19
20            if (elemIdx + 1 < nums.get(listIdx).size()) {
21                int nextVal = nums.get(listIdx).get(elemIdx + 1);
22                minHeap.offer(new int[]{nextVal, listIdx, elemIdx + 1});
23                curMax = Math.max(curMax, nextVal);
24            } else {
25                break;
26            }
27        }
28        return smallRange;
29    }
30}