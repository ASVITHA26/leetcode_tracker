// Last updated: 09/07/2026, 18:17:09
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3       int tg=0;
4       int tc=0;
5       int tank=0;
6       int s=0;
7       for(int i=0;i<gas.length;i++){
8        tg+=gas[i];
9        tc+=cost[i];
10        tank+=gas[i]-cost[i];
11        if(tank<0){
12            s=i+1;
13            tank=0;
14        }
15       }
16       if(tg<tc){
17        return -1;
18       }
19        return s; 
20    }
21   
22}