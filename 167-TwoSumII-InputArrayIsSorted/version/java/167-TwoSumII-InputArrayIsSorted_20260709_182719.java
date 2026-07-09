// Last updated: 09/07/2026, 18:27:19
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        for(int i=0;i<numbers.length;i++){
4            for(int j=i+1;j<numbers.length;j++){
5                if(numbers[i]+numbers[j]==target){
6                    return new int[]{i + 1, j + 1};
7                }
8            }
9        }
10        return new int[]{-1, -1};
11    }
12}