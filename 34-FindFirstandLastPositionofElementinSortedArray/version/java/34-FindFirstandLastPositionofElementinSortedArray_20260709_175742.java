// Last updated: 09/07/2026, 17:57:42
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4        int i = n - 2;
5        while (i >= 0 && nums[i] >= nums[i + 1]) {
6            i--;
7        }
8        if (i >= 0) {
9            int j = n - 1;
10            while (nums[j] <= nums[i]) {
11                j--;
12            }
13            swap(nums, i, j);
14        }
15        reverse(nums, i + 1, n - 1);
16    }
17
18    private void swap(int[] nums, int i, int j) {
19        int temp = nums[i];
20        nums[i] = nums[j];
21        nums[j] = temp;
22    }
23
24    private void reverse(int[] nums, int left, int right) {
25        while (left < right) {
26            swap(nums, left, right);
27            left++;
28            right--;
29        }
30    }
31}