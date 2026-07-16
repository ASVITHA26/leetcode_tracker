// Last updated: 16/07/2026, 12:18:33
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> list= new ArrayList<>();
4        int max=0;
5        int min=101;
6        for(int num:nums){
7            if(num>max){
8                max=num;
9            }
10            if(num<min){
11                min=num;
12            }
13        }
14        boolean[] helper =new boolean[max+1];
15        for(int num:nums){
16            helper[num]=true;
17        }
18        for(int i=min;i<=max;i++){
19            if(!helper[i]){             
20                list.add(i);
21            }
22        }
23        return list;
24    }
25}