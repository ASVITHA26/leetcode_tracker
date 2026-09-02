// Last updated: 02/09/2026, 09:54:39
class Solution {
    public int divide(int dividend, int divisor) {
        int res;
        if(dividend==-2147483648 && divisor == -1)
        {
            return 2147483647;
        }
        res=dividend/divisor;
    return res;
    }
}