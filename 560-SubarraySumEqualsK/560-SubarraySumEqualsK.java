// Last updated: 02/09/2026, 09:48:32
class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
           int sum=0;
           for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            if(sum==k){
                c++;
            }
           }
        }
            return c;
        }
}