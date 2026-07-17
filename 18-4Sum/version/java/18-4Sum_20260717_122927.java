// Last updated: 17/07/2026, 12:29:27
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(nums);
5        int n = nums.length;
6        for(int i = 0 ; i<n - 3 ; i++){
7            if(i>0 && nums[i] == nums[i-1] ) continue;
8            for(int j = i+1 ; j<n-2 ; j++){
9                if(j> i+1 && nums[j]==nums[j-1]) continue;
10                int l = j+1;
11                int r = n-1;
12                while(l<r){
13                    long sum =(long) nums[i] + nums[j] + nums[l]+nums[r];
14                    if(sum==target){
15                        list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
16                        while(l<r && nums[l] == nums[l+1]) l++;
17                        while(l<r && nums[r]==nums[r-1]) r--;
18                        l++;
19                        r--;
20                    }else if(sum>target){
21                        r--;
22                    }else{
23                        l++;
24                    }
25                }
26            }
27        }
28        return list;
29    }
30}