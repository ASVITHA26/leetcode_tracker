// Last updated: 02/09/2026, 09:51:04
class Solution {
    public String convertToTitle(int s) {
        StringBuilder t=new StringBuilder();
        while(s>0){
            s--;
            t.append((char)('A'+(s%26)));
            s/=26;
        }
        return t.reverse().toString();
    }
}