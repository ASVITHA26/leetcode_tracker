// Last updated: 27/07/2026, 14:49:23
1class Solution {
2    public int singleNumber(int[] nums) {
3    int c=0;
4    for(int i=0;i<nums.length;i++){
5        boolean found=false;
6        for(int j=0;j<nums.length;j++){
7            if(i!=j&&nums[i]==nums[j]){
8                found=true;
9            }
10        }
11        if(found==false){
12            c=nums[i];
13        }
14    }
15    return c;
16    }
17}