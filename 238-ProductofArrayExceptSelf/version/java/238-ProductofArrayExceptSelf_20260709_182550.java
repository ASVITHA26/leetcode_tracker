// Last updated: 09/07/2026, 18:25:50
1class Solution {
2    public boolean isHappy(int n) {
3        int d,sum;
4        while(n!=1 &&n!=4)
5        {
6            sum=0;
7            while(n!=0)
8            {
9                d=n%10;
10                sum=sum+(d*d);
11                n=n/10;
12            }
13            n=sum;
14        }
15        if(n==1)
16    return true;
17    else
18    return false;
19    }
20    
21}