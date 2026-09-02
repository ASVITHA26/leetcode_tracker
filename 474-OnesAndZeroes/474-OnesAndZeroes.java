// Last updated: 02/09/2026, 09:48:51
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<strs.length;i++){
            int z=0;int o=0;
            for(int j=0;j<strs[i].length();j++){
            if(strs[i].charAt(j)=='0'){
                z++;
            }
            else if(strs[i].charAt(j)=='1'){
                o++;
            }
            }
            for(int k=m;k>=z;k--){
                for(int l=n;l>=o;l--){
                    dp[k][l]=Math.max(dp[k][l],dp[k-z][l-o]+1);
                }
            }
        }
        return dp[m][n];
    }
}