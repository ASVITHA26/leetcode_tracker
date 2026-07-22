// Last updated: 22/07/2026, 13:49:48
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, -1);
5
6        int sum = 0;
7        for(int i = 0; i < nums.length; i++) {
8            sum += nums[i];
9            int rem = sum % k;
10
11            Integer pre = map.get(rem);
12            if(pre != null){ 
13                if(i - pre >= 2){
14
15                return true;
16                }
17            }else{
18                map.put(rem, i);
19            }
20        }
21    return false;
22    }
23}