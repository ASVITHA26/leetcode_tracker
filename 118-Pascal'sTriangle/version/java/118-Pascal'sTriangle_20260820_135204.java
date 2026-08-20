// Last updated: 20/08/2026, 13:52:04
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int count1 = 0, count2 = 0; 
4        int candidate1 = 0, candidate2 = 0; 
5        for (int i = 0; i < nums.length; i++) {
6            if (count1 == 0 && nums[i] != candidate2) {
7                count1 = 1;
8                candidate1 = nums[i];
9            } 
10            else if (count2 == 0 && nums[i] != candidate1) {
11                count2 = 1;
12                candidate2 = nums[i];
13            } 
14            else if (candidate1 == nums[i]) {
15                count1++;
16            } else if (candidate2 == nums[i]) {
17                count2++;
18            } 
19            else {
20                count1--;
21                count2--;
22            }
23        }
24        List<Integer> result = new ArrayList<>();
25        int threshold = nums.length / 3; 
26        count1 = 0;
27        count2 = 0;
28        for (int i = 0; i < nums.length; i++) {
29            if (candidate1 == nums[i]) {
30                count1++;
31            } else if (candidate2 == nums[i]) {
32                count2++;
33            }
34        }
35        if (count1 > threshold) {
36            result.add(candidate1);
37        }
38        if (count2 > threshold) {
39            result.add(candidate2);
40        }
41        return result;
42    }
43}