// Last updated: 09/07/2026, 18:14:22
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int count=0;
4        for(int i=s.length()-1;i>=0;i--){
5           char ch=s.charAt(i);
6           char arr[]=new char[s.length()];
7            if(ch==' '&&count==0){
8                continue;
9            }
10           else if(ch!=' '){
11            count++;
12           }
13           else{
14            break;
15           }
16        }
17        return count;
18    }
19}