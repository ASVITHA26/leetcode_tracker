// Last updated: 09/07/2026, 09:13:32
class Solution {
    //test
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder rows[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int r=0;
        boolean d=true;
        for(int i=0;i<s.length();i++){
            rows[r].append(s.charAt(i));
            if(r==numRows-1){
                d=false;
            }
            else if(r==0){
                d=true;
            }
            if(d){
                r++;
            }
            else{
                r--;
            }
        }
        String a="";
        for(int i=0;i<numRows;i++){
            a+=rows[i].toString();
        }
        return a;
    }
}