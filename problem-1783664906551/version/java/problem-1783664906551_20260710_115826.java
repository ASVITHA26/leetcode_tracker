// Last updated: 10/07/2026, 11:58:26
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        if (nums.length <= 2) {
5            return nums.length;
6        }
7
8        int i = 2;
9
10        for (int j = 2; j < nums.length; j++) {
11
12            if (nums[j] != nums[i - 2]) {
13                nums[i] = nums[j];
14                i++;
15            }
16        }
17
18        return i;
19    }
20}