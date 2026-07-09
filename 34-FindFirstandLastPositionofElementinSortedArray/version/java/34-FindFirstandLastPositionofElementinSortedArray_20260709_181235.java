// Last updated: 09/07/2026, 18:12:35
1class Solution {
2    public int strStr(String haystack, String needle) {
3      int m=haystack.length();
4      int n=needle.length();
5      if(n==0){
6        return 0;
7      }
8      for(int i=0;i<=m-n;i++){
9        if(haystack.substring(i,i+n).equals(needle)){
10            return i;
11        }
12      }
13      return -1;
14    }
15}