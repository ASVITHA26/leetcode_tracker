// Last updated: 27/07/2026, 14:12:17
1class Solution {
2    public int findMaxForm(String[] strs, int m, int n) {
3        int dp[][]=new int[m+1][n+1];
4        for(int i=0;i<strs.length;i++){
5            int z=0;int o=0;
6            for(int j=0;j<strs[i].length();j++){
7            if(strs[i].charAt(j)=='0'){
8                z++;
9            }
10            else if(strs[i].charAt(j)=='1'){
11                o++;
12            }
13            }
14            for(int k=m;k>=z;k--){
15                for(int l=n;l>=o;l--){
16                    dp[k][l]=Math.max(dp[k][l],dp[k-z][l-o]+1);
17                }
18            }
19        }
20        return dp[m][n];
21    }
22}