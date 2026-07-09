// Last updated: 09/07/2026, 09:13:26
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int s;
        s=x;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(s==rev)return true;
        else return false;
    }
}
