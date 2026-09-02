// Last updated: 02/09/2026, 09:47:38
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list= new ArrayList<>();
        int max=0;
        int min=101;
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        boolean[] helper =new boolean[max+1];
        for(int num:nums){
            helper[num]=true;
        }
        for(int i=min;i<=max;i++){
            if(!helper[i]){             
                list.add(i);
            }
        }
        return list;
    }
}