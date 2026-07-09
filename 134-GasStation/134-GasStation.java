// Last updated: 09/07/2026, 18:21:03
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int tg=0;
       int tc=0;
       int tank=0;
       int s=0;
       for(int i=0;i<gas.length;i++){
        tg+=gas[i];
        tc+=cost[i];
        tank+=gas[i]-cost[i];
        if(tank<0){
            s=i+1;
            tank=0;
        }
       }
       if(tg<tc){
        return -1;
       }
        return s; 
    }
   
}